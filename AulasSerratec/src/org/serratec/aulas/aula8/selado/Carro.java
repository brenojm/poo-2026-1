package org.serratec.aulas.aula8.selado;

public non-sealed class Carro extends VeiculoSelado {
	private String categoria;
	
	public Carro(String chassi, String modelo, String categoria) {
		super(chassi, modelo);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "[categoria=" + categoria + ", chassi=" + chassi + ", modelo=" + modelo + "]";
	}
	
	
	
	
}
