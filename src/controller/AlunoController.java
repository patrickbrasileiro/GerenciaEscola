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

public class AlunoController {

	public void inserirAluno() {

		Aluno al1 = new Aluno();
		Aluno al2 = new Aluno();
		Aluno al3 = new Aluno();
		Aluno al4 = new Aluno();
		Aluno al5 = new Aluno();

		Data dt1 = new Data(12, 1, 1995);
		Data dt2 = new Data(01, 6, 2000);
		Data dt3 = new Data(05, 8, 1989);
		Data dt4 = new Data(16, 11, 1985);
		Data dt5 = new Data(16, 9, 1975);

		al1.setMatricula("1234");
		al1.setNome("Juldelson da Silva");
		al1.setDataNascimento(dt1);
		al1.setSexo('M');

		al2.setMatricula("1235");
		al2.setNome("Goku de Almeida");
		al2.setDataNascimento(dt2);
		al2.setSexo('M');

		al3.setMatricula("1236");
		al3.setNome("Luiza Souza");
		al3.setDataNascimento(dt3);
		al3.setSexo('F');

		al4.setMatricula("1237");
		al4.setNome("Caio Godoi");
		al4.setDataNascimento(dt4);
		al4.setSexo('M');

		al5.setMatricula("1238");
		al5.setNome("Maria das Dores");
		al5.setDataNascimento(dt5);
		al5.setSexo('F');

		File arquivo = new File("aluno.txt");

		try {

			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			PrintStream gravador = new PrintStream(arquivoOutput);

			gravador.print(al1.getMatricula());
			gravador.print(";");
			gravador.print(al1.getNome());
			gravador.print(";");
			gravador.print(al1.getDataNascimento());
			gravador.print(";");
			gravador.print(al1.getSexo());
			gravador.println("");

			gravador.print(al2.getMatricula());
			gravador.print(";");
			gravador.print(al2.getNome());
			gravador.print(";");
			gravador.print(al2.getDataNascimento());
			gravador.print(";");
			gravador.print(al2.getSexo());
			gravador.println("");

			gravador.print(al3.getMatricula());
			gravador.print(";");
			gravador.print(al3.getNome());
			gravador.print(";");
			gravador.print(al3.getDataNascimento());
			gravador.print(";");
			gravador.print(al3.getSexo());
			gravador.println("");

			gravador.print(al4.getMatricula());
			gravador.print(";");
			gravador.print(al4.getNome());
			gravador.print(";");
			gravador.print(al4.getDataNascimento());
			gravador.print(";");
			gravador.print(al4.getSexo());
			gravador.println("");

			gravador.print(al5.getMatricula());
			gravador.print(";");
			gravador.print(al5.getNome());
			gravador.print(";");
			gravador.print(al5.getDataNascimento());
			gravador.print(";");
			gravador.print(al5.getSexo());
			gravador.println("");

			gravador.close();
			arquivoOutput.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public void listarTodos() {

		InputStream is;
		try {

			is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);

			String texto = leitor.readLine();

			while (texto != null) {

				String dados[] = texto.split(";");
				System.out.println("Matricula do aluno..." + dados[0]);
				System.out.println("Nome do aluno..." + dados[1]);
				System.out.println("Data de Nascimento..." + dados[2]);
				System.out.println("Sexo do aluno..." + dados[3]);
				texto = leitor.readLine();
			}
		} catch (FileNotFoundException e) {

			System.out.println("arquivo de entrada nao encontrado");
  		e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		

		public void ListaAniversariantes(int mes) {
			
			InputStream is;
			try {

				is = new FileInputStream("aluno.txt");
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader leitor = new BufferedReader(isr);

				String texto = leitor.readLine();
				

				while (texto != null) {

					String dados[] = texto.split(";");
					String data [] = dados[2].split ("/");
					
					if (Integer.parseInt(data[1])==mes) {
					System.out.println("Matricula do aluno..." + dados[0]);
					System.out.println("Nome do aluno..." + dados[1]);
					System.out.println("Data de Nascimento..." + dados[2]);
					System.out.println("Sexo do aluno..." + dados[3]);
					texto = leitor.readLine();
				}
					
			} catch (FileNotFoundException e) {
			
				System.out.println("arquivo de entrada nao encontrado");
	  		e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}

		 {
				
			}
		

	
		
	

}


