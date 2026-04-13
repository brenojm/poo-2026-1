package org.serratec.exercicio2.teste;

import org.serratec.exercicio2.Caminhao;
import org.serratec.exercicio2.CarroPasseio;
import org.serratec.exercicio2.VeiculoBase;

public class TesteFrota {
	public static void main(String[] args) {
		VeiculoBase caminhao = new Caminhao("ABC-1234", 10.0, 4);
		VeiculoBase carro = new CarroPasseio("XYZ-9876", 1.5);

		System.out.println("Pedágio Caminhão: R$ " + caminhao.calcularPedagio());
		System.out.println("Pedágio Carro: R$ " + carro.calcularPedagio());
	}
}
