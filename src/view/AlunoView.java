package view;

import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AlunoView {

	// ======= DECLARAR VARIAVEIS====

	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JButton botao3;
	private JLabel lblEscolha;
	private JPanel painelDaJanela;
	private JRadioButton rbtMasculino;
	private JRadioButton rbtFeminino;
	private ButtonGroup grpRadio;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtRg;
	private JTextField txtCpf;
	private JTextField txtSenha;
	private JTextField txtDtNasc;
	private JTextField txtTelefone;
	private JTextField txtSexo;
	private JTextField txtLougradouro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtEstado;
	private JTextField txtCep;
	private JPanel painel1;
	
	public void iniciaGui() {

		// ========SEXO=============
		lblEscolha = new JLabel();
		rbtMasculino = new JRadioButton();
		rbtFeminino = new JRadioButton();
		grpRadio = new ButtonGroup();

		grpRadio.add(rbtMasculino);
		grpRadio.add(rbtFeminino);

		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEscolha.setBounds(10, 2, 700, 18);

		rbtMasculino.setText("Masculino");
		rbtMasculino.setBounds(410, 55, 100, 24);

		rbtFeminino.setText("Feminino");
		rbtFeminino.setBounds(508, 55, 150, 24);

		txtSexo = new JTextField();
		txtSexo.setBounds(180, 55, 350, 20);

		JLabel lblSexo = new JLabel();
		lblSexo.setText("Sexo:");
		lblSexo.setBounds(365, 55, 85, 20);

		

		// ============BOTAO================
		botao1 = new JButton();
		botao1.setText("Cadastrar");
		botao1.setBounds(300, 250, 100, 20);
		botao2 = new JButton();
		botao2.setText("Cancelar");
		botao2.setBounds(420, 250, 100, 20);

		// ========PESSOA================
		txtMatricula = new JTextField();
		txtMatricula.setBounds(530, 30, 90, 20);

		JLabel lblMatricula = new JLabel();
		lblMatricula.setText("Matricula:");
		lblMatricula.setBounds(460, 30, 85, 20);

		txtNome = new JTextField();
		txtNome.setBounds(100, 30, 350, 20);

		JLabel lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setBounds(10, 30, 85, 20);

		txtDtNasc = new JTextField();
		txtDtNasc.setBounds(100, 82, 80, 20);

		JLabel lblDtNasc = new JLabel();
		lblDtNasc.setText("Dt nascimento:");
		lblDtNasc.setBounds(10, 83, 85, 20);

		txtRg = new JTextField();
		txtRg.setBounds(100, 55, 100, 20);

		JLabel lblRg = new JLabel();
		lblRg.setText("RG:");
		lblRg.setBounds(10, 55, 85, 20);

		txtCpf = new JTextField();
		txtCpf.setBounds(250, 55, 100, 20);

		JLabel lblCpf = new JLabel();
		lblCpf.setText("CPF:");
		lblCpf.setBounds(220, 55, 85, 20);

		txtSenha = new JTextField();
		txtSenha.setBounds(410, 80, 100, 20);

		JLabel lblSenha = new JLabel();
		lblSenha.setText("Senha:");
		lblSenha.setBounds(360, 80, 85, 20);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(250, 80, 100, 20);

		JLabel lblTelefone = new JLabel();
		lblTelefone.setText("Telefone:");
		lblTelefone.setBounds(190, 80, 85, 20);

		// ===========ENDERECO==================
		txtLougradouro = new JTextField();
		txtLougradouro.setBounds(100, 120, 350, 20);

		JLabel lblLougradouro = new JLabel();
		lblLougradouro.setText("Lougradouro:");
		lblLougradouro.setBounds(10, 120, 85, 20);

		txtNumero = new JTextField();
		txtNumero.setBounds(100, 120, 350, 20);

		JLabel lblNumero = new JLabel();
		lblNumero.setText("Nº:");
		lblNumero.setBounds(10, 170, 85, 20);

		txtComplemento = new JTextField();
		txtComplemento.setBounds(550, 120, 100, 20);

		JLabel lblComplemento = new JLabel();
		lblComplemento.setText("Complemento:");
		lblComplemento.setBounds(460, 120, 85, 20);

		txtBairro = new JTextField();
		txtBairro.setBounds(100, 152, 150, 20);

		JLabel lblBairro = new JLabel();
		lblBairro.setText("Bairro:");
		lblBairro.setBounds(10, 152, 85, 20);

		txtCidade = new JTextField();
		txtCidade.setBounds(30, 152, 150, 20);

		JLabel lblCidade = new JLabel();
		lblCidade.setText("Cidade:");
		lblCidade.setBounds(255, 152, 85, 20);


		// ===========COLOCANDO NA TELA=============
		janela.getContentPane().add(botao1);
		janela.getContentPane().add(botao2);
		janela.getContentPane().add(lblMatricula);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(lblDtNasc);
		janela.getContentPane().add(lblSexo);
		janela.getContentPane().add(lblLougradouro);
		janela.getContentPane().add(lblNumero);
		janela.getContentPane().add(lblRg);
		janela.getContentPane().add(lblCpf);
		janela.getContentPane().add(lblTelefone);
		janela.getContentPane().add(lblComplemento);
		janela.getContentPane().add(lblSenha);
		janela.getContentPane().add(lblBairro);
		janela.getContentPane().add(lblCidade);
		janela.getContentPane().add(txtMatricula);
		janela.getContentPane().add(txtNome);
		janela.getContentPane().add(txtDtNasc);
		janela.getContentPane().add(txtLougradouro);
		janela.getContentPane().add(txtRg);
		janela.getContentPane().add(txtCpf);
		janela.getContentPane().add(txtTelefone);
		janela.getContentPane().add(txtComplemento);
		janela.getContentPane().add(txtSenha);
		janela.getContentPane().add(txtCidade);
		janela.getContentPane().add(txtBairro);
		

		// ========CONFIGURACAO TELA==============
		janela = new JFrame();
		janela.setTitle("Cadastro Aluno");
		janela.setSize(1000, 500);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(new Dimension(950, 550));
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

		// =========PAINEL=================

		painelDaJanela = (JPanel) janela.getContentPane();
		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDaJanela.setLayout(null);

		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(rbtMasculino);
		painelDaJanela.add(rbtFeminino);
		janela.setVisible(true);
	}
}
