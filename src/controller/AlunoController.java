package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
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

}