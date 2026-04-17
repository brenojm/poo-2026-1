package org.serratec.aulas.revisao2.model;

public class Pedido {
	private String id;
	
	public Pedido(String id) {
		this.id = id;
	}
	
	public void processar() {
		System.out.println("Processando pedido: " + id);
	}
}
