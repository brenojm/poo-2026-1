package org.serratec.aulas.revisao;

public class Carro {
	String marca;
	String modelo;
	int ano;
	boolean ligado;
	
	public void ligar() {
		ligado = true;
		System.out.println(marca + " " + modelo + " ligado! Vrum!");
	}
	
	public void exibir() {
		System.out.printf("%s %s (%d) - %s%n", marca, modelo, ano, ligado ? "Ligado" : "Desligado");
	}
}
