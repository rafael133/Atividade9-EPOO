package face;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import controle.ControleTime;
public class JanelaTime extends JFrame {
	private JPanel contentPane;
	private JTextField textSigla;
	private JTextField textDescricao;
	private ControleTime ct = new ControleTime();
	private JTextField textNumero;
	private JTextField textNome;
	private JTextField textPosicao;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaTime frame = new JanelaTime();
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
	public JanelaTime() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblCadastroDeTimes = new JLabel("CADASTRO DE TIMES");
		lblCadastroDeTimes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCadastroDeTimes.setBounds(68, 11, 159, 14);
		contentPane.add(lblCadastroDeTimes);
		JLabel lblSigla = new JLabel("SIGLA:");
		lblSigla.setBounds(10, 47, 84, 14);
		contentPane.add(lblSigla);
		JLabel lblDescrio = new JLabel("DESCRI\u00C7\u00C3O:");
		lblDescrio.setBounds(10, 72, 84, 14);
		contentPane.add(lblDescrio);
		textSigla = new JTextField();
		textSigla.setBounds(96, 44, 86, 20);
		contentPane.add(textSigla);
		textSigla.setColumns(10);
		textDescricao = new JTextField();
		textDescricao.setBounds(96, 72, 166, 20);
		contentPane.add(textDescricao);
		textDescricao.setColumns(10);
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ct.cadastrarTime(textSigla.getText(),
						textDescricao.getText());
				JOptionPane.showMessageDialog(null,
						"Time Cadastrado com Sucesso!");

				textSigla.setEnabled(false);
				textDescricao.setEnabled(false);
			}
		});
		btnCadastrar.setBounds(96, 103, 114, 23);
		contentPane.add(btnCadastrar);
		JLabel lblCadastroDeJogadores = new JLabel("CADASTRO DE	JOGADORES");

				lblCadastroDeJogadores.setFont(new Font("Tahoma", Font.BOLD,

						12));

				lblCadastroDeJogadores.setBounds(56, 148, 194, 14);
				contentPane.add(lblCadastroDeJogadores);
				JLabel lblNmero = new JLabel("N\u00DAMERO:");
				lblNmero.setBounds(10, 173, 84, 14);
				contentPane.add(lblNmero);
				JLabel lblNome = new JLabel("NOME:");
				lblNome.setBounds(10, 198, 84, 14);
				contentPane.add(lblNome);
				JLabel lblPosio = new JLabel("POSI\u00C7\u00C3O:");
				lblPosio.setBounds(10, 223, 84, 14);
				contentPane.add(lblPosio);
				textNumero = new JTextField();
				textNumero.setBounds(96, 173, 43, 20);
				contentPane.add(textNumero);
				textNumero.setColumns(10);
				textNome = new JTextField();
				textNome.setBounds(96, 198, 166, 20);
				contentPane.add(textNome);
				textNome.setColumns(10);
				textPosicao = new JTextField();
				textPosicao.setBounds(96, 227, 86, 20);
				contentPane.add(textPosicao);
				textPosicao.setColumns(10);
				JButton btnCadastrar_1 = new JButton("CADASTRAR");
				btnCadastrar_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ct.cadastrarJogador(

								Integer.parseInt(textNumero.getText()),
								textNome.getText(),
								textPosicao.getText());
						JOptionPane.showMessageDialog(null,

								"Jogador Cadastrado com Sucesso");

						textNumero.setText("");
						textNome.setText("");
						textPosicao.setText("");
					}
				});
				btnCadastrar_1.setBounds(96, 258, 117, 23);
				contentPane.add(btnCadastrar_1);
	}
}