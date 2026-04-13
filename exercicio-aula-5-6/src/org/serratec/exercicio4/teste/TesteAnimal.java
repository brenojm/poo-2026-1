package org.serratec.exercicio4.teste;

import org.serratec.exercicio4.Cachorro;
import org.serratec.exercicio4.Gato;

public class TesteAnimal {
	public static void main(String[] args) {
		Cachorro cao = new Cachorro("Rex", 3);
		Gato gato = new Gato("Mingau", 2);

		System.out.println(cao.toString());
		cao.emitirSom();

		System.out.println(gato.toString());
		gato.emitirSom();
	}
}
