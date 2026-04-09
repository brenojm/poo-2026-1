package org.serratec.aulas.aula6;

public class Prato {
	private String nome;
	private double valor;
	
	public Prato(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
	
}
