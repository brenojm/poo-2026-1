package org.serratec.aulas.aula10.teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExercicioArquivo {

	public static int contarCaracteres(String caminhoArquivo) {
		int quantidadeCaracteres = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo));
			String linha;
			while ((linha = br.readLine()) != null) {
				quantidadeCaracteres += linha.length();
			}
		} catch (IOException e) {
			System.out.println("Erro ao acessar arquivo!");
			e.printStackTrace();
		}

		return quantidadeCaracteres;

	}

	public static void main(String[] args) {
		String caminhoArquivo = "/Aula/teste.txt";
		int quantidade = contarCaracteres(caminhoArquivo);
		System.out.println("A quantidade de caracteres no arquivo é: " + quantidade);
	}

}
