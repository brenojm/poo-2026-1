package org.serratec.aulas.revisao2.service;

import java.util.List;

import org.serratec.aulas.revisao2.model.Pedido;

public class ServicoPedido {
	public void executar(List<Pedido> pedidos) {
//		Fazem a mesma coisa
//		for(Pedido pedido : pedidos) {
//			pedido.processar();
//		}
		pedidos.forEach(Pedido::processar);
	}
}
