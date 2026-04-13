package org.serratec.exercicio3.teste;

import org.serratec.exercicio3.Ingresso;
import org.serratec.exercicio3.IngressoEstudante;
import org.serratec.exercicio3.IngressoVIP;

public class TesteIngresso {
	public static void main(String[] args) {
		Ingresso comum = new Ingresso(100.0);
		Ingresso vip = new IngressoVIP(100.0, 50.0);
		Ingresso estudante = new IngressoEstudante(100.0);

		System.out.println("Comum: R$ " + comum.calcularValorFinal());
		System.out.println("VIP: R$ " + vip.calcularValorFinal());
		System.out.println("Estudante: R$ " + estudante.calcularValorFinal());
	}
}
