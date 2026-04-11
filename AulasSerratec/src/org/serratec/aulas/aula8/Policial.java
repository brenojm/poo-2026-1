package org.serratec.aulas.aula8;

public class Policial {
	protected String nome;
	protected String cpf;
	protected final String lotacao;
	
	public Policial(String lotacao) {
		this.lotacao = lotacao;
	}
	
	public final void imprimirDados() {
		System.out.println("cpf: " + cpf + "-" + "nome: " + nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLotacao() {
		return lotacao;
	}
	
	
}
