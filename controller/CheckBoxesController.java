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

public class CheckBoxesController implements ActionListener{
	private JCheckBox cB_0;
    private JCheckBox cB_1;
    private JCheckBox cB_2;
    private JCheckBox cB_3;
    private JCheckBox cB_4;
    private JCheckBox cB_5;
    private JCheckBox cB_6;
    private JCheckBox cB_7;
    private JCheckBox cB_8;
    private JCheckBox cB_9;
    private JCheckBox cB_10;
    private JCheckBox cB_11;
    private JCheckBox cB_12;
    private JCheckBox cB_13;
    private JCheckBox cB_14;
    private JCheckBox cB_15;
    private JCheckBox cB_16;
    private JCheckBox cB_17;
    private JCheckBox cB_18;
    private JCheckBox cB_19;
    private JCheckBox cB_20;
    private JCheckBox cB_21;
    private JCheckBox cB_22;
    private JTextField textDiscip1;
    private JTextField textDiscip2;
    private ButtonGroup bgGrades;
    private ButtonGroup bgConflitos;
    private DadosRecebidosFormulario dados;
    
	public CheckBoxesController(JCheckBox cB_0, JCheckBox cB_1, JCheckBox cB_2, JCheckBox cB_3, JCheckBox cB_4,
			JCheckBox cB_5, JCheckBox cB_6, JCheckBox cB_7, JCheckBox cB_8, JCheckBox cB_9, JCheckBox cB_10,
			JCheckBox cB_11, JCheckBox cB_12, JCheckBox cB_13, JCheckBox cB_14, JCheckBox cB_15, JCheckBox cB_16,
			JCheckBox cB_17, JCheckBox cB_18, JCheckBox cB_19, JCheckBox cB_20, JCheckBox cB_21, JCheckBox cB_22,
			JTextField textDiscip1, JTextField textDiscip2, ButtonGroup bgGrades, ButtonGroup bgConflitos) {
		this.cB_0 = cB_0;
		this.cB_1 = cB_1;
		this.cB_2 = cB_2;
		this.cB_3 = cB_3;
		this.cB_4 = cB_4;
		this.cB_5 = cB_5;
		this.cB_6 = cB_6;
		this.cB_7 = cB_7;
		this.cB_8 = cB_8;
		this.cB_9 = cB_9;
		this.cB_10 = cB_10;
		this.cB_11 = cB_11;
		this.cB_12 = cB_12;
		this.cB_13 = cB_13;
		this.cB_14 = cB_14;
		this.cB_15 = cB_15;
		this.cB_16 = cB_16;
		this.cB_17 = cB_17;
		this.cB_18 = cB_18;
		this.cB_19 = cB_19;
		this.cB_20 = cB_20;
		this.cB_21 = cB_21;
		this.cB_22 = cB_22;
		this.textDiscip1 = textDiscip1;
		this.textDiscip2 = textDiscip2;
		this.bgGrades = bgGrades;
		this.bgConflitos = bgConflitos;
		dados  = new DadosRecebidosFormulario();
	}
    
	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if(button.equals("Enviar Pedido")) {
			verificaMateriasSelecionadas();
			guardaGradeAtual();
			resetaEscolhas();
		}
	}
	
	 private void verificaMateriasSelecionadas() {
	        if (this.cB_1.isSelected())
	            dados.adicionaDisciplina("CI1059");
	        if (this.cB_2.isSelected())
	            dados.adicionaDisciplina("CI1350");
	        if (this.cB_0.isSelected())
	            dados.adicionaDisciplina("CI1165");
	        if (this.cB_3.isSelected())
	            dados.adicionaDisciplina("CI1164");
	        if (this.cB_4.isSelected())
	            dados.adicionaDisciplina("CI1062");
	        if (this.cB_5.isSelected())
	            dados.adicionaDisciplina("CI1065");
	        if (this.cB_6.isSelected())
	            dados.adicionaDisciplina("CI1058");
	        if (this.cB_7.isSelected())
	            dados.adicionaDisciplina("CI1238");
	        if (this.cB_8.isSelected())
	            dados.adicionaDisciplina("CI1162");
	        if (this.cB_9.isSelected())
	            dados.adicionaDisciplina("CI1215");
	        if (this.cB_10.isSelected())
	            dados.adicionaDisciplina("CI1209");
	        if (this.cB_11.isSelected())
	            dados.adicionaDisciplina("CI1218");
	        if (this.cB_12.isSelected())
	            dados.adicionaDisciplina("CI1061");
	        if (this.cB_13.isSelected())
	            dados.adicionaDisciplina("CI1316");
	        if (this.cB_14.isSelected())
	            dados.adicionaDisciplina("CI1163");
	        if (this.cB_15.isSelected())
	            dados.adicionaDisciplina("CI1221");
	        if (this.cB_16.isSelected())
	            dados.adicionaDisciplina("CI1007");
	        if (this.cB_17.isSelected())
	            dados.adicionaDisciplina("CI1211");
	        if (this.cB_18.isSelected())
	            dados.adicionaDisciplina("CI1005");
	        if (this.cB_19.isSelected())
	            dados.adicionaDisciplina("CI1064");
	        if (this.cB_20.isSelected())
	            dados.adicionaDisciplina("CI1100");
	        if (this.cB_21.isSelected())
	            dados.adicionaDisciplina(this.textDiscip1.getText());
	        if (this.cB_22.isSelected())
	            dados.adicionaDisciplina(this.textDiscip2.getText());
	 }
	 
	 public void guardaGradeAtual() {
		 ButtonModel retorno = bgGrades.getSelection();
		 if (retorno.equals("2011")) {
			 dados.setGradeAtual("2011");
		 } else {
			 dados.setGradeAtual("2019");
	     }
	 }
	 
	 private void resetaEscolhas() {
		 this.cB_0.setSelected(false);
	     this.cB_1.setSelected(false);
	     this.cB_2.setSelected(false);
	     this.cB_3.setSelected(false);
	     this.cB_4.setSelected(false);
	     this.cB_5.setSelected(false);
	     this.cB_6.setSelected(false);
	     this.cB_7.setSelected(false);
	     this.cB_8.setSelected(false);
	     this.cB_9.setSelected(false);
	     this.cB_10.setSelected(false);
	     this.cB_11.setSelected(false);
	     this.cB_12.setSelected(false);
	     this.cB_13.setSelected(false);
	     this.cB_14.setSelected(false);
	     this.cB_15.setSelected(false);
	     this.cB_16.setSelected(false);
	     this.cB_17.setSelected(false);
	     this.cB_18.setSelected(false);
	     this.cB_19.setSelected(false);
	     this.cB_20.setSelected(false);
	     this.cB_21.setSelected(false);
	     this.cB_22.setSelected(false);
	     this.textDiscip1.setText("");
	     this.textDiscip2.setText("");
	     this.bgGrades.clearSelection();
	     this.bgConflitos.clearSelection();
	 }
}
