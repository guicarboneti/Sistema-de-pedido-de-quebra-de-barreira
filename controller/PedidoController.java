package controller;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import model.DadosRecebidosFormulario;

public class PedidoController implements ActionListener{
	private JTextField textNome;
    private JTextField textGrr;
    private JTextField textCaminho;
    private JTextArea textJustificativa;
    private JTextField textPeriodoAtual;
    private DadosRecebidosFormulario dados;
    
	public PedidoController(JTextField textNome, JTextField textGrr,
			JTextArea textJustificativa, JTextField textPeriodoAtual, JTextField textCaminho) {
		this.textNome = textNome;
		this.textGrr = textGrr;
		this.textCaminho = textCaminho;
		this.textJustificativa = textJustificativa;
		this.textPeriodoAtual = textPeriodoAtual;
		dados = new DadosRecebidosFormulario();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("Buscar")) {
			procuraArquivo();
		}
		if(cmd.equals("Enviar Pedido")) {
			guardarValores();
			enviar();
		}
	}
	
	private void procuraArquivo() {
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
            this.textCaminho.setText(caminhoArquivo);
            dados.setCaminho(caminhoArquivo);
        }
    }
	
	private void guardarValores() {
		dados.setNome(this.textNome.getText());
		dados.setGrr(this.textGrr.getText());
		dados.setJustificativa(this.textJustificativa.getText());
		dados.setPeriodoAtual(this.textPeriodoAtual.getText());
	}
	
	private void enviar() {
		JOptionPane.showMessageDialog(null, "Pedido enviado! FAZER OUTRA TELA.");
        this.textNome.setText("");
        this.textGrr.setText("");
        this.textCaminho.setText("");
        this.textJustificativa.setText("");
        this.textPeriodoAtual.setText("");
        this.textJustificativa.setText("");
	}
	
	
}