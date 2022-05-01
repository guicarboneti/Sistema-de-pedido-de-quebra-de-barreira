package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;

import model.DadosRecebidosFormulario;
import model.VisualizacaoTableModel;
import javax.swing.border.LineBorder;

public class VisualizacaoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textGrr;
	private JLabel lblPerodoAtual;
	private JTextField textPeriodo;
	private JLabel lblIra;
	private JTextField textIra;
	private JTextArea textSituacao;
	private JTable tableCodigos;
	private DadosRecebidosFormulario dados = new DadosRecebidosFormulario();
	VisualizacaoTableModel table = new VisualizacaoTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizacaoUsuario frame = new VisualizacaoUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VisualizacaoUsuario() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 446);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 0, 906, 407);
		contentPane.add(panel);
		panel.setLayout(null);

		// textNome = new JTextField(this.dados.getNome());
		textNome = new JTextField();
		textNome.setFont(new Font("Dialog", Font.PLAIN, 12));
		textNome.setText("NOME");
		textNome.setBackground(Color.WHITE);
		textNome.setEditable(false);
		textNome.setBounds(40, 35, 170, 19);
		textNome.setBorder(null);
		panel.add(textNome);
		textNome.setColumns(10);

		JLabel lblMatrcula = new JLabel("Matrícula:");
		lblMatrcula.setFont(new Font("Dialog", Font.BOLD, 15));
		lblMatrcula.setBounds(228, 35, 97, 15);
		panel.add(lblMatrcula);

		// textGrr = new JTextField(this.dados.getGrr());
		textGrr = new JTextField();
		textGrr.setFont(new Font("Dialog", Font.PLAIN, 15));
		textGrr.setText("GRR");
		textGrr.setBackground(Color.WHITE);
		textGrr.setEditable(false);
		textGrr.setBounds(317, 35, 114, 19);
		textGrr.setBorder(null);
		panel.add(textGrr);
		textGrr.setColumns(10);

		lblPerodoAtual = new JLabel("Período Atual:");
		lblPerodoAtual.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPerodoAtual.setBounds(448, 35, 119, 15);
		panel.add(lblPerodoAtual);

		// textPeriodo = new JTextField(this.dados.getPeriodoAtual());
		textPeriodo = new JTextField();
		textPeriodo.setFont(new Font("Dialog", Font.PLAIN, 15));
		textPeriodo.setText("P");
		textPeriodo.setBackground(Color.WHITE);
		textPeriodo.setEditable(false);
		textPeriodo.setBounds(570, 35, 39, 19);
		textPeriodo.setBorder(null);
		panel.add(textPeriodo);
		textPeriodo.setColumns(10);

		lblIra = new JLabel("IRA:");
		lblIra.setFont(new Font("Dialog", Font.BOLD, 15));
		lblIra.setBounds(612, 35, 70, 15);
		panel.add(lblIra);

		// textIra = new JTextField(this.alunoCadastrado.getIra());
		textIra = new JTextField();
		textIra.setFont(new Font("Dialog", Font.PLAIN, 15));
		textIra.setText("IRA");
		textIra.setBackground(Color.WHITE);
		textIra.setEditable(false);
		textIra.setBounds(655, 35, 70, 19);
		textIra.setBorder(null);
		panel.add(textIra);
		textIra.setColumns(10);

		JButton btnEditar = new JButton("Editar Pedido");
		btnEditar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnEditar.setBackground(new Color(51, 204, 204));
		btnEditar.setBounds(745, 78, 143, 62);
		panel.add(btnEditar);

		JButton btnVer = new JButton("Ver Pedido");
		btnVer.setBackground(new Color(51, 204, 204));
		btnVer.setBounds(745, 158, 143, 62);
		panel.add(btnVer);

		textSituacao = new JTextArea();
		textSituacao.setForeground(Color.BLACK);
		textSituacao.setFont(new Font("Dialog", Font.PLAIN, 18));
		textSituacao.setText("Você está no caso");
		textSituacao.setBackground(new Color(255, 153, 51));
		textSituacao.setEditable(false);
		textSituacao.setBounds(745, 248, 143, 138);
		panel.add(textSituacao);

		tableCodigos = new JTable();
		tableCodigos.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableCodigos.setBounds(40, 102, 519, 96);
		tableCodigos.setModel(new DefaultTableModel(
				new Object[][] {
						{ "1", "2", "3" },
						{ "CI1068", "CI1210", "CI1212" },
						{ "CI1055", "CI1056", "CI1057" },
						{ "CI1003", "CI1001", "CI1002" },
						{ "CMA111", "CMA211", "CI1237" },
						{ "CM304", "CM303", "CE009" },
				},
				new String[] {
						"1", "2", "3"
				}) {
			Class[] columnTypes = new Class[] {
					String.class, String.class, String.class
			};

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		panel.add(tableCodigos);

	}
}
