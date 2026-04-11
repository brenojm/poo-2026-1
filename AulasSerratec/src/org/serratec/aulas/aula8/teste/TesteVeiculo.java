package org.serratec.aulas.aula8.teste;

import org.serratec.aulas.aula8.selado.Carro;
import org.serratec.aulas.aula8.selado.Moto;

public class TesteVeiculo {
	public static void main(String[] args) {
		Carro carro = new Carro("12345678", "Honda Civic", "Coupe");
		Moto moto = new Moto("23456789", "Honda Biz", true);
		
		System.out.println("Carro: " + carro);
		System.out.println("Moto: " + moto);
	}
}
