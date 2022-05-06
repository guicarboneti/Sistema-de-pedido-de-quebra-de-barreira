package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import biblioteca.Aluno;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.GridLayout;

import model.DadosRecebidosFormulario;

import controller.CheckBoxesController;
import controller.PedidoController;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class FormEdit extends JFrame {

    private JPanel contentPane;
    private JTextField txtNome;
    private JLabel lblGrr;
    private JTextField txtGrr;
    private JLabel lblGrade;
    private JLabel lblHistrico;
    private JButton btnBuscar;
    private JTextField txtCaminho;
    private JLabel lblPerodoAtual;
    private JTextField txtPeriodo;
    private JLabel lblQuaisDisciplinasVoc;

    /**
     * Launch the application.
     */
    public void formScreen(Aluno aluno, DadosRecebidosFormulario dados) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FormEdit frame = new FormEdit(aluno, dados);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public boolean confereMateria(String materia, DadosRecebidosFormulario dados){
        boolean encontrado = false;
        for (int i = 0; i < dados.retornaMateriasSolicitadas().size(); i++) {
            if (dados.retornaMateriasSolicitadas().get(i) == materia) {
                encontrado = true;
                break;
            }
         
        }
        return encontrado;
    }

    /**
     * Create the frame.
     */
    public FormEdit(Aluno aluno, DadosRecebidosFormulario dados) {
        setTitle("Pedido Quebra de Barreira");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1100, 644);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(Color.WHITE);
        panelPrincipal.setBounds(0, 0, 1100, 816);
        contentPane.add(panelPrincipal);
        panelPrincipal.setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setForeground(new Color(51, 51, 153));
        lblNome.setFont(new Font("Dialog", Font.BOLD, 19));
        lblNome.setBounds(36, 42, 97, 29);
        panelPrincipal.add(lblNome);
        
        txtNome = new JTextField();
        txtNome.setFont(new Font("Dialog", Font.PLAIN, 18));
        txtNome.setBounds(118, 42, 626, 29);
        txtNome.setText(aluno.getNome());
        panelPrincipal.add(txtNome);
        txtNome.setColumns(10);

        lblGrr = new JLabel("GRR: " + aluno.getGrr());
        lblGrr.setForeground(new Color(51, 51, 153));
        lblGrr.setFont(new Font("Dialog", Font.BOLD, 19));
        lblGrr.setBounds(807, 42, 60, 29);
        panelPrincipal.add(lblGrr);

        txtGrr = new JTextField();
        txtGrr.setFont(new Font("Dialog", Font.PLAIN, 18));
        txtGrr.setBounds(869, 42, 200, 29);
        txtGrr.setText(aluno.getGrr());
        panelPrincipal.add(txtGrr);
        txtGrr.setColumns(10);

        lblGrade = new JLabel("Grade que está cursando:");
        lblGrade.setForeground(new Color(51, 51, 153));
        lblGrade.setFont(new Font("Dialog", Font.BOLD, 19));
        lblGrade.setBounds(36, 102, 293, 29);
        panelPrincipal.add(lblGrade);

        JCheckBox cB_Ano1 = new JCheckBox("2011");
        cB_Ano1.setBackground(Color.WHITE);
        cB_Ano1.setFont(new Font("Dialog", Font.BOLD, 14));
        cB_Ano1.setBounds(328, 102, 68, 23);
        panelPrincipal.add(cB_Ano1);

        JCheckBox cB_Ano2 = new JCheckBox("2019");
        cB_Ano2.setFont(new Font("Dialog", Font.BOLD, 14));
        cB_Ano2.setBackground(Color.WHITE);
        cB_Ano2.setBounds(400, 102, 76, 23);
        panelPrincipal.add(cB_Ano2);

        ButtonGroup bgGrades = new ButtonGroup();
        bgGrades.add(cB_Ano1);
        bgGrades.add(cB_Ano2);

        lblHistrico = new JLabel("Histórico:");
        lblHistrico.setForeground(new Color(51, 51, 153));
        lblHistrico.setFont(new Font("Dialog", Font.BOLD, 19));
        lblHistrico.setBounds(495, 102, 120, 29);
        panelPrincipal.add(lblHistrico);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBackground(new Color(51, 204, 204));
        btnBuscar.setBounds(601, 100, 117, 30);
        panelPrincipal.add(btnBuscar);

        txtCaminho = new JTextField();
        txtCaminho.setBounds(720, 100, 85, 30);
        panelPrincipal.add(txtCaminho);
        txtCaminho.setColumns(10);

        lblPerodoAtual = new JLabel("Período Atual: " + aluno.getPeriodo());
        lblPerodoAtual.setForeground(new Color(51, 51, 153));
        lblPerodoAtual.setFont(new Font("Dialog", Font.BOLD, 19));
        lblPerodoAtual.setBounds(833, 102, 163, 29);
        panelPrincipal.add(lblPerodoAtual);

        txtPeriodo = new JTextField();
        txtPeriodo.setFont(new Font("Dialog", Font.PLAIN, 18));
        txtPeriodo.setBounds(999, 102, 60, 29);
        txtPeriodo.setText(String.valueOf(aluno.getPeriodo()));
        panelPrincipal.add(txtPeriodo);
        txtPeriodo.setColumns(10);

        lblQuaisDisciplinasVoc = new JLabel("Quais Disciplinas você quer solicitar?");
        lblQuaisDisciplinasVoc.setForeground(new Color(51, 51, 153));
        lblQuaisDisciplinasVoc.setFont(new Font("Dialog", Font.BOLD, 19));
        lblQuaisDisciplinasVoc.setBounds(36, 145, 411, 23);
        panelPrincipal.add(lblQuaisDisciplinasVoc);

        JCheckBox chckbxCi_1 = new JCheckBox("CI1059", confereMateria("CI1059", dados));

        chckbxCi_1.setBackground(Color.WHITE);
        chckbxCi_1.setBounds(39, 186, 74, 23);
        panelPrincipal.add(chckbxCi_1);

        JCheckBox chckbxCi_2 = new JCheckBox("CI1350", confereMateria("CI1350", dados));
        chckbxCi_2.setBackground(Color.WHITE);
        chckbxCi_2.setBounds(39, 226, 74, 23);
        panelPrincipal.add(chckbxCi_2);

        JCheckBox chckbxCi = new JCheckBox("CI1165", confereMateria("CI1165", dados));
        chckbxCi.setBackground(Color.WHITE);
        chckbxCi.setBounds(39, 266, 85, 23);
        panelPrincipal.add(chckbxCi);

        JCheckBox chckbxCi_3 = new JCheckBox("CI1164", confereMateria("CI1164", dados));
        chckbxCi_3.setBackground(Color.WHITE);
        chckbxCi_3.setBounds(39, 306, 85, 23);
        panelPrincipal.add(chckbxCi_3);

        JCheckBox chckbxCi_4 = new JCheckBox("CI1062", confereMateria("CI1062", dados));
        chckbxCi_4.setBackground(Color.WHITE);
        chckbxCi_4.setBounds(39, 346, 74, 23);
        panelPrincipal.add(chckbxCi_4);

        JCheckBox chckbxCi_5 = new JCheckBox("CI1065", confereMateria("CI1065", dados));
        chckbxCi_5.setBackground(Color.WHITE);
        chckbxCi_5.setBounds(174, 186, 74, 23);
        panelPrincipal.add(chckbxCi_5);

        JCheckBox chckbxCi_6 = new JCheckBox("CI1058", confereMateria("CI1058", dados));
        chckbxCi_6.setBackground(Color.WHITE);
        chckbxCi_6.setBounds(174, 226, 74, 23);
        panelPrincipal.add(chckbxCi_6);

        JCheckBox chckbxCi_7 = new JCheckBox("CI1238", confereMateria("CI1238", dados));
        chckbxCi_7.setBackground(Color.WHITE);
        chckbxCi_7.setBounds(174, 266, 74, 23);
        panelPrincipal.add(chckbxCi_7);

        JCheckBox chckbxCi_8 = new JCheckBox("CI1162", confereMateria("CI1162", dados));
        chckbxCi_8.setBackground(Color.WHITE);
        chckbxCi_8.setBounds(174, 306, 74, 23);
        panelPrincipal.add(chckbxCi_8);

        JCheckBox chckbxCi_9 = new JCheckBox("CI1215", confereMateria("CI1215", dados));
        chckbxCi_9.setBackground(Color.WHITE);
        chckbxCi_9.setBounds(174, 346, 74, 23);
        panelPrincipal.add(chckbxCi_9);

        JCheckBox chckbxCi_10 = new JCheckBox("CI1209", confereMateria("CI1209", dados));
        chckbxCi_10.setBackground(Color.WHITE);
        chckbxCi_10.setBounds(304, 186, 74, 23);
        panelPrincipal.add(chckbxCi_10);

        JCheckBox chckbxCi_11 = new JCheckBox("CI1218", confereMateria("CI1218", dados));
        chckbxCi_11.setBackground(Color.WHITE);
        chckbxCi_11.setBounds(304, 226, 74, 23);
        panelPrincipal.add(chckbxCi_11);

        JCheckBox chckbxCi_12 = new JCheckBox("CI1061", confereMateria("CI1061", dados));
        chckbxCi_12.setBackground(Color.WHITE);
        chckbxCi_12.setBounds(304, 266, 74, 23);
        panelPrincipal.add(chckbxCi_12);

        JCheckBox chckbxCi_13 = new JCheckBox("CI1316", confereMateria("CI1316", dados));
        chckbxCi_13.setBackground(Color.WHITE);
        chckbxCi_13.setBounds(304, 306, 74, 23);
        panelPrincipal.add(chckbxCi_13);

        JCheckBox chckbxCi_14 = new JCheckBox("CI1163", confereMateria("CI1163", dados));
        chckbxCi_14.setBackground(Color.WHITE);
        chckbxCi_14.setBounds(304, 346, 74, 23);
        panelPrincipal.add(chckbxCi_14);

        JCheckBox chckbxCi_15 = new JCheckBox("CI1221", confereMateria("CI1221", dados));
        chckbxCi_15.setBackground(Color.WHITE);
        chckbxCi_15.setBounds(446, 186, 74, 23);
        panelPrincipal.add(chckbxCi_15);

        JCheckBox chckbxCi_16 = new JCheckBox("CI1007", confereMateria("CI1007", dados));
        chckbxCi_16.setBackground(Color.WHITE);
        chckbxCi_16.setBounds(446, 226, 85, 23);
        panelPrincipal.add(chckbxCi_16);

        JCheckBox chckbxCi_17 = new JCheckBox("CI1211", confereMateria("CI1211", dados));
        chckbxCi_17.setBackground(Color.WHITE);
        chckbxCi_17.setBounds(446, 266, 85, 23);
        panelPrincipal.add(chckbxCi_17);

        JCheckBox chckbxCi_18 = new JCheckBox("CI1005", confereMateria("CI1005", dados));
        chckbxCi_18.setBackground(Color.WHITE);
        chckbxCi_18.setBounds(446, 306, 74, 23);
        panelPrincipal.add(chckbxCi_18);

        JCheckBox chckbxCi_19 = new JCheckBox("CI1064", confereMateria("CI1064", dados));
        chckbxCi_19.setBackground(Color.WHITE);
        chckbxCi_19.setBounds(446, 346, 74, 23);
        panelPrincipal.add(chckbxCi_19);

        JCheckBox chckbxCi_20 = new JCheckBox("CI1100", confereMateria("CI1100", dados));
        chckbxCi_20.setBackground(Color.WHITE);
        chckbxCi_20.setBounds(570, 186, 129, 23);
        panelPrincipal.add(chckbxCi_20);

        JCheckBox chckbxCi_21 = new JCheckBox();
        chckbxCi_21.setBackground(Color.WHITE);
        chckbxCi_21.setBounds(570, 226, 23, 23);
        panelPrincipal.add(chckbxCi_21);

        JTextField textDiscip1 = new JTextField();
        textDiscip1.setBounds(593, 226, 55, 19);
        panelPrincipal.add(textDiscip1);
        textDiscip1.setColumns(10);

        JCheckBox chckbxCi_22 = new JCheckBox();
        chckbxCi_22.setBackground(Color.WHITE);
        chckbxCi_22.setBounds(570, 266, 23, 23);
        panelPrincipal.add(chckbxCi_22);

        JTextField textDiscip2 = new JTextField();
        textDiscip2.setBounds(593, 266, 55, 19);
        panelPrincipal.add(textDiscip2);
        textDiscip2.setColumns(10);

        JLabel lblJustificativa = new JLabel("Justifique seus pedidos e");
        lblJustificativa.setForeground(new Color(51, 51, 153));
        lblJustificativa.setFont(new Font("Dialog", Font.BOLD, 18));
        lblJustificativa.setBounds(730, 151, 339, 20);
        
        panelPrincipal.add(lblJustificativa);

        JLabel lblInformeAOrdem = new JLabel("informe a ordem de prioridade");
        lblInformeAOrdem.setForeground(new Color(51, 51, 153));
        lblInformeAOrdem.setFont(new Font("Dialog", Font.BOLD, 18));
        lblInformeAOrdem.setBounds(729, 179, 329, 15);
        panelPrincipal.add(lblInformeAOrdem);

        JLabel lblDeCadaUm = new JLabel("de cada um:");
        lblDeCadaUm.setForeground(new Color(51, 51, 153));
        lblDeCadaUm.setFont(new Font("Dialog", Font.BOLD, 18));
        lblDeCadaUm.setBounds(728, 201, 139, 15);
        panelPrincipal.add(lblDeCadaUm);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(730, 234, 329, 229);
        panelPrincipal.add(scrollPane);

        JTextArea txtaJustificativa = new JTextArea();
        txtaJustificativa.setFont(new Font("Dialog", Font.PLAIN, 16));
        txtaJustificativa.setText(dados.getJustificativa());
        scrollPane.setViewportView(txtaJustificativa);

        JLabel lblTemCondiesDe = new JLabel("Tem condições de se matricular nesta(s) disciplinas, sem colisão");
        lblTemCondiesDe.setForeground(new Color(51, 51, 153));
        lblTemCondiesDe.setFont(new Font("Dialog", Font.BOLD, 18));
        lblTemCondiesDe.setBounds(36, 417, 682, 15);
        panelPrincipal.add(lblTemCondiesDe);

        JLabel lblDeHorrioCom = new JLabel("de horário com disciplinas já matriculado?");
        lblDeHorrioCom.setForeground(new Color(51, 51, 153));
        lblDeHorrioCom.setFont(new Font("Dialog", Font.BOLD, 18));
        lblDeHorrioCom.setBounds(36, 443, 440, 15);
        panelPrincipal.add(lblDeHorrioCom);

        JCheckBox cB_Sim = new JCheckBox("Sim");
        cB_Sim.setFont(new Font("Dialog", Font.BOLD, 14));
        cB_Sim.setBackground(Color.WHITE);
        cB_Sim.setBounds(486, 443, 55, 23);
        panelPrincipal.add(cB_Sim);

        JCheckBox cB_No = new JCheckBox("Não");
        cB_No.setFont(new Font("Dialog", Font.BOLD, 14));
        cB_No.setBackground(Color.WHITE);
        cB_No.setBounds(553, 443, 60, 23);
        panelPrincipal.add(cB_No);

        ButtonGroup bgSemConflitos = new ButtonGroup();
        bgSemConflitos.add(cB_Sim);
        bgSemConflitos.add(cB_No);

        JButton btnEnviarPedido = new JButton("Enviar Pedido");
        btnEnviarPedido.setFont(new Font("Dialog", Font.BOLD, 15));
        btnEnviarPedido.setBackground(new Color(51, 204, 204));
        btnEnviarPedido.setBounds(495, 516, 153, 70);
        panelPrincipal.add(btnEnviarPedido);

        dados = new DadosRecebidosFormulario();

        PedidoController pedido = new PedidoController(txtNome, txtGrr, txtaJustificativa, txtPeriodo, txtCaminho, dados,aluno);
        btnBuscar.addActionListener(pedido);
        btnEnviarPedido.addActionListener(pedido);

        CheckBoxesController boxes = new CheckBoxesController(chckbxCi, chckbxCi_1, chckbxCi_2, chckbxCi_3, chckbxCi_4,
                chckbxCi_5, chckbxCi_6, chckbxCi_7, chckbxCi_8, chckbxCi_9, chckbxCi_10, chckbxCi_11, chckbxCi_12,
                chckbxCi_13, chckbxCi_14, chckbxCi_15, chckbxCi_16, chckbxCi_17, chckbxCi_18, chckbxCi_19, chckbxCi_20,
                chckbxCi_21, chckbxCi_22, textDiscip1, textDiscip2, bgGrades, bgSemConflitos, dados);
        btnEnviarPedido.addActionListener(boxes);

        // btnEnviarPedido.addActionListener(txtNome);

    }

    public String getNome() {
        return this.txtNome.getText();
    }
}
