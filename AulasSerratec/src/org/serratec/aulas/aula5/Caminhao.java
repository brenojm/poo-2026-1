package org.serratec.aulas.aula5;


public class Caminhao extends Veiculo {
	private int cargaMaxima;
	
	public int getCargaMaxima() {
		return cargaMaxima;
	}
	
	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	public void calcularIPVA() {
		ipva = valor * 0.01;
	}
}
