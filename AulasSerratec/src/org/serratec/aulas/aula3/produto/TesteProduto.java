package org.serratec.aulas.aula3.produto;

public class TesteProduto {

	public static void main(String[] args) {
//		Produto produto = new Produto("Celular");
//		System.out.println(produto.getNome());
//		
//		Produto produto2 = new Produto();
//		produto2.setNome("TV");
//		System.out.println(produto2.getNome());
		
		Produto produto = new Produto("Celular", 1000);
		Produto produto2 = new Produto("TV", 2500);
		
		System.out.println("Total de produtos: " + Produto.getTotalProdutos());
		

	}

}
