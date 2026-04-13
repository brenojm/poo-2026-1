package org.serratec.exercicio3;

public class IngressoVIP extends Ingresso {
	private double adicional;

	public IngressoVIP(double valorBase, double adicional) {
		super(valorBase);
		this.adicional = adicional;
	}

	@Override
	public double calcularValorFinal() {
		return super.calcularValorFinal() + this.adicional;
	}
}
