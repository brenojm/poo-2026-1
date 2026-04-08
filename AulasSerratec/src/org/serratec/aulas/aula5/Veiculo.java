package org.serratec.aulas.aula5;

public class Veiculo {
	protected String placa;
	protected String chassi;
	protected String cor;
	protected double valor;
	protected double ipva;
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void calcularIPVA() {
		ipva = valor * 0.04;
	}
	
	public void mostrarIPVA() {
		System.out.println("IPVA: " + ipva);
	}
}
