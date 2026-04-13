package org.serratec.exercicio2;

public class VeiculoBase {
	protected String placa;
	protected double pesoTon;

	public VeiculoBase(String placa, double pesoTon) {
		this.placa = placa;
		this.pesoTon = pesoTon;
	}

	public double calcularPedagio() {
		return 5.0 * pesoTon;
	}
}