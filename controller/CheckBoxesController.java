package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.DadosRecebidosFormulario;

public class CheckBoxesController implements ActionListener {
    private JCheckBox cB0;
    private JCheckBox cB1;
    private JCheckBox cB2;
    private JCheckBox cB3;
    private JCheckBox cB4;
    private JCheckBox cB5;
    private JCheckBox cB6;
    private JCheckBox cB7;
    private JCheckBox cB8;
    private JCheckBox cB9;
    private JCheckBox cB10;
    private JCheckBox cB11;
    private JCheckBox cB12;
    private JCheckBox cB13;
    private JCheckBox cB14;
    private JCheckBox cB15;
    private JCheckBox cB16;
    private JCheckBox cB17;
    private JCheckBox cB18;
    private JCheckBox cB19;
    private JCheckBox cB20;
    private JCheckBox cB21;
    private JCheckBox cB22;
    private JTextField textDiscip1;
    private JTextField textDiscip2;
    private ButtonGroup bgGrades;
    private ButtonGroup bgConflitos;
    private DadosRecebidosFormulario dados;

    public CheckBoxesController(JCheckBox cB0, JCheckBox cB1, JCheckBox cB2, JCheckBox cB3, JCheckBox cB4,
            JCheckBox cB5, JCheckBox cB6, JCheckBox cB7, JCheckBox cB8, JCheckBox cB9, JCheckBox cB10,
            JCheckBox cB11, JCheckBox cB12, JCheckBox cB13, JCheckBox cB14, JCheckBox cB15, JCheckBox cB16,
            JCheckBox cB17, JCheckBox cB18, JCheckBox cB19, JCheckBox cB20, JCheckBox cB21, JCheckBox cB22,
            JTextField textDiscip1, JTextField textDiscip2, ButtonGroup bgGrades, ButtonGroup bgConflitos,
            DadosRecebidosFormulario dados) {
        this.cB0 = cB0;
        this.cB1 = cB1;
        this.cB2 = cB2;
        this.cB3 = cB3;
        this.cB4 = cB4;
        this.cB5 = cB5;
        this.cB6 = cB6;
        this.cB7 = cB7;
        this.cB8 = cB8;
        this.cB9 = cB9;
        this.cB10 = cB10;
        this.cB11 = cB11;
        this.cB12 = cB12;
        this.cB13 = cB13;
        this.cB14 = cB14;
        this.cB15 = cB15;
        this.cB16 = cB16;
        this.cB17 = cB17;
        this.cB18 = cB18;
        this.cB19 = cB19;
        this.cB20 = cB20;
        this.cB21 = cB21;
        this.cB22 = cB22;
        this.textDiscip1 = textDiscip1;
        this.textDiscip2 = textDiscip2;
        this.bgGrades = bgGrades;
        this.bgConflitos = bgConflitos;
        this.dados = dados;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("Enviar Pedido")) {
            verificaMateriasSelecionadas();
            resetaEscolhas();
        }
    }

    private void verificaMateriasSelecionadas() {
        if (this.cB1.isSelected())
            this.dados.adicionaDisciplina("CI1059");
        if (this.cB2.isSelected())
            this.dados.adicionaDisciplina("CI1350");
        if (this.cB0.isSelected())
            this.dados.adicionaDisciplina("CI1165");
        if (this.cB3.isSelected())
            this.dados.adicionaDisciplina("CI1164");
        if (this.cB4.isSelected())
            this.dados.adicionaDisciplina("CI1062");
        if (this.cB5.isSelected())
            this.dados.adicionaDisciplina("CI1065");
        if (this.cB6.isSelected())
            this.dados.adicionaDisciplina("CI1058");
        if (this.cB7.isSelected())
            this.dados.adicionaDisciplina("CI1238");
        if (this.cB8.isSelected())
            this.dados.adicionaDisciplina("CI1162");
        if (this.cB9.isSelected())
            this.dados.adicionaDisciplina("CI1215");
        if (this.cB10.isSelected())
            this.dados.adicionaDisciplina("CI1209");
        if (this.cB11.isSelected())
            this.dados.adicionaDisciplina("CI1218");
        if (this.cB12.isSelected())
            this.dados.adicionaDisciplina("CI1061");
        if (this.cB13.isSelected())
            this.dados.adicionaDisciplina("CI1316");
        if (this.cB14.isSelected())
            this.dados.adicionaDisciplina("CI1163");
        if (this.cB15.isSelected())
            this.dados.adicionaDisciplina("CI1221");
        if (this.cB16.isSelected())
            this.dados.adicionaDisciplina("CI1007");
        if (this.cB17.isSelected())
            this.dados.adicionaDisciplina("CI1211");
        if (this.cB18.isSelected())
            this.dados.adicionaDisciplina("CI1005");
        if (this.cB19.isSelected())
            this.dados.adicionaDisciplina("CI1064");
        if (this.cB20.isSelected())
            this.dados.adicionaDisciplina("CI1100");
        if (this.cB21.isSelected())
            this.dados.adicionaDisciplina(this.textDiscip1.getText());
        if (this.cB22.isSelected())
            this.dados.adicionaDisciplina(this.textDiscip2.getText());
    }

    // public void guardaGradeAtual() {
    // ButtonModel retorno = bgGrades.getSelection();
    // if (retorno.equals("2011")) {
    // this.dados.setGradeAtual("2011");
    // } else {
    // this.dados.setGradeAtual("2019");
    // }
    // }

    private void resetaEscolhas() {
        this.cB0.setSelected(false);
        this.cB1.setSelected(false);
        this.cB2.setSelected(false);
        this.cB3.setSelected(false);
        this.cB4.setSelected(false);
        this.cB5.setSelected(false);
        this.cB6.setSelected(false);
        this.cB7.setSelected(false);
        this.cB8.setSelected(false);
        this.cB9.setSelected(false);
        this.cB10.setSelected(false);
        this.cB11.setSelected(false);
        this.cB12.setSelected(false);
        this.cB13.setSelected(false);
        this.cB14.setSelected(false);
        this.cB15.setSelected(false);
        this.cB16.setSelected(false);
        this.cB17.setSelected(false);
        this.cB18.setSelected(false);
        this.cB19.setSelected(false);
        this.cB20.setSelected(false);
        this.cB21.setSelected(false);
        this.cB22.setSelected(false);
        this.textDiscip1.setText("");
        this.textDiscip2.setText("");
        this.bgGrades.clearSelection();
        this.bgConflitos.clearSelection();
    }
}
