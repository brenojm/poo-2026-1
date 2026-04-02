package org.serratec.aulas.aula2;

public class SituacaoAluno {

	public static void main(String[] args) {
		double nota1 = 10.0;
		double nota2 = 10.0;
		
		double media = (nota1 + nota2)/2;
		
		System.out.println("A média do aluno é " + media);
		
		if(media == 10) {
			System.out.println("Aprovado Parabéns");
		} else if(media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}

}
