package org.serratec.exercicio8;

public class LivroComposicao {
	private String nome;
	private Capitulo[] capitulos = new Capitulo[10];

	public LivroComposicao(String nome) {
		this.nome = nome;
	}

	public void adicionarCapitulo(String titulo, int paginas) {
		for (int i = 0; i < capitulos.length; i++) {
			if (capitulos[i] == null) {
				capitulos[i] = new Capitulo(titulo, paginas);
				break;
			}
		}
	}

	public void exibirLivro() {
		System.out.println("Livro: " + nome);
		for (Capitulo c : capitulos) {
			if (c != null) {
				System.out.println("Capítulo: " + c.getTitulo() + " (" + c.getPaginas() + " páginas)");
			}
		}
	}
}
