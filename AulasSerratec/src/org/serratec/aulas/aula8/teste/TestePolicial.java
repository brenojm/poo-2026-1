package org.serratec.aulas.aula8.teste;

import org.serratec.aulas.aula8.Policial;

public class TestePolicial {

	public static void main(String[] args) {
		Policial policial = new Policial("Brasília");
		policial.setNome("Antonio");
		System.out.println(policial.getNome() + "-" + policial.getLotacao());

	}

}
