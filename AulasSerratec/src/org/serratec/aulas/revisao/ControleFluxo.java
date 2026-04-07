package org.serratec.aulas.revisao;

public class ControleFluxo {

	public static void main(String[] args) {
		
		int nota = 5;
		
		if(nota >= 6) {
			System.out.println("Você passou! \nNota: " + nota);
		} else {
			System.out.println("Você reprovou! \nNota: " + nota);
		}
		
		if(nota >= 9) {
			System.out.println("Conceito A");
		} else if(nota >= 7) {
			System.out.println("Conceito B");
		} else if(nota >= 6) {
			System.out.println("Conceito C");
		} else {
			System.out.println("Reprovado!");
		}
		
		String resultado = (nota >= 6) ? "Aprovado" : "Reprovado";
		
		System.out.println("Status: " + ((nota >= 6) ? "OK" : "NOK"));

	}

}
