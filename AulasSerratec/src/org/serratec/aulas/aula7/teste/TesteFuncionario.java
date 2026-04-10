package org.serratec.aulas.aula7.teste;

import org.serratec.aulas.aula7.Diretor;
import org.serratec.aulas.aula7.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Diretor("Ana", "12345678901", 6800, "Manha", "Produto");
		
		System.out.println(funcionario);
	}

}
