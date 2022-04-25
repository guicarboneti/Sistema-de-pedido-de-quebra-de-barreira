import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Interface {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private final JPanel panel = new JPanel();
    private JTextField textField_3;

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
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setBackground(Color.WHITE);
        frame.setBounds(100, 100, 1324, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNome = new JLabel("Nome: ");
        lblNome.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 24));
        lblNome.setForeground(SystemColor.activeCaption);
        lblNome.setBounds(50, 209, 77, 29);
        frame.getContentPane().add(lblNome);

        textField = new JTextField();
        textField.setBounds(150, 209, 626, 29);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblGrr = new JLabel("GRR:");
        lblGrr.setBounds(795, 209, 58, 29);
        frame.getContentPane().add(lblGrr);

        textField_1 = new JTextField();
        textField_1.setBounds(865, 209, 397, 29);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        JLabel lblGradeQueEst = new JLabel("Grade que está matriculado:");
        lblGradeQueEst.setBounds(56, 291, 305, 29);
        frame.getContentPane().add(lblGradeQueEst);

        JCheckBox checkBox = new JCheckBox("2011");
        checkBox.setBackground(Color.WHITE);
        checkBox.setHorizontalAlignment(SwingConstants.LEFT);
        checkBox.setBounds(379, 294, 70, 23);
        frame.getContentPane().add(checkBox);

        JCheckBox checkBox_1 = new JCheckBox("2019");
        checkBox_1.setBackground(Color.WHITE);
        checkBox_1.setBounds(484, 294, 70, 23);
        frame.getContentPane().add(checkBox_1);

        JLabel lblHistrico = new JLabel("Histórico:");
        lblHistrico.setBounds(640, 291, 117, 29);
        frame.getContentPane().add(lblHistrico);

        // Mostra o caminho que foi guardado
        textField_2 = new JTextField();
        textField_2.setBounds(866, 288, 85, 35);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(765, 288, 100, 35);
        frame.getContentPane().add(btnBuscar);

        ActionListener busca = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                procuraArquivo();
            }
        };
        btnBuscar.addActionListener(busca);

        // -------------------------------

        JCheckBox checkBox_2 = new JCheckBox("Barreira");
        checkBox_2.setBackground(Color.WHITE);
        checkBox_2.setBounds(999, 294, 100, 23);
        frame.getContentPane().add(checkBox_2);

        JCheckBox checkBox_3 = new JCheckBox("Requisito");
        checkBox_3.setBackground(Color.WHITE);
        checkBox_3.setBounds(1134, 294, 102, 23);
        frame.getContentPane().add(checkBox_3);

        JLabel lblQuaisDisciplinasVoc = new JLabel("Quais disciplinas você quer solicitar quebra?");
        lblQuaisDisciplinasVoc.setForeground(SystemColor.activeCaption);
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

        JCheckBox chckbxCi_21 = new JCheckBox("______");
        chckbxCi_21.setBackground(Color.WHITE);
        chckbxCi_21.setBounds(609, 459, 129, 23);
        frame.getContentPane().add(chckbxCi_21);

        JCheckBox chckbxCi_22 = new JCheckBox("______");
        chckbxCi_22.setBackground(Color.WHITE);
        chckbxCi_22.setBounds(609, 499, 129, 23);
        frame.getContentPane().add(chckbxCi_22);

        JCheckBox chckbxCi_23 = new JCheckBox("______");
        chckbxCi_23.setBackground(Color.WHITE);
        chckbxCi_23.setBounds(609, 539, 129, 23);
        frame.getContentPane().add(chckbxCi_23);

        JCheckBox chckbxCi_24 = new JCheckBox("______");
        chckbxCi_24.setBackground(Color.WHITE);
        chckbxCi_24.setBounds(609, 579, 129, 23);
        frame.getContentPane().add(chckbxCi_24);

        JLabel lblSemConflito = new JLabel(
                "Tem condições de se matricular nesta(s) disciplina(s), sem colisão de horário com disciplinas já matriculado?");
        lblSemConflito.setForeground(SystemColor.activeCaption);
        lblSemConflito.setBounds(56, 666, 1229, 58);
        frame.getContentPane().add(lblSemConflito);

        JCheckBox checkBox_4 = new JCheckBox("Sim");
        checkBox_4.setBackground(Color.WHITE);
        checkBox_4.setBounds(269, 699, 58, 23);
        frame.getContentPane().add(checkBox_4);

        JCheckBox checkBox_5 = new JCheckBox("Não");
        checkBox_5.setBackground(Color.WHITE);
        checkBox_5.setBounds(354, 699, 62, 23);
        frame.getContentPane().add(checkBox_5);

        JLabel lblJustificativa = new JLabel("Justifique seus pedidos e informe a");
        lblJustificativa.setForeground(SystemColor.activeCaption);
        lblJustificativa.setBounds(807, 366, 421, 29);
        frame.getContentPane().add(lblJustificativa);

        JLabel lblPrioridade = new JLabel("ordem de prioridade de cada uma:");
        lblPrioridade.setForeground(SystemColor.activeCaption);
        lblPrioridade.setBounds(809, 402, 407, 29);
        frame.getContentPane().add(lblPrioridade);

        JButton btnEnviarPedido = new JButton("Enviar Pedido");
        btnEnviarPedido.setBounds(507, 788, 282, 67);
        frame.getContentPane().add(btnEnviarPedido);

        JTextArea textArea = new JTextArea();
        textArea.setBackground(Color.LIGHT_GRAY);
        textArea.setBounds(802, 450, 432, 168);
        frame.getContentPane().add(textArea);

        panel.setBackground(SystemColor.activeCaption);
        panel.setBounds(0, 0, 1324, 153);
        frame.getContentPane().add(panel);
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
            textField_2.setText(caminhoArquivo);
        }
    }
}
