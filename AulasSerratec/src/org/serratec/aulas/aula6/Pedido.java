package org.serratec.aulas.aula6;

public class Pedido {
	private int numMesa;
	private ItemPedido[] itens;
	
	public Pedido(int numMesa) {
		this.numMesa = numMesa;
		this.itens = new ItemPedido[5];
	}
	
	public int getNumMesa() {
		return numMesa;
	}
	
	public void adicionarItem(Prato prato, int quantidade) {
		ItemPedido item = new ItemPedido(prato, quantidade);
		for(int i = 0; i < itens.length; i++) {
			if(itens[i] == null) {
				itens[i] = item;
				return;
			}
		}
	}
	
	public void calcularTotalPedido() {
		double totalPedido = 0;
		for(int i = 0; i < itens.length; i++) {
			if(itens[i] != null) {
				System.out.println("Prato: " + itens[i].getPrato().getNome() 
						+ " | " + itens[i].getQuantidade() + " * " + itens[i].getPrato().getValor());
				System.out.println("Subtotal: " + itens[i].calcularSubTotal());
				totalPedido += itens[i].calcularSubTotal();
			}
		}
		totalPedido += totalPedido * 0.1;
		System.out.println("Total: " + totalPedido);
	}
}
