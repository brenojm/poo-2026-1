package org.serratec.exercicio1;

public class Revista extends Publicacao {
	private String mesEdicao;

	public Revista(String titulo, String autor, int anoPublicacao, String mesEdicao) {
		super(titulo, autor, anoPublicacao);
		this.mesEdicao = mesEdicao;
	}

	@Override
	public String toString() {
		return "Revista: " + titulo + " | Autor: " + autor + " | Ano: " + anoPublicacao + " | Mês Edição: " + mesEdicao;
	}
}
