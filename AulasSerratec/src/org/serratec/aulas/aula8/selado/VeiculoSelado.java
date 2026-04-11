package org.serratec.aulas.aula8.selado;

public sealed abstract class VeiculoSelado permits Carro, Moto {
	protected String chassi;
	protected String modelo;
	
	public VeiculoSelado(String chassi, String modelo) {
		this.chassi = chassi;
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
}
