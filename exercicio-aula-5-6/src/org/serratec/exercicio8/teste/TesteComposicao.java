package org.serratec.exercicio8.teste;

import org.serratec.exercicio8.LivroComposicao;

public class TesteComposicao {
	public static void main(String[] args) {
		LivroComposicao livro = new LivroComposicao("Java");
		livro.adicionarCapitulo("Introdução", 20);
		livro.adicionarCapitulo("POO", 35);

		livro.exibirLivro();
	}
}
