package org.serratec.aulas.aula7;

public class Empresa implements Tributos{
	private String razaoSocial;
	private double rendimentos;
	
	public Empresa(String razaoSocial, double rendimentos) {
		this.razaoSocial = razaoSocial;
		this.rendimentos = rendimentos;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public double getRendimentos() {
		return rendimentos;
	}

	@Override
	public String toString() {
		return "[razaoSocial=" + razaoSocial + ", rendimentos=" + rendimentos + "]";
	}
	
	@Override
	public double calculaIR() {
		return rendimentos * IR_PESSOA_JURIDICA;
	}
	
	@Override
	public double calculaICMS() {
		return rendimentos * ICMS;
	}
	
	
}
