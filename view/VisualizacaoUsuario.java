package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JTextArea;
import java.awt.Font;
import biblioteca.Aluno;
import biblioteca.Historico;
import controller.BotoesSegTelaController;
import model.DadosRecebidosFormulario;

public class VisualizacaoUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textGrr;
	private JLabel lblPerodoAtual;
	private JTextField textPeriodo;
	private JLabel lblIra;
	private JTextField textIra;
	private JTextArea textSituacao;
	private JTextArea tabela;
	private JLabel legenda;
	private JTextArea legendaCor;

	/**
	 * Launch the application.
	 */
	public void getScreen(Aluno aluno, DadosRecebidosFormulario dados) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisualizacaoUsuario frame = new VisualizacaoUsuario(aluno, dados);
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
	public VisualizacaoUsuario(Aluno aluno, DadosRecebidosFormulario dados) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 616);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(12, 0, 906, 600);
		contentPane.add(panel);
		panel.setLayout(null);

		textNome = new JTextField();
		textNome.setFont(new Font("Dialog", Font.BOLD, 15));
		textNome.setText(aluno.getNome());
		textNome.setBackground(Color.WHITE);
		textNome.setEditable(false);
		textNome.setBounds(40, 25, 170, 19);
		textNome.setBorder(null);
		panel.add(textNome);
		textNome.setColumns(10);

		JLabel lblMatrcula = new JLabel("Matrícula:");
		lblMatrcula.setFont(new Font("Dialog", Font.BOLD, 15));
		lblMatrcula.setBounds(228, 25, 97, 15);
		panel.add(lblMatrcula);

		textGrr = new JTextField();
		textGrr.setFont(new Font("Dialog", Font.PLAIN, 15));
		textGrr.setText(aluno.getGrr());
		textGrr.setBackground(Color.WHITE);
		textGrr.setEditable(false);
		textGrr.setBounds(317, 25, 114, 19);
		textGrr.setBorder(null);
		panel.add(textGrr);
		textGrr.setColumns(10);

		lblPerodoAtual = new JLabel("Período Atual:");
		lblPerodoAtual.setFont(new Font("Dialog", Font.BOLD, 15));
		lblPerodoAtual.setBounds(448, 25, 119, 15);
		panel.add(lblPerodoAtual);

		textPeriodo = new JTextField();
		textPeriodo.setFont(new Font("Dialog", Font.PLAIN, 15));
		String periodoAtual = String.valueOf(aluno.getPeriodo());
		textPeriodo.setText(periodoAtual);
		textPeriodo.setBackground(Color.WHITE);
		textPeriodo.setEditable(false);
		textPeriodo.setBounds(570, 25, 39, 19);
		textPeriodo.setBorder(null);
		panel.add(textPeriodo);
		textPeriodo.setColumns(10);

		lblIra = new JLabel("IRA:");
		lblIra.setFont(new Font("Dialog", Font.BOLD, 15));
		lblIra.setBounds(612, 25, 70, 15);
		panel.add(lblIra);

		textIra = new JTextField();
		textIra.setFont(new Font("Dialog", Font.PLAIN, 15));
		String ira = String.valueOf(round(aluno.getIra(), 2));
		textIra.setText(ira);
		textIra.setBackground(Color.WHITE);
		textIra.setEditable(false);
		textIra.setBounds(655, 25, 70, 19);
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

		Historico h = aluno.getHistorico();

		textSituacao = new JTextArea();
		textSituacao.setForeground(Color.WHITE);
		textSituacao.setFont(new Font("Dialog", Font.BOLD, 12));
		// arrumar um jeito de centralizar
		textSituacao.setText("\n  Você está no caso\n              " + h.getDesempenhoUltPeriodo()
				+ "\n\n   O colegiado deve\n          conceder\n       " + h.getNumMaterias(aluno) + " matrículas");
		textSituacao.setBackground(new Color(1, 0, 241));
		textSituacao.setEditable(false);
		textSituacao.setBounds(745, 248, 143, 118);
		panel.add(textSituacao);

		int i, j, tamx = 0, tamy = 0;
		for (i = 1; i < 9; i++) {
			tabela = new JTextArea();
			tabela.setForeground(Color.BLACK);
			tabela.setFont(new Font("Dialog", Font.BOLD, 11));
			tabela.setText("\n" + i + " período");
			tabela.setBackground(new Color(199, 199, 199));
			tabela.setEditable(false);
			tabela.setBounds(40 + tamx, 60, 60, 50);
			panel.add(tabela);
			tamx += 70;
		}

		// 87, 161,3 - Verde
		// 105,110, 255 - azul
		// 233, 233, 233 - cinza
		// arrumar um jeito de centralizar
		tamx = 0;
		for (i = 0; i < h.gradeAluno.size(); i++) {
			tamy = 0;
			for (j = 0; j < h.gradeAluno.get(i).size(); j++) {
				tabela = new JTextArea();
				tabela.setForeground(Color.BLACK);
				tabela.setFont(new Font("Dialog", Font.BOLD, 12));
				tabela.setText("\n  " + h.gradeAluno.get(i).get(j).getCodDisciplina());
				if (h.gradeAluno.get(i).get(j).getSituacao().equals("Aprovado")) {
					tabela.setBackground(new Color(87, 161, 3));
				} else if (h.verifyMateriasMatriculadas(h.gradeAluno.get(i).get(j).getCodDisciplina())) {
					tabela.setBackground(new Color(105, 110, 255));
				} else {
					tabela.setBackground(new Color(233, 233, 233));
				}
				tabela.setEditable(false);
				tabela.setBounds(40 + tamx, 120 + tamy, 60, 50);
				panel.add(tabela);
				tamy += 60;
			}
			tamx += 70;
		}
		tamx = 0;
		for (i = 0; i < h.getMateriasNaoCursadas().size(); i++) {
			tamy = 0;
			for (j = 0; j < h.getMateriasNaoCursadas().get(i).size(); j++) {
				if (!h.getMateriasNaoCursadas().get(i).get(j).getTipoDisciplina().contains("Opt")
						|| !h.getMateriasNaoCursadas().get(i).get(j).getNome().toLowerCase().contains("trab")) {
					tabela = new JTextArea();
					tabela.setForeground(Color.BLACK);
					tabela.setFont(new Font("Dialog", Font.BOLD, 12));
					tabela.setText("\n  " + h.getMateriasNaoCursadas().get(i).get(j).getCodDisciplina());
					tabela.setBackground(new Color(233, 233, 233));
					tabela.setEditable(false);
					tabela.setBounds(250 + tamx, 120 + tamy, 60, 50);
					panel.add(tabela);
					tamy += 60;
				}
			}
			tamx += 70;
		}
		legendaCor = new JTextArea();
		legendaCor.setForeground(Color.BLACK);
		legendaCor.setFont(new Font("Dialog", Font.BOLD, 12));
		legendaCor.setBackground(new Color(105, 110, 255));
		legendaCor.setEditable(false);
		legendaCor.setBounds(40, 450, 20, 20);
		panel.add(legendaCor);
		legenda = new JLabel("Disciplinas matriculadas");
		legenda.setFont(new Font("Dialog", Font.BOLD, 15));
		legenda.setBounds(70, 412, 200, 100);
		panel.add(legenda);

		legendaCor = new JTextArea();
		legendaCor.setForeground(Color.BLACK);
		legendaCor.setFont(new Font("Dialog", Font.BOLD, 12));
		legendaCor.setBackground(new Color(87, 161, 3));
		legendaCor.setEditable(false);
		legendaCor.setBounds(40, 480, 20, 20);
		panel.add(legendaCor);
		legenda = new JLabel("Disciplinas aprovadas");
		legenda.setFont(new Font("Dialog", Font.BOLD, 15));
		legenda.setBounds(70, 442, 200, 100);
		panel.add(legenda);

		legendaCor = new JTextArea();
		legendaCor.setForeground(Color.BLACK);
		legendaCor.setFont(new Font("Dialog", Font.BOLD, 12));
		legendaCor.setBackground(new Color(233, 233, 233));
		legendaCor.setEditable(false);
		legendaCor.setBounds(40, 510, 20, 20);
		panel.add(legendaCor);
		legenda = new JLabel("Disciplinas não cursadas");
		legenda.setFont(new Font("Dialog", Font.BOLD, 15));
		legenda.setBounds(70, 472, 200, 100);
		panel.add(legenda);

		BotoesSegTelaController botoes = new BotoesSegTelaController(aluno, dados);
		btnEditar.addActionListener(botoes);
		btnVer.addActionListener(botoes);
	}

	private static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(Double.toString(value));
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}
