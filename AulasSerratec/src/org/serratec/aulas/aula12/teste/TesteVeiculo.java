package org.serratec.aulas.aula12.teste;

import java.util.HashSet;
import java.util.Set;

import org.serratec.aulas.aula12.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		Set<Veiculo> veiculos = new HashSet();
		
		Veiculo v1 = new Veiculo("Toyota", "Corolla");
		veiculos.add(v1);
		Veiculo v2 = new Veiculo("Honda", "Civic");
		veiculos.add(v2);
		Veiculo v3 = new Veiculo("Ford", "Ka");
		veiculos.add(v3);
		
		Veiculo v4 = new Veiculo("Toyota", "Yaris");
		veiculos.add(v4);
		Veiculo v5 = new Veiculo("Toyota", "Yaris");
		veiculos.add(v5);
		Veiculo v6 = new Veiculo("Ford", "Focus");
		veiculos.add(v6);
		Veiculo v7 = new Veiculo("Ford", "Focus");
		veiculos.add(v7);
		
		for(Veiculo veiculo : veiculos) {
			System.out.println(veiculo);
		}
		
	}

}
