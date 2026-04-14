package org.serratec.aulas.aula9.teste;

import java.util.Scanner;

public class ExercicioLeitura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite um número inteiro: ");
			int resposta = sc.nextInt();

			System.out.println(resposta);
		} catch (Exception e) {
			System.out.println("Falha ao ler o número");
		} finally {
			sc.close();
		}

	}

}
