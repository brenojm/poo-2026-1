package org.serratec.aulas.aula2;

public class ExemploSwitch2 {

	public static void main(String[] args) {
		String dia = "Sábado";
		
		switch (dia) {
		case "Segunda-Feira":
			System.out.println("É um dia da semana");
			break;
		case "Terça-Feira":
			System.out.println("É um dia da semana");
			break;
		case "Quarta-Feira":
			System.out.println("É um dia da semana");
			break;
		case "Quinta-Feira":
			System.out.println("É um dia da semana");
			break;
		case "Sexta-Feira":
			System.out.println("É um dia da semana");
			break;
		case "Sábado":
			System.out.println("É um dia do final de semana");
			break;
		case "Domingo":
			System.out.println("É um dia do final de semana");
			break;
		default:
			System.out.println("Dia Desconhecido");
			break;
		}

	}

}
