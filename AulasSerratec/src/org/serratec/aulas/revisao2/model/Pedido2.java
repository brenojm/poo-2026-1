package org.serratec.aulas.revisao2.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido2 {
	private String idCliente;
	List<ItemPedido> itens;
	public Pedido2(String idCliente) {
		this.idCliente = idCliente;
		this.itens = new ArrayList<ItemPedido>();
	}
	
	public void adicionar(Produto p, int q) {
		itens.add(new ItemPedido(p, q));
	}
	
	public double total() {
//		Fazem a mesma coisa
//		double total = 0;
//		for(ItemPedido item : itens) {
//			total += item.getSubTotal();
//		}
		return itens.stream().mapToDouble(i -> i.getSubTotal()).sum();
	}
	
	
}	
