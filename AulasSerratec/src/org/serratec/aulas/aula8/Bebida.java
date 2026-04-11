package org.serratec.aulas.aula8;

public enum Bebida {
	REFRIGERANTE("Refrigerante", 8),
	SUCO("Suco", 9),
	AGUA("Agua", 4);
	
	private final String tipo;
	private final double valor;
	
	Bebida(String tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public double getValor() {
		return valor;
	}
}
