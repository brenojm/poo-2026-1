package org.serratec.aulas.aula6.teste;

import org.serratec.aulas.aula6.Endereco;
import org.serratec.aulas.aula6.Funcionario;

public class TesteEndereco {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua Bingen 144", "Bingen", "Petrópolis");
		Funcionario funcionario = new Funcionario("Ana", "12345678901", endereco);
		
		System.out.println("Funcionario: " + funcionario + " Endereco: " + funcionario.getEndereco());
		
	}
}
