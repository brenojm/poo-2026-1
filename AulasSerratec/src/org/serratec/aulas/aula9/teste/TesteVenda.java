package org.serratec.aulas.aula9.teste;

import java.time.LocalDate;

import org.serratec.aulas.aula9.Categoria;
import org.serratec.aulas.aula9.Produto;
import org.serratec.aulas.aula9.Venda;

public class TesteVenda {
	public static void main(String[] args) {
		Produto p1 = new Produto(1, "TV", 1000, Categoria.ELETRONICO);
		Produto p2 = new Produto(2, "Pneu", 400, Categoria.AUTOMOTIVO);
		Produto p3 = new Produto(3, "Celular", 2500, Categoria.ELETRONICO);
		
		Venda v1 = new Venda(p1, LocalDate.now(), 3);
		Venda v2 = new Venda(p2, LocalDate.now(), 2);
		Venda v3 = new Venda(p3, LocalDate.now(), 1);
		System.out.println("Total por Item:");
		System.out.println("=========================");
		v1.calcularVenda();
		v2.calcularVenda();
		v3.calcularVenda();
		System.out.println("=========================");
		System.out.println("Total geral da venda: R$" + Venda.getTotalVenda());
	}
}
