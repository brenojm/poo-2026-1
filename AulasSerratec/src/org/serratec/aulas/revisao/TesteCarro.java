package org.serratec.aulas.revisao;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.marca = "Toyota";
		carro1.modelo = "Corolla";
		carro1.ano = 2023;
		carro1.ligar();
		
		Carro carro2 = new Carro();
		carro2.marca = "Honda";
		carro2.modelo = "Civic";
		carro2.ano = 2022;
		carro2.ligar();
		
		carro1.exibir();
		carro2.exibir();
		
		Carro alias = carro1;
		System.out.println(carro1);
		System.out.println(alias);
		
		alias.modelo = "Yaris";
		
		carro1.exibir();

	}

}
