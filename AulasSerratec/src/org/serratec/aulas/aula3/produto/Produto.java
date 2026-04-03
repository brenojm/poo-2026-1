package org.serratec.aulas.aula3.produto;

public class Produto {
	private String nome;
	private double valor;
	
	private static int totalProdutos;
	
//	public Produto() {
//		
//	}
//
//	public Produto(String nome) {
//		this.nome = nome;
//	}
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
		totalProdutos++;
	}
	
	public static int getTotalProdutos() {
		return totalProdutos;
	}
	
	public static void setTotalProdutos(int totalProdutos) {
		Produto.totalProdutos = totalProdutos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
