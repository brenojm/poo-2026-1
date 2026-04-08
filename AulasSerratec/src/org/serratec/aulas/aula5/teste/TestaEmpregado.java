package org.serratec.aulas.aula5.teste;

import org.serratec.aulas.aula5.Diretor;
import org.serratec.aulas.aula5.Empregado;
import org.serratec.aulas.aula5.Tecnico;

public class TestaEmpregado {

	public static void main(String[] args) {
		Empregado empregado1 = new Tecnico();
		empregado1.setNome("Maria Luiza");
		empregado1.setSalario(2000);
		empregado1.adicionalSalario();
		
		System.out.println("Nome: " + empregado1.getNome() + " Salario: " + empregado1.getSalario());
		
		Empregado empregado2 = new Diretor();
		empregado2.setNome("João");
		empregado2.setSalario(5000);
		empregado2.adicionalSalario();
		
		System.out.println("Nome: " + empregado2.getNome() + " Salario: " + empregado2.getSalario());
		
	}

}
