package org.serratec.aulas.aula6.teste;

import org.serratec.aulas.aula6.Pedido;
import org.serratec.aulas.aula6.Prato;

public class TestePedido {
	public static void main(String[] args) {
		Prato p1 = new Prato("Lasanha", 45.9);
		Prato p2 = new Prato("Carbonara", 47.8);
		Prato p3 = new Prato("Nuggets", 15.9);
		
		Pedido pedido = new Pedido(10);
		
		pedido.adicionarItem(p1, 1);
		pedido.adicionarItem(p2, 2);
		pedido.adicionarItem(p3, 1);
		
		pedido.calcularTotalPedido();
		
		
	}
}
