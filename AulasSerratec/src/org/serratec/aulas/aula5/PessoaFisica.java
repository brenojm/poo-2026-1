package org.serratec.aulas.aula5;

public class PessoaFisica extends ImpostoDeRenda {
	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}
	
	@Override
	public void calculoIR() {
		double ir = rendimentos * 0.12;
		System.out.println("IR: " + ir);
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " Rendimentos: " + rendimentos + " CPF: " + cpf;
	}
}
