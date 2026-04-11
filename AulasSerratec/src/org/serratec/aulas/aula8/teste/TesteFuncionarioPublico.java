package org.serratec.aulas.aula8.teste;

import org.serratec.aulas.aula8.FuncionarioPublico;

public class TesteFuncionarioPublico {

	public static void main(String[] args) {
		FuncionarioPublico fb1 = new FuncionarioPublico("João", 4500, 2017);
		FuncionarioPublico fb2 = new FuncionarioPublico("Maria", 6000, 2015);
		FuncionarioPublico fb3 = new FuncionarioPublico("Antonio", 3200, 2020);
		
		System.out.println(fb1);
		System.out.println(fb2);
		System.out.println(fb3);
	}

}
