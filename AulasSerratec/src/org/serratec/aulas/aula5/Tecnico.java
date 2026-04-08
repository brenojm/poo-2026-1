package org.serratec.aulas.aula5;

public class Tecnico extends Empregado {
	
	@Override
	public void adicionalSalario() {
		salario += salario * 0.10;
	}
}
