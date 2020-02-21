package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import javax.swing.JOptionPane;

import model.Aluno;
import model.Data;
import model.Mensagem;

public class AlunoController {

	public void inserirAluno(String matricula, String nome, Data data, char sexo) {
		Data d1 = new Data();
		Aluno a1 = new Aluno();
		a1.setMatricula(matricula);
		a1.setNome(nome);
		a1.setDataNasc(data);
		a1.setSexo(sexo);
		
		File arquivo = new File("alunos.txt");

		try {
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			PrintStream gravador = new PrintStream(arquivoOutput);

			gravador.print(a1.getNome() + ";");
			gravador.print(a1.getMatricula() + ";");
			gravador.print(a1.getDataNasc() + ";");
			gravador.println(a1.getSexo());
			
			gravador.close();
			arquivoOutput.close();
			
			System.out.println("Gravação efetuada com sucesso ");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void listarTodos() {
		try {
			InputStream is = new FileInputStream("alunos.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);

			String texto = leitor.readLine();

			while (texto != null) {
				String vetor[] = texto.split(";");

				System.out.println("Matrícula: " + vetor[0]);
				System.out.println("Nome: " + vetor[1]);
				System.out.println("Data nascimento: " + vetor[2]);
				System.out.println("Sexo: " + vetor[3] + "\n");
				texto = leitor.readLine();

			}

			is.close();
			isr.close();
			leitor.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de entrada não encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	public void listarAniversariantes(int mes) {

		try {
			InputStream is = new FileInputStream("alunos.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);

			String texto = leitor.readLine();

			while (texto != null) {
				String vetor[] = texto.split(";");
				String data1[] = vetor[2].split("/");
				int dataConv = Integer.parseInt(data1[1]);

				if (dataConv == mes) {
					System.out.println("Matrícula: " + vetor[0]);
					System.out.println("Nome: " + vetor[1]);
					System.out.println("Data nascimento: " + vetor[2]);
					System.out.println("Sexo: " + vetor[3] + "\n");
				}
				texto = leitor.readLine();
			}

			is.close();
			isr.close();
			leitor.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo de entrada não encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
				// FIM DAS VALIDAÇÕES
				
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
	
}