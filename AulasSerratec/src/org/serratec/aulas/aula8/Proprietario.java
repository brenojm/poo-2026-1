package org.serratec.aulas.aula8;

public class Proprietario {
	private String nome;
	
	public Proprietario(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + "]";
	}
	
	
}
