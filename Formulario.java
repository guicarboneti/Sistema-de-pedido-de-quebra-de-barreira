import java.awt.EventQueue;

import controller.CheckBoxesController;
import controller.PedidoController;
import model.DadosRecebidosFormulario;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.NumberFormatter;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Formulario {
    private JFrame frame;
    private final JPanel panel = new JPanel();
    private JTextField textField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Formulario window = new Formulario();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Formulario() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setBackground(Color.WHITE);
        frame.setBounds(100, 100, 1290, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNome = new JLabel("Nome: ");
        lblNome.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
        lblNome.setForeground(SystemColor.activeCaption);
        lblNome.setBounds(50, 209, 100, 29);
        frame.getContentPane().add(lblNome);

        JTextField textNome = new JTextField();
        textNome.setBounds(120, 209, 626, 29);
        frame.getContentPane().add(textNome);
        textNome.setColumns(10);

        JLabel lblGrr = new JLabel("GRR:");
        lblGrr.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
        lblGrr.setForeground(SystemColor.activeCaption);
        lblGrr.setBounds(795, 209, 60, 29);
        frame.getContentPane().add(lblGrr);

        JTextField textGrr = new JTextField();
        textGrr.setBounds(845, 209, 387, 29);
        frame.getContentPane().add(textGrr);
        textGrr.setColumns(10);

        JLabel lblGradeQueEst = new JLabel("Grade que está matriculado:");
        lblGradeQueEst.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
        lblGradeQueEst.setForeground(SystemColor.activeCaption);
        lblGradeQueEst.setBounds(56, 291, 318, 29);
        frame.getContentPane().add(lblGradeQueEst);

        JCheckBox cB_Grade1 = new JCheckBox("2011");
        cB_Grade1.setBackground(Color.WHITE);
        cB_Grade1.setHorizontalAlignment(SwingConstants.LEFT);
        cB_Grade1.setBounds(345, 294, 70, 23);
        frame.getContentPane().add(cB_Grade1);

        JCheckBox cB_Grade2 = new JCheckBox("2019");
        cB_Grade2.setBackground(Color.WHITE);
        cB_Grade2.setBounds(424, 294, 70, 23);
        frame.getContentPane().add(cB_Grade2);

        ButtonGroup bgGrades = new ButtonGroup();
        bgGrades.add(cB_Grade1);
        bgGrades.add(cB_Grade2);

        JLabel lblHistrico = new JLabel("Histórico:");
        lblHistrico.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
        lblHistrico.setForeground(SystemColor.activeCaption);
        lblHistrico.setBounds(565, 291, 120, 29);
        frame.getContentPane().add(lblHistrico);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(670, 291, 100, 35);
        frame.getContentPane().add(btnBuscar);

        JTextField textCaminho = new JTextField();
        textCaminho.setBounds(770, 291, 85, 35);
        frame.getContentPane().add(textCaminho);
        textCaminho.setColumns(10);

        JLabel lblPeriodo = new JLabel("Período Atual:");
        lblPeriodo.setForeground(SystemColor.activeCaption);
        lblPeriodo.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
        lblPeriodo.setBounds(930, 291, 168, 29);
        frame.getContentPane().add(lblPeriodo);

        JTextField textPeriodo = new JFormattedTextField();
        textPeriodo.setBounds(1075, 288, 157, 29);
        frame.getContentPane().add(textPeriodo);
        textPeriodo.setColumns(10);

        JLabel lblQuaisDisciplinasVoc = new JLabel("Quais disciplinas você quer solicitar quebra?");
        lblQuaisDisciplinasVoc.setForeground(SystemColor.activeCaption);
        lblQuaisDisciplinasVoc.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
        lblQuaisDisciplinasVoc.setBounds(56, 366, 443, 29);
        frame.getContentPane().add(lblQuaisDisciplinasVoc);

        JCheckBox chckbxCi_1 = new JCheckBox("CI1059");
        chckbxCi_1.setBackground(Color.WHITE);
        chckbxCi_1.setBounds(59, 419, 129, 23);
        frame.getContentPane().add(chckbxCi_1);

        JCheckBox chckbxCi_2 = new JCheckBox("CI1350");
        chckbxCi_2.setBackground(Color.WHITE);
        chckbxCi_2.setBounds(59, 459, 129, 23);
        frame.getContentPane().add(chckbxCi_2);

        JCheckBox chckbxCi = new JCheckBox("CI1165");
        chckbxCi.setBackground(Color.WHITE);
        chckbxCi.setBounds(59, 499, 129, 23);
        frame.getContentPane().add(chckbxCi);

        JCheckBox chckbxCi_3 = new JCheckBox("CI1164");
        chckbxCi_3.setBackground(Color.WHITE);
        chckbxCi_3.setBounds(59, 539, 129, 23);
        frame.getContentPane().add(chckbxCi_3);

        JCheckBox chckbxCi_4 = new JCheckBox("CI1062");
        chckbxCi_4.setBackground(Color.WHITE);
        chckbxCi_4.setBounds(59, 579, 129, 23);
        frame.getContentPane().add(chckbxCi_4);

        JCheckBox chckbxCi_5 = new JCheckBox("CI1065");
        chckbxCi_5.setBackground(Color.WHITE);
        chckbxCi_5.setBounds(199, 419, 129, 23);
        frame.getContentPane().add(chckbxCi_5);

        JCheckBox chckbxCi_6 = new JCheckBox("CI1058");
        chckbxCi_6.setBackground(Color.WHITE);
        chckbxCi_6.setBounds(199, 459, 129, 23);
        frame.getContentPane().add(chckbxCi_6);

        JCheckBox chckbxCi_7 = new JCheckBox("CI1238");
        chckbxCi_7.setBackground(Color.WHITE);
        chckbxCi_7.setBounds(199, 499, 129, 23);
        frame.getContentPane().add(chckbxCi_7);

        JCheckBox chckbxCi_8 = new JCheckBox("CI1162");
        chckbxCi_8.setBackground(Color.WHITE);
        chckbxCi_8.setBounds(199, 539, 129, 23);
        frame.getContentPane().add(chckbxCi_8);

        JCheckBox chckbxCi_9 = new JCheckBox("CI1215");
        chckbxCi_9.setBackground(Color.WHITE);
        chckbxCi_9.setBounds(199, 579, 129, 23);
        frame.getContentPane().add(chckbxCi_9);

        JCheckBox chckbxCi_10 = new JCheckBox("CI1209");
        chckbxCi_10.setBackground(Color.WHITE);
        chckbxCi_10.setBounds(339, 419, 129, 23);
        frame.getContentPane().add(chckbxCi_10);

        JCheckBox chckbxCi_11 = new JCheckBox("CI1218");
        chckbxCi_11.setBackground(Color.WHITE);
        chckbxCi_11.setBounds(339, 459, 129, 23);
        frame.getContentPane().add(chckbxCi_11);

        JCheckBox chckbxCi_12 = new JCheckBox("CI1061");
        chckbxCi_12.setBackground(Color.WHITE);
        chckbxCi_12.setBounds(339, 499, 129, 23);
        frame.getContentPane().add(chckbxCi_12);

        JCheckBox chckbxCi_13 = new JCheckBox("CI1316");
        chckbxCi_13.setBackground(Color.WHITE);
        chckbxCi_13.setBounds(339, 539, 129, 23);
        frame.getContentPane().add(chckbxCi_13);

        JCheckBox chckbxCi_14 = new JCheckBox("CI1163");
        chckbxCi_14.setBackground(Color.WHITE);
        chckbxCi_14.setBounds(339, 579, 129, 23);
        frame.getContentPane().add(chckbxCi_14);

        JCheckBox chckbxCi_15 = new JCheckBox("CI1221");
        chckbxCi_15.setBackground(Color.WHITE);
        chckbxCi_15.setBounds(479, 419, 129, 23);
        frame.getContentPane().add(chckbxCi_15);

        JCheckBox chckbxCi_16 = new JCheckBox("CI1007");
        chckbxCi_16.setBackground(Color.WHITE);
        chckbxCi_16.setBounds(479, 459, 129, 23);
        frame.getContentPane().add(chckbxCi_16);

        JCheckBox chckbxCi_17 = new JCheckBox("CI1211");
        chckbxCi_17.setBackground(Color.WHITE);
        chckbxCi_17.setBounds(479, 499, 129, 23);
        frame.getContentPane().add(chckbxCi_17);

        JCheckBox chckbxCi_18 = new JCheckBox("CI1005");
        chckbxCi_18.setBackground(Color.WHITE);
        chckbxCi_18.setBounds(479, 539, 129, 23);
        frame.getContentPane().add(chckbxCi_18);

        JCheckBox chckbxCi_19 = new JCheckBox("CI1064");
        chckbxCi_19.setBackground(Color.WHITE);
        chckbxCi_19.setBounds(479, 579, 129, 23);
        frame.getContentPane().add(chckbxCi_19);

        JCheckBox chckbxCi_20 = new JCheckBox("CI1100");
        chckbxCi_20.setBackground(Color.WHITE);
        chckbxCi_20.setBounds(609, 419, 129, 23);
        frame.getContentPane().add(chckbxCi_20);

        JCheckBox chckbxCi_21 = new JCheckBox();
        chckbxCi_21.setBackground(Color.WHITE);
        chckbxCi_21.setBounds(609, 459, 23, 23);
        frame.getContentPane().add(chckbxCi_21);

        JTextField textDiscip1 = new JTextField();
        textDiscip1.setBounds(632, 459, 55, 19);
        frame.getContentPane().add(textDiscip1);
        textDiscip1.setColumns(10);

        JCheckBox chckbxCi_22 = new JCheckBox();
        chckbxCi_22.setBackground(Color.WHITE);
        chckbxCi_22.setBounds(609, 499, 23, 23);
        frame.getContentPane().add(chckbxCi_22);

        JTextField textDiscip2 = new JTextField();
        textDiscip2.setBounds(632, 499, 55, 19);
        frame.getContentPane().add(textDiscip2);
        textDiscip2.setColumns(10);

        JLabel lblSemConflito = new JLabel(
                "Tem condições de se matricular nesta(s) disciplina(s), sem colisão de horário com disciplinas já matriculado?");
        lblSemConflito.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
        lblSemConflito.setForeground(SystemColor.activeCaption);
        lblSemConflito.setBounds(56, 666, 1124, 58);
        frame.getContentPane().add(lblSemConflito);

        JCheckBox checkBox_4 = new JCheckBox("Sim");
        checkBox_4.setBackground(Color.WHITE);
        checkBox_4.setBounds(59, 720, 58, 23);
        frame.getContentPane().add(checkBox_4);

        JCheckBox checkBox_5 = new JCheckBox("Não");
        checkBox_5.setBackground(Color.WHITE);
        checkBox_5.setBounds(120, 720, 62, 23);
        frame.getContentPane().add(checkBox_5);

        ButtonGroup bgConflitos = new ButtonGroup();
        bgConflitos.add(checkBox_4);
        bgConflitos.add(checkBox_5);

        JLabel lblJustificativa = new JLabel("Justifique seus pedidos e informe a");
        lblJustificativa.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
        lblJustificativa.setForeground(SystemColor.activeCaption);
        lblJustificativa.setBounds(807, 366, 460, 29);
        frame.getContentPane().add(lblJustificativa);

        JLabel lblPrioridade = new JLabel("ordem de prioridade de cada uma:");
        lblPrioridade.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 19));
        lblPrioridade.setForeground(SystemColor.activeCaption);
        lblPrioridade.setBounds(809, 402, 450, 29);
        frame.getContentPane().add(lblPrioridade);

        JButton btnEnviarPedido = new JButton("Enviar Pedido");
        btnEnviarPedido.setBounds(507, 768, 282, 70);
        frame.getContentPane().add(btnEnviarPedido);

        JTextField textJustificativa = new JTextField();
        textJustificativa.setBackground(Color.LIGHT_GRAY);
        textJustificativa.setBounds(802, 450, 432, 168);
        frame.getContentPane().add(textJustificativa);

        panel.setBackground(SystemColor.activeCaption);
        panel.setBounds(0, 0, 1324, 153);
        frame.getContentPane().add(panel);

        PedidoController pedido = new PedidoController(textNome, textGrr, textJustificativa, textPeriodo, textCaminho);
        btnBuscar.addActionListener(pedido);
        btnEnviarPedido.addActionListener(pedido);

        CheckBoxesController boxes = new CheckBoxesController(chckbxCi, chckbxCi_1, chckbxCi_2, chckbxCi_3, chckbxCi_4,
                chckbxCi_5, chckbxCi_6, chckbxCi_7, chckbxCi_8, chckbxCi_9, chckbxCi_10, chckbxCi_11, chckbxCi_12,
                chckbxCi_13, chckbxCi_14, chckbxCi_15, chckbxCi_16, chckbxCi_17, chckbxCi_18, chckbxCi_19, chckbxCi_20,
                chckbxCi_21, chckbxCi_22, textDiscip1, textDiscip2, bgGrades, bgConflitos);
        btnEnviarPedido.addActionListener(boxes);
    }
}
