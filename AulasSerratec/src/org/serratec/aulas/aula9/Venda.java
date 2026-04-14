package org.serratec.aulas.aula9;

import java.time.LocalDate;

public class Venda implements FinalizarVenda{
	private Produto produto;
	private LocalDate dataCompra;
	private int quantidade;
	
	private static double totalVenda;
	
	public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public LocalDate getDataCompra() {
		return dataCompra;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public static double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public String toString() {
		return "[produto=" + produto + ", dataCompra=" + dataCompra + ", quantidade=" + quantidade + "]";
	}
	
	public void calcularVenda() {
		totalVenda += produto.getValor() * quantidade;
		mostrarVenda();
	}
	
	private void mostrarVenda() {
		double valorVenda = (produto.getValor() * quantidade);
		System.out.println(produto.getDescricao() + " - Valor: R$" + produto.getValor() + " Quantidade: " + quantidade + " Total: R$" + valorVenda);
	}
	
	
}
