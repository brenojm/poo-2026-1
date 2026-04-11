package org.serratec.aulas.aula8.teste;

import org.serratec.aulas.aula8.Bebida;
import org.serratec.aulas.aula8.Pedido;
import org.serratec.aulas.aula8.Sanduiche;

public class TestePedido {

	public static void main(String[] args) {
		mostrarCardapio();
		
		Pedido pedido = new Pedido("10/04/2026", Bebida.REFRIGERANTE, Sanduiche.HAMBURGUER);
		pedido.calcularPedido();
	}
	
	public static void mostrarCardapio() {
		System.out.println("--------Bebidas--------");
		for(Bebida bebida : Bebida.values()) {
			System.out.println("Tipo: " + bebida.getTipo());
			System.out.println("Valor: R$" + bebida.getValor());
		}
		System.out.println("--------Sanduiches--------");
		for(Sanduiche sanduiche : Sanduiche.values()) {
			System.out.println("Tipo: " + sanduiche.getTipo());
			System.out.println("Valor: R$" + sanduiche.getValor());
		}
	}

}
