package org.serratec.aulas.aula3.pessoa;

import java.util.Scanner;

public class ExercicioPessoa {
	public static void main (String args[]) {
		double maiorPeso = 0;
		String nomeMaiorPeso = "";
		
		double maiorAltura = 0;
		String nomeMaiorAltura = "";
		
		double somaPesos = 0;
		double somaAlturas = 0;
		
		int qntPessoas = 4;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= qntPessoas; i++) {
			Pessoa pi = new Pessoa();
			System.out.println("Qual o nome da pessoa " + i + " :");
			pi.setNome(sc.nextLine());
			
			System.out.println("Qual o peso da pessoa " + i + " :");
			pi.setPeso(sc.nextDouble());
			
			System.out.println("Qual a altura da pessoa " + i + " :");
			pi.setAltura(sc.nextDouble());
			
			sc.nextLine();
			
			if(pi.getPeso() > maiorPeso) {
				maiorPeso = pi.getPeso();
				nomeMaiorPeso = pi.getNome();
			}
			
			if(pi.getAltura() > maiorAltura) {
				maiorAltura = pi.getAltura();
				nomeMaiorAltura = pi.getNome();
			}
			
			somaPesos += pi.getPeso();
			somaAlturas += pi.getAltura();
		}
		
		System.out.println("RESULTADOS: ");
		System.out.println("A pessoa com maior peso é " + nomeMaiorPeso);
		System.out.println("A pessoa com maior altura é " + nomeMaiorAltura);
		double mediaPeso = somaPesos / qntPessoas;
		double mediaAltura = somaAlturas / qntPessoas;
		System.out.println("A média de peso é " + mediaPeso);
		System.out.println("A média de altura é " + mediaAltura);
		
		
	}
}
