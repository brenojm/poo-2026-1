package org.serratec.aulas.aula8;

public class TV {
	private MarcaTV marca;
	private String modelo;
	
	public TV(MarcaTV marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public MarcaTV getMarca() {
		return marca;
	}

	public void setMarca(MarcaTV marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "TV [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
}
