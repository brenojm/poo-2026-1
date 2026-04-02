package org.serratec.aulas.aula2;

import java.util.Scanner;

public class ExemploLeitura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu nome: ");
		String nome = sc.next();
		System.out.println("Boa noite " + nome);
	}

}
