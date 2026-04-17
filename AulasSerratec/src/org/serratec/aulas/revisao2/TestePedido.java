package org.serratec.aulas.revisao2;

import java.util.Arrays;
import java.util.List;

import org.serratec.aulas.revisao2.model.Pedido;
import org.serratec.aulas.revisao2.service.ServicoPedido;

public class TestePedido {

	public static void main(String[] args) {
		Pedido p3 = new Pedido("103");
		List<Pedido> pedidos = Arrays.asList(new Pedido("101"), new Pedido("102"), p3);
		ServicoPedido servico = new ServicoPedido();
		servico.executar(pedidos);
	}

}
