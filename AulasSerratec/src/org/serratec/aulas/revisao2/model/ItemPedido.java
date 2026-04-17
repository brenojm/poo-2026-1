package org.serratec.aulas.revisao2.model;

public class ItemPedido {
	private Produto produto;
	private int quantidade;
	
	public ItemPedido(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	public double getSubTotal() {
		return produto.calcularPreco() * quantidade;
	}
	
	
}
