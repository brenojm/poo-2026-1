package org.serratec.aulas.aula8.teste;

import java.time.LocalDate;

import org.serratec.aulas.aula8.Carro;
import org.serratec.aulas.aula8.Proprietario;

public class TesteOficina {
	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("Joaquim");
		Carro carro = new Carro("Sandero", LocalDate.of(2026, 8, 10), proprietario, "Hatch");
	
		carro.trocarOleo();
		carro.revisao();
		carro.lavarVeiculo();
		
		System.out.println(carro);
	
	}
}
