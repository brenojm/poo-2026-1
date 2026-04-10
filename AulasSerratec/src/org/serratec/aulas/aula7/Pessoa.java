package org.serratec.aulas.aula7;

public class Pessoa implements Tributos{
	private String nome;
	private double rendimentos;
	
	public Pessoa(String nome, double rendimentos) {
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getRendimentos() {
		return rendimentos;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", rendimentos=" + rendimentos + "]";
	}
	
	@Override
	public double calculaICMS() {
		return rendimentos * ICMS;
	}
	
	@Override
	public double calculaIR() {
		return rendimentos * IR_PESSOA_FISICA;
	}
	
	
}
