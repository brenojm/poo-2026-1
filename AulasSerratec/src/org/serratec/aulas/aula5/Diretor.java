package org.serratec.aulas.aula5;

public class Diretor extends Empregado {
	
	@Override
	public void adicionalSalario() {
		salario += salario * 0.25;
	}
}
