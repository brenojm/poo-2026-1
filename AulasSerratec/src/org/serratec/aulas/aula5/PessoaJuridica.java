package org.serratec.aulas.aula5;

public class PessoaJuridica extends ImpostoDeRenda {
	private String cnpj;
	private String inscEstadual;
	
	public PessoaJuridica(String nome, double rendimentos, String cnpj, String inscEstadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}
	
	@Override
	public void calculoIR() {
		double ir = rendimentos * 0.15;
		System.out.println("IR: " + ir);
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " Rendimentos: " + rendimentos + " CNPJ: " + cnpj;
	}
	
}
