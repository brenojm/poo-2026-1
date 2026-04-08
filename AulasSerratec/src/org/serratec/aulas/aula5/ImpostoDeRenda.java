package org.serratec.aulas.aula5;

public class ImpostoDeRenda {
	protected String nome;
	protected String email;
	protected String telefone;
	protected double rendimentos;
	
	public ImpostoDeRenda(String nome, double rendimentos) {
		this.nome = nome;
		this.rendimentos = rendimentos;
	}
	
	public void calculoIR() {
	}
}
