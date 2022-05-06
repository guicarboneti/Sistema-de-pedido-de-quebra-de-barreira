package controller;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import biblioteca.Aluno;
import biblioteca.Historico;
import biblioteca.Materia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import model.DadosRecebidosFormulario;
import view.VisualizacaoUsuario;

public class PedidoController implements ActionListener {
    private JTextField textNome;
    private JTextField textGrr;
    private JTextField textCaminho;
    private JTextArea textJustificativa;
    private JTextField textPeriodoAtual;
    private DadosRecebidosFormulario dados;
    private Aluno aluno;

    public PedidoController(JTextField textNome, JTextField textGrr,
            JTextArea textJustificativa, JTextField textPeriodoAtual, JTextField textCaminho,
            DadosRecebidosFormulario dados, Aluno aluno) {
        this.textNome = textNome;
        this.textGrr = textGrr;
        this.textCaminho = textCaminho;
        this.textJustificativa = textJustificativa;
        this.textPeriodoAtual = textPeriodoAtual;
        this.dados = dados;
        this.aluno = aluno;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Buscar")) {
            procuraArquivo();
        }
        if (cmd.equals("Enviar Pedido")) {
            enviar();
        }
    }

    public void procuraArquivo() {
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos .csv", "csv");

        String diretorioBase = System.getProperty("user.home");
        File dir = new File(diretorioBase);

        JFileChooser choose = new JFileChooser();
        choose.setCurrentDirectory(dir);
        choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
        choose.setAcceptAllFileFilterUsed(false);
        choose.addChoosableFileFilter(filtro);
        String caminhoArquivo = "";

        int retorno = choose.showSaveDialog(null);
        if (retorno == JFileChooser.APPROVE_OPTION) {
            caminhoArquivo = choose.getSelectedFile().getAbsolutePath();
            textCaminho.setText(caminhoArquivo);
        }
    }

    public void salvaDadosPedido() {
        this.dados.setGrr(this.textGrr.getText());
        this.dados.setJustificativa(this.textJustificativa.getText());
        this.dados.setNome(this.textNome.getText());
        this.dados.setPeriodoAtual(this.textPeriodoAtual.getText());
    }

    public void geraArquivoPedido(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("info-pedido.txt"));
        buffWrite.append("Nome: " + this.dados.getNome() + "\n");
        buffWrite.append("Ira: " + this.aluno.getIra() + "\n");
        buffWrite.append("Período Atual: " + this.dados.getPeriodoAtual() + "\n");
        buffWrite.append("GRR: " + this.dados.getGrr() + "\n");
        buffWrite.append("Justificativa: " + this.dados.getJustificativa() + "\n");
        buffWrite.append("Disciplinas solicitadas: " + this.dados.retornaMateriasSolicitadas() + "\n");

        buffWrite.close();

        // SET DA ENTRADA DA TELA
        aluno.setNome(this.dados.getNome());
        aluno.setPeriodo( Integer.parseInt(this.dados.getPeriodoAtual()));
        aluno.setGrr(this.dados.getGrr());

        VisualizacaoUsuario interfaceTela1 = new VisualizacaoUsuario(aluno, dados);
        interfaceTela1.getScreen(aluno, dados);
    }

    private void enviar() {
        JOptionPane.showMessageDialog(null, "Pedido enviado! Gerando arquivo de texto...");
        salvaDadosPedido();
        try {
            geraArquivoPedido("info-pedido.txt");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        textNome.setText("");
        textGrr.setText("");
        textCaminho.setText("");
        textJustificativa.setText("");
        textPeriodoAtual.setText("");
    }
}