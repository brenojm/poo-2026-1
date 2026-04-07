package org.serratec.aulas.aula3.produto;

import java.util.Scanner;

import org.serratec.aulas.aula2.conta.Conta;

public class ExemploTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual seu dia da semana favorito?");
		System.out.println("Escolha entre 1 e 7:");
		int numero = sc.nextInt();
		String dia = (numero == 1) ? "segunda" 
				: (numero == 2) ? "terça" 
				: (numero == 3) ? "quarta" 
				: (numero == 4) ? "quinta" 
				: (numero == 5) ? "sexta" 
				: (numero == 6) ? "sabado" 
				: (numero == 7) ? "domingo" 
				: "dia invalido";
		
		String a = dia == "segunda" ? "dia ruim": "dia bom";
		
		System.out.println("Dia escolhido: " + dia + " " + a);
		sc.close();

	}

}
