package org.serratec.aulas.revisao2.model;

public class ProdutoFisico extends Produto {
	private double frete;

	public ProdutoFisico(String nome, double preco, double frete) {
		super(nome, preco);
		this.frete = frete;
	}
	
	@Override
	public double calcularPreco() {
		double resultado = preco + frete;
		return resultado;
	}
	
	
}
