package org.serratec.aulas.aula2;

public class CalculoINSS {

	public static void main(String[] args) {
		String nome = "Breno";
		double salario = 900.0;
		double salarioDesconto;
		
		if(salario <= 1518.0) {
			salarioDesconto = salario;
		} else if(salario <= 2793.88) {
			salarioDesconto = salario - (salario * 0.09);
		} else if(salario <= 4190.83) {
			salarioDesconto = salario - (salario * 0.12);
		} else {
			salarioDesconto = salario - (salario * 0.14);
		}
		
		System.out.println("O nome do profissional é: " + nome);
		System.out.println("O salario com desconto é de: " + salarioDesconto);

	}

}
