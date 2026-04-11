package org.serratec.aulas.aula8.teste;

import org.serratec.aulas.aula8.Produto;
import org.serratec.aulas.aula8.ProdutoRecord;

public class TesteProduto {

	public static void main(String[] args) {
		ProdutoRecord produto = new ProdutoRecord("Celular", "Samsung A34");
		System.out.println(produto.nome());
		System.out.println(produto.descricao());
		produto.exibir();
		
		Produto produto2 = new Produto("TV", "SN3200");
		System.out.println(produto2.getNome());
		System.out.println(produto2.getDescricao());
		
		

	}

}
