package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.AlunoController;
import model.Aluno;
import model.Data;

public class AlunoView {

	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField txtMatricula;
	private JTextField txtNome;
	private JTextField txtDtNasc;
	private JTextField txtSexo;

	public AlunoView() {
		iniciaGui();
	}

	public void iniciaGui() {
		// Definiar a tela e suas características
		janela = new JFrame();
		janela.setTitle("Título da tela");
		janela.setSize(500, 200);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);

		// Definir os componentes JButton(botão)
		botao1 = new JButton();
		botao1.setText("Cadastrar");
		botao1.setBounds(135, 135, 100, 20);
		botao1.addActionListener(new CadastroListener());
		botao2 = new JButton();
		botao2.setText("Cancelar");
		botao2.setBounds(250, 135, 100, 20);
		botao2.addActionListener(new CancelaListener());

		// Definir o componente JLabel de rotulo
		JLabel lblMatricula = new JLabel();
		lblMatricula.setText("Matricula:");
		lblMatricula.setBounds(10, 15, 85, 20);
		JLabel lblNome = new JLabel();
		lblNome.setText("Nome:");
		lblNome.setBounds(10, 45, 85, 20);
		JLabel lblDtNasc = new JLabel();
		lblDtNasc.setText("Dt nascimento:");
		lblDtNasc.setBounds(10, 75, 85, 20);
		JLabel lblSexo = new JLabel();
		lblSexo.setText("Sexo:");
		lblSexo.setBounds(10, 105, 85, 20);

		// Definir o campo de texto JTextField
		txtMatricula = new JTextField();
		txtMatricula.setBounds(110, 15, 350, 20);
		txtNome = new JTextField();
		txtNome.setBounds(110, 45, 350, 20);
		txtDtNasc = new JTextField();
		txtDtNasc.setBounds(110, 75, 350, 20);
		txtSexo = new JTextField();
		txtSexo.setBounds(110, 105, 350, 20);

		// Adicionar os componentes na tela
		janela.getContentPane().add(botao1);
		janela.getContentPane().add(botao2);
		janela.getContentPane().add(lblMatricula);
		janela.getContentPane().add(lblNome);
		janela.getContentPane().add(lblDtNasc);
		janela.getContentPane().add(lblSexo);
		janela.getContentPane().add(txtMatricula);
		janela.getContentPane().add(txtNome);
		janela.getContentPane().add(txtDtNasc);
		janela.getContentPane().add(txtSexo);

		janela.setVisible(true);
	}

	public class CadastroListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Aluno a1 = new Aluno();
			AlunoController ac = new AlunoController();
			boolean registra = true;

			try {
				a1.setMatricula(txtMatricula.getText());
				a1.setNome(txtNome.getText()); 
				String data = txtDtNasc.getText();
				String sexo = txtSexo.getText().toUpperCase();
				
				char aux = sexo.charAt(0);
				a1.setSexo(aux); 
				
				
				
				String aux1 = a1.getNome().trim(); 
				String aux2 = a1.getMatricula().trim();

				int cont1 = aux1.length();
				int cont2 = aux2.length();
				int cont3 = sexo.length();

				if (aux != 'M' && aux != 'F') {
					registra = false;
				}
				if ((cont1 <= 0) || (cont2 <= 0) || (cont3 != 1)) { 
					registra = false;
				}

				String data1[] = data.split("/"); 

				if (data1.length != 3) {
					registra = false;
				}

				int dia = Integer.parseInt(data1[0]);
				int mes = Integer.parseInt(data1[1]);
				int ano = Integer.parseInt(data1[2]);

				if ((mes == 2) && (dia > 29)) { 
					registra = false;
				}
				if ((dia > 31) || (dia < 1) || (mes < 1) || (mes > 12) || (ano > 2020) || (ano < 1800)) {
					registra = false;
				}
				// --------------------------------- FIM DAS VALIDAÇÕES ------------------------------------------------------------------------------
				
				Data data2 = new Data(dia, mes, ano); 
				a1.setDataNasc(data2); 

				if (registra) {
					ac.inserirAluno(a1.getMatricula(), a1.getNome(), a1.getDataNasc(), a1.getSexo());

					JOptionPane.showMessageDialog(null, " Cadastrado com sucesso");
				} else {
					JOptionPane.showMessageDialog(null, "Voce digitou alguma coisa errado. tente novamente");
				}

			} catch (NumberFormatException N) { 
				JOptionPane.showMessageDialog(null, "Verifique o que voce digitou\n\n");
			} catch (java.lang.ArrayIndexOutOfBoundsException A) {
				JOptionPane.showMessageDialog(null, "A data precisa ser em formato de data");
			} catch (java.lang.StringIndexOutOfBoundsException C) {
				JOptionPane.showMessageDialog(null, "Digite o sexo");
			}

			
			txtMatricula.setText("");
			txtNome.setText("");
			txtDtNasc.setText("");
			txtSexo.setText("");
		}

	}

	public class CancelaListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			janela.setVisible(false);
		}
	}
}