package org.serratec.aulas.aula8;

public class Pedido {
	private String dataPedido;
	private Bebida bebida;
	private Sanduiche sanduiche;
	
	public Pedido(String dataPedido, Bebida bebida, Sanduiche sanduiche) {
		this.dataPedido = dataPedido;
		this.bebida = bebida;
		this.sanduiche = sanduiche;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public Sanduiche getSanduiche() {
		return sanduiche;
	}
	
	public void calcularPedido() {
		System.out.println("--------Pedido--------");
		System.out.println("Bebida: " + bebida.getTipo());
		System.out.println("Valor: R$" + bebida.getValor());
		System.out.println("Sanduiche: " + sanduiche.getTipo());
		System.out.println("Valor: R$" + sanduiche.getValor());
		double resultado = bebida.getValor() + sanduiche.getValor();
		System.out.println("Total: R$" + resultado);
	}
	
	
}
