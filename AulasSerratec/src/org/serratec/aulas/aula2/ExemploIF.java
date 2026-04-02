package org.serratec.aulas.aula2;

public class ExemploIF {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 180;
		
		if(num1 > num2)
			System.out.println("Só executa quando o número 1 é maior");
		
		if(num1 > num2) {
			System.out.println("O número " + num1 + " é maior");
		} else {
			System.out.println("O número " + num2 + " é maior");
		}

	}

}
