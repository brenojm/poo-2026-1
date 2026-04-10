package org.serratec.aulas.aula7;

public class Gerente extends Funcionario {
	private String nivel;

	public Gerente(String nome, String cpf, double salario, String turno, String nivel) {
		super(nome, cpf, salario, turno);
		this.nivel = nivel;
	}
	
	@Override
	public void aumentarSalario() {
		salario = (salario * 1.15) + 500;
	}
}
