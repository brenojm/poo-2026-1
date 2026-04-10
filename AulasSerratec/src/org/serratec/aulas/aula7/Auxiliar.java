package org.serratec.aulas.aula7;

public abstract class Auxiliar extends Funcionario {
	protected String categoria;
	
	public Auxiliar(String nome, String cpf, double salario, String turno, String categoria) {
		super(nome, cpf, salario, turno);
		this.categoria = categoria;
	}

}
