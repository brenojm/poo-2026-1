package org.serratec.exercicio6;

public class Paciente {
	private String nome;
	private String carteirinha;

	public Paciente(String nome, String carteirinha) {
		this.nome = nome;
		this.carteirinha = carteirinha;
	}

	public String getNome() {
		return nome;
	}
}