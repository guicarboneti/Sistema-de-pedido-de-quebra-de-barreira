import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Interface {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Interface window = new Interface();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Interface() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(12, 12, 70, 15);
        frame.getContentPane().add(lblNome);

        textField = new JTextField();
        textField.setBounds(70, 10, 114, 19);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblGrr = new JLabel("GRR:");
        lblGrr.setBounds(261, 12, 70, 15);
        frame.getContentPane().add(lblGrr);

        textField_1 = new JTextField();
        textField_1.setBounds(296, 10, 114, 19);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JCheckBox checkBox = new JCheckBox("2011");
        checkBox.setBounds(93, 50, 129, 23);
        frame.getContentPane().add(checkBox);

        JCheckBox checkBox_1 = new JCheckBox("2019");
        checkBox_1.setBounds(154, 37, 129, 23);
        frame.getContentPane().add(checkBox_1);

        JLabel lblHistrico = new JLabel("Histórico:");
        lblHistrico.setBounds(225, 54, 70, 15);
        frame.getContentPane().add(lblHistrico);

        JLabel lblQuaisDisciplinasVoc = new JLabel("Quais disciplinas você quer solicitar quebra?");
        lblQuaisDisciplinasVoc.setBounds(12, 68, 370, 15);
        frame.getContentPane().add(lblQuaisDisciplinasVoc);

        JLabel lblGradeQueEst = new JLabel("Grade que está matriculado:");
        lblGradeQueEst.setBounds(12, 41, 114, 15);
        frame.getContentPane().add(lblGradeQueEst);

        JCheckBox chckbxCi_1 = new JCheckBox("CI1059");
        chckbxCi_1.setBounds(32, 77, 80, 35);
        frame.getContentPane().add(chckbxCi_1);

        JCheckBox chckbxCi_2 = new JCheckBox("CI1350");
        chckbxCi_2.setBounds(32, 124, 129, 23);
        frame.getContentPane().add(chckbxCi_2);

        JCheckBox chckbxCi = new JCheckBox("CI1165");
        chckbxCi.setBounds(19, 152, 129, 23);
        frame.getContentPane().add(chckbxCi);

        JCheckBox chckbxCi_3 = new JCheckBox("CI1165");
        chckbxCi_3.setBounds(29, 179, 129, 23);
        frame.getContentPane().add(chckbxCi_3);

        JCheckBox chckbxCi_4 = new JCheckBox("CI1062");
        chckbxCi_4.setBounds(12, 206, 129, 23);
        frame.getContentPane().add(chckbxCi_4);

        JButton btnEnviarPedido = new JButton("Enviar Pedido");
        btnEnviarPedido.setBounds(166, 226, 117, 25);
        frame.getContentPane().add(btnEnviarPedido);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(408, 108, -111, 67);
        frame.getContentPane().add(textArea);
    }
}
