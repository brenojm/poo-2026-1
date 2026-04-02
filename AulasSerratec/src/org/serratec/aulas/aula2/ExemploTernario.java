package org.serratec.aulas.aula2;

public class ExemploTernario {

	public static void main(String[] args) {
		int qntDiasMes = 28;
		
		
		if(qntDiasMes < 30) {
			System.out.println("Mês é Fevereiro");
		} else {
			System.out.println("Mês é diferente de fevereiro");
		}
		
		String a = qntDiasMes < 30 ? "Mês é fevereiro" : "Mês é diferente de fevereiro";
		System.out.println(a);

	}

}
