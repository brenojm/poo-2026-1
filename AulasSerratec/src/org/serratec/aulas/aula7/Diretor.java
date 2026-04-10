package org.serratec.aulas.aula7;

public class Diretor extends Funcionario {
	private String categoria;
	
	public Diretor(String nome, String cpf, double salario, String turno, String categoria) {
		super(nome, cpf, salario, turno);
		this.categoria = categoria;
	}
	
	@Override
	public void aumentarSalario() {
		salario = (salario * 1.1) + 1000;
	}
}
