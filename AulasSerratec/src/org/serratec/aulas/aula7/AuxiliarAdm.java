package org.serratec.aulas.aula7;

public class AuxiliarAdm extends Auxiliar {

	public AuxiliarAdm(String nome, String cpf, double salario, String turno, String categoria) {
		super(nome, cpf, salario, turno, categoria);
	}
	
	@Override
	public void aumentarSalario() {
		salario = (salario * 1.12) + 500;
	}

}
