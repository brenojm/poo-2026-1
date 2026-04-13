package org.serratec.exercicio2;

public class CarroPasseio extends VeiculoBase {

	public CarroPasseio(String placa, double pesoTon) {
		super(placa, pesoTon);
	}

	@Override
	public double calcularPedagio() {
		return 8.0;
	}
}
