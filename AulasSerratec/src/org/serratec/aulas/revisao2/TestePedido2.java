package org.serratec.aulas.revisao2;

import org.serratec.aulas.revisao2.model.Pedido2;
import org.serratec.aulas.revisao2.model.ProdutoDigital;
import org.serratec.aulas.revisao2.model.ProdutoFisico;

public class TestePedido2 {

	public static void main(String[] args) {
		Pedido2 pedido = new Pedido2("Cliente_123");
		pedido.adicionar(new ProdutoFisico("Mesa", 500.0, 100.0), 1);
		ProdutoDigital p2 = new ProdutoDigital("Licença Microsoft", 200.0);
		pedido.adicionar(p2, 2);
		
		System.out.println("Total do pedido: " + pedido.total());

	}

}
