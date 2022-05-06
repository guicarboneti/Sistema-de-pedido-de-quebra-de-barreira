package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FormEdit;
import biblioteca.Aluno;
import java.io.*;
import java.awt.Desktop;
import model.DadosRecebidosFormulario;

public class BotoesSegTelaController implements ActionListener {
    private Aluno aluno;
    private DadosRecebidosFormulario dados;

    public BotoesSegTelaController(Aluno aluno, DadosRecebidosFormulario dados) {
        this.dados = dados;
        this.aluno = aluno;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Editar Pedido")) {
            FormEdit interfaceFormulario = new FormEdit(aluno, dados);
            interfaceFormulario.setVisible(true);
        }
        if (cmd.equals("Ver Pedido")) {
            try {
                File myFile = new File("./info-pedido.txt");
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                System.out.println("Erro ao abrir arquivo");
            }
        }
    }

}
