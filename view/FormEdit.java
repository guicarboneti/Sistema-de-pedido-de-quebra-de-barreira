package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import biblioteca.Aluno;
import java.awt.Color;
import javax.swing.JScrollPane;
import model.DadosRecebidosFormulario;

import controller.CheckBoxesController;
import controller.PedidoController;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
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

    public boolean confereMateria(String materia, DadosRecebidosFormulario dados) {
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
        txtNome.setBorder(null);
        panelPrincipal.add(txtNome);
        txtNome.setColumns(10);

        lblGrr = new JLabel("GRR: ");
        lblGrr.setForeground(new Color(51, 51, 153));
        lblGrr.setFont(new Font("Dialog", Font.BOLD, 18));
        lblGrr.setBounds(807, 42, 65, 29);
        panelPrincipal.add(lblGrr);

        txtGrr = new JTextField();
        txtGrr.setFont(new Font("Dialog", Font.PLAIN, 18));
        txtGrr.setBounds(875, 42, 150, 29);
        txtGrr.setText(aluno.getGrr());
        txtGrr.setBorder(null);
        panelPrincipal.add(txtGrr);
        txtGrr.setColumns(10);

        lblGrade = new JLabel("Grade que está cursando:");
        lblGrade.setForeground(new Color(51, 51, 153));
        lblGrade.setFont(new Font("Dialog", Font.BOLD, 19));
        lblGrade.setBounds(36, 102, 293, 29);
        panelPrincipal.add(lblGrade);

        JCheckBox cBAno1 = new JCheckBox("2011");
        cBAno1.setBackground(Color.WHITE);
        cBAno1.setFont(new Font("Dialog", Font.BOLD, 14));
        cBAno1.setBounds(328, 102, 68, 23);
        panelPrincipal.add(cBAno1);

        JCheckBox cBAno2 = new JCheckBox("2019");
        cBAno2.setFont(new Font("Dialog", Font.BOLD, 14));
        cBAno2.setBackground(Color.WHITE);
        cBAno2.setBounds(400, 102, 76, 23);
        panelPrincipal.add(cBAno2);

        ButtonGroup bgGrades = new ButtonGroup();
        bgGrades.add(cBAno1);
        bgGrades.add(cBAno2);

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

        lblPerodoAtual = new JLabel("Período Atual: ");
        lblPerodoAtual.setForeground(new Color(51, 51, 153));
        lblPerodoAtual.setFont(new Font("Dialog", Font.BOLD, 18));
        lblPerodoAtual.setBounds(833, 102, 170, 29);
        panelPrincipal.add(lblPerodoAtual);

        txtPeriodo = new JTextField();
        txtPeriodo.setFont(new Font("Dialog", Font.PLAIN, 18));
        txtPeriodo.setBounds(1004, 102, 60, 29);
        txtPeriodo.setText(String.valueOf(aluno.getPeriodo()));
        txtPeriodo.setBorder(null);
        panelPrincipal.add(txtPeriodo);
        txtPeriodo.setColumns(10);

        lblQuaisDisciplinasVoc = new JLabel("Quais Disciplinas você quer solicitar?");
        lblQuaisDisciplinasVoc.setForeground(new Color(51, 51, 153));
        lblQuaisDisciplinasVoc.setFont(new Font("Dialog", Font.BOLD, 19));
        lblQuaisDisciplinasVoc.setBounds(36, 145, 411, 23);
        panelPrincipal.add(lblQuaisDisciplinasVoc);

        JCheckBox chckbxCi1 = new JCheckBox("CI1059", confereMateria("CI1059", dados));

        chckbxCi1.setBackground(Color.WHITE);
        chckbxCi1.setBounds(39, 186, 74, 23);
        panelPrincipal.add(chckbxCi1);

        JCheckBox chckbxCi2 = new JCheckBox("CI1350", confereMateria("CI1350", dados));
        chckbxCi2.setBackground(Color.WHITE);
        chckbxCi2.setBounds(39, 226, 74, 23);
        panelPrincipal.add(chckbxCi2);

        JCheckBox chckbxCi = new JCheckBox("CI1165", confereMateria("CI1165", dados));
        chckbxCi.setBackground(Color.WHITE);
        chckbxCi.setBounds(39, 266, 85, 23);
        panelPrincipal.add(chckbxCi);

        JCheckBox chckbxCi3 = new JCheckBox("CI1164", confereMateria("CI1164", dados));
        chckbxCi3.setBackground(Color.WHITE);
        chckbxCi3.setBounds(39, 306, 85, 23);
        panelPrincipal.add(chckbxCi3);

        JCheckBox chckbxCi4 = new JCheckBox("CI1062", confereMateria("CI1062", dados));
        chckbxCi4.setBackground(Color.WHITE);
        chckbxCi4.setBounds(39, 346, 74, 23);
        panelPrincipal.add(chckbxCi4);

        JCheckBox chckbxCi5 = new JCheckBox("CI1065", confereMateria("CI1065", dados));
        chckbxCi5.setBackground(Color.WHITE);
        chckbxCi5.setBounds(174, 186, 74, 23);
        panelPrincipal.add(chckbxCi5);

        JCheckBox chckbxCi6 = new JCheckBox("CI1058", confereMateria("CI1058", dados));
        chckbxCi6.setBackground(Color.WHITE);
        chckbxCi6.setBounds(174, 226, 74, 23);
        panelPrincipal.add(chckbxCi6);

        JCheckBox chckbxCi7 = new JCheckBox("CI1238", confereMateria("CI1238", dados));
        chckbxCi7.setBackground(Color.WHITE);
        chckbxCi7.setBounds(174, 266, 74, 23);
        panelPrincipal.add(chckbxCi7);

        JCheckBox chckbxCi8 = new JCheckBox("CI1162", confereMateria("CI1162", dados));
        chckbxCi8.setBackground(Color.WHITE);
        chckbxCi8.setBounds(174, 306, 74, 23);
        panelPrincipal.add(chckbxCi8);

        JCheckBox chckbxCi9 = new JCheckBox("CI1215", confereMateria("CI1215", dados));
        chckbxCi9.setBackground(Color.WHITE);
        chckbxCi9.setBounds(174, 346, 74, 23);
        panelPrincipal.add(chckbxCi9);

        JCheckBox chckbxCi10 = new JCheckBox("CI1209", confereMateria("CI1209", dados));
        chckbxCi10.setBackground(Color.WHITE);
        chckbxCi10.setBounds(304, 186, 74, 23);
        panelPrincipal.add(chckbxCi10);

        JCheckBox chckbxCi11 = new JCheckBox("CI1218", confereMateria("CI1218", dados));
        chckbxCi11.setBackground(Color.WHITE);
        chckbxCi11.setBounds(304, 226, 74, 23);
        panelPrincipal.add(chckbxCi11);

        JCheckBox chckbxCi12 = new JCheckBox("CI1061", confereMateria("CI1061", dados));
        chckbxCi12.setBackground(Color.WHITE);
        chckbxCi12.setBounds(304, 266, 74, 23);
        panelPrincipal.add(chckbxCi12);

        JCheckBox chckbxCi13 = new JCheckBox("CI1316", confereMateria("CI1316", dados));
        chckbxCi13.setBackground(Color.WHITE);
        chckbxCi13.setBounds(304, 306, 74, 23);
        panelPrincipal.add(chckbxCi13);

        JCheckBox chckbxCi14 = new JCheckBox("CI1163", confereMateria("CI1163", dados));
        chckbxCi14.setBackground(Color.WHITE);
        chckbxCi14.setBounds(304, 346, 74, 23);
        panelPrincipal.add(chckbxCi14);

        JCheckBox chckbxCi15 = new JCheckBox("CI1221", confereMateria("CI1221", dados));
        chckbxCi15.setBackground(Color.WHITE);
        chckbxCi15.setBounds(446, 186, 74, 23);
        panelPrincipal.add(chckbxCi15);

        JCheckBox chckbxCi16 = new JCheckBox("CI1007", confereMateria("CI1007", dados));
        chckbxCi16.setBackground(Color.WHITE);
        chckbxCi16.setBounds(446, 226, 85, 23);
        panelPrincipal.add(chckbxCi16);

        JCheckBox chckbxCi17 = new JCheckBox("CI1211", confereMateria("CI1211", dados));
        chckbxCi17.setBackground(Color.WHITE);
        chckbxCi17.setBounds(446, 266, 85, 23);
        panelPrincipal.add(chckbxCi17);

        JCheckBox chckbxCi18 = new JCheckBox("CI1005", confereMateria("CI1005", dados));
        chckbxCi18.setBackground(Color.WHITE);
        chckbxCi18.setBounds(446, 306, 74, 23);
        panelPrincipal.add(chckbxCi18);

        JCheckBox chckbxCi19 = new JCheckBox("CI1064", confereMateria("CI1064", dados));
        chckbxCi19.setBackground(Color.WHITE);
        chckbxCi19.setBounds(446, 346, 74, 23);
        panelPrincipal.add(chckbxCi19);

        JCheckBox chckbxCi20 = new JCheckBox("CI1100", confereMateria("CI1100", dados));
        chckbxCi20.setBackground(Color.WHITE);
        chckbxCi20.setBounds(570, 186, 129, 23);
        panelPrincipal.add(chckbxCi20);

        JCheckBox chckbxCi21 = new JCheckBox();
        chckbxCi21.setBackground(Color.WHITE);
        chckbxCi21.setBounds(570, 226, 23, 23);
        panelPrincipal.add(chckbxCi21);

        JTextField textDiscip1 = new JTextField();
        textDiscip1.setBounds(593, 226, 55, 19);
        panelPrincipal.add(textDiscip1);
        textDiscip1.setColumns(10);

        JCheckBox chckbxCi22 = new JCheckBox();
        chckbxCi22.setBackground(Color.WHITE);
        chckbxCi22.setBounds(570, 266, 23, 23);
        panelPrincipal.add(chckbxCi22);

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

        JCheckBox cBSim = new JCheckBox("Sim");
        cBSim.setFont(new Font("Dialog", Font.BOLD, 14));
        cBSim.setBackground(Color.WHITE);
        cBSim.setBounds(486, 443, 55, 23);
        panelPrincipal.add(cBSim);

        JCheckBox cBNo = new JCheckBox("Não");
        cBNo.setFont(new Font("Dialog", Font.BOLD, 14));
        cBNo.setBackground(Color.WHITE);
        cBNo.setBounds(553, 443, 60, 23);
        panelPrincipal.add(cBNo);

        ButtonGroup bgSemConflitos = new ButtonGroup();
        bgSemConflitos.add(cBSim);
        bgSemConflitos.add(cBNo);

        JButton btnEnviarPedido = new JButton("Enviar Pedido");
        btnEnviarPedido.setFont(new Font("Dialog", Font.BOLD, 15));
        btnEnviarPedido.setBackground(new Color(51, 204, 204));
        btnEnviarPedido.setBounds(495, 516, 153, 70);
        panelPrincipal.add(btnEnviarPedido);

        dados = new DadosRecebidosFormulario();

        PedidoController pedido = new PedidoController(txtNome, txtGrr, txtaJustificativa, txtPeriodo, txtCaminho,
                dados, aluno);
        btnBuscar.addActionListener(pedido);
        btnEnviarPedido.addActionListener(pedido);

        CheckBoxesController boxes = new CheckBoxesController(chckbxCi, chckbxCi1, chckbxCi2, chckbxCi3, chckbxCi4,
                chckbxCi5, chckbxCi6, chckbxCi7, chckbxCi8, chckbxCi9, chckbxCi10, chckbxCi11, chckbxCi12,
                chckbxCi13, chckbxCi14, chckbxCi15, chckbxCi16, chckbxCi17, chckbxCi18, chckbxCi19, chckbxCi20,
                chckbxCi21, chckbxCi22, textDiscip1, textDiscip2, bgGrades, bgSemConflitos, dados);
        btnEnviarPedido.addActionListener(boxes);

    }

    public String getNome() {
        return this.txtNome.getText();
    }
}
