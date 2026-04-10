package org.serratec.aulas.aula7;

public class Assistente extends Funcionario {
	private double adicional;
	
	public Assistente(String nome, String cpf, double salario, String turno, double adicional) {
		super(nome, cpf, salario, turno);
		this.adicional = adicional;
	}

	@Override
	public void aumentarSalario() {
		salario = (salario * 1.15) + 500;
	}
}
