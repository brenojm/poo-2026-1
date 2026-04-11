package org.serratec.aulas.aula8.selado;

//Exemplo herdando de classe filho com classe pai selada
public class Barco extends Carro {
	private double tamanho;
	
	public Barco(String chassi, String modelo, String categoria, double tamanho) {
		super(chassi, modelo, categoria);
		this.tamanho = tamanho;
	}
}
