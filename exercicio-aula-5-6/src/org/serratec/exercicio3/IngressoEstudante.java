package org.serratec.exercicio3;

public class IngressoEstudante extends Ingresso {
	public IngressoEstudante(double valorBase) {
		super(valorBase);
	}

	@Override
	public double calcularValorFinal() {
		return super.calcularValorFinal() * 0.5;
	}
}