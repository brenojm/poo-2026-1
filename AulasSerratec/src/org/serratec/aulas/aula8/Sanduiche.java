package org.serratec.aulas.aula8;

public enum Sanduiche {
	HAMBURGUER("Hambúrguer", 10),
	CACHORRO_QUENTE("Cachorro Quente", 7.5),
	VEGETARIANO("Vegetariano", 8);
	
	private final String tipo;
	private final double valor;
	
	Sanduiche(String tipo, double valor) {
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
