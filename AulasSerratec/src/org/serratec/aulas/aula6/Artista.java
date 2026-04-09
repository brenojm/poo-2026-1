package org.serratec.aulas.aula6;

public class Artista {
	private String nome;
	private String nacionalidade;
	
	public Artista(String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", nacionalidade=" + nacionalidade + "]";
	}
	
	
}
