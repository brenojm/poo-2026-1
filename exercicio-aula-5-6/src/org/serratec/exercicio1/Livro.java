package org.serratec.exercicio1;

public class Livro extends Publicacao {
	private int numeroPaginas;

	public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
		super(titulo, autor, anoPublicacao);
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Livro: " + titulo + " | Autor: " + autor + " | Ano: " + anoPublicacao + " | Páginas: " + numeroPaginas;
	}
}
