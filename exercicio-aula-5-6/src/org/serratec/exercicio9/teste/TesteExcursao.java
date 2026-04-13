package org.serratec.exercicio9.teste;

import org.serratec.exercicio9.Excursao;
import org.serratec.exercicio9.Guia;
import org.serratec.exercicio9.Turista;

public class TesteExcursao {
	public static void main(String[] args) {
		Guia guia = new Guia("Roberto", "Inglês");
		Excursao viagem = new Excursao("Londres", guia);

		viagem.adicionarTurista(new Turista("Alice", "Pass123"));
		viagem.adicionarTurista(new Turista("Bruno", "Pass456"));

		viagem.exibirExcursao();
	}
}
