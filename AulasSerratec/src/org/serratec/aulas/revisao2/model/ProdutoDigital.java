package org.serratec.aulas.revisao2.model;

public class ProdutoDigital extends Produto{

	public ProdutoDigital(String nome, double preco) {
		super(nome, preco);
	}
	
	@Override
	public double calcularPreco() {
		return preco * 0.9;
	}
	
}
