package org.serratec.aulas.aula3.produto;

import java.util.Scanner;

public class ExemploTernario2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu salario atual: ");
		double salario = sc.nextDouble();
		double novoSalario = salario + (salario > 3000 ? salario * 0.05 : salario * 0.10);
		System.out.println("Seu novo salario é: " + novoSalario);
		sc.close();
	}

}
