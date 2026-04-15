package org.serratec.aulas.aula10.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.serratec.aulas.aula10.Aluno;

public class ExemploAluno {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList();
		File arquivo = new File("/Aula/alunos.csv");
		
		try {
			Scanner sc = new Scanner(arquivo);
			while(sc.hasNextLine()) {
				String[] dados = sc.nextLine().split(";");
				Aluno a = new Aluno(dados[0], Integer.parseInt(dados[1]));
				System.out.println(a.getNome());
				alunos.add(a);
			}
			System.out.println("Carregados " + alunos.size() + " alunos do arquivo");
			sc.close();
		} catch (IOException e) {
			System.out.println("Arquivo não encontrado!");
		}
		
		Aluno novoAluno = new Aluno("Francisco", 27);
		alunos.add(novoAluno);
		System.out.println(novoAluno.paraCSV());
		
		try {
			FileWriter fw = new FileWriter(arquivo, true);
			fw.write("\n" + novoAluno.paraCSV());
			System.out.println("Novo aluno salvo com sucesso!");
			fw.close();
		} catch (IOException e) {
			System.out.println("Erro ao acessar arquivo");
		}
		
		

	}

}
