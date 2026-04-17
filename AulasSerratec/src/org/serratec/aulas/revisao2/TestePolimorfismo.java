package org.serratec.aulas.revisao2;

import java.util.ArrayList;
import java.util.List;

import org.serratec.aulas.revisao2.model.Produto;
import org.serratec.aulas.revisao2.model.ProdutoDigital;
import org.serratec.aulas.revisao2.model.ProdutoFisico;

public class TestePolimorfismo {

	public static void main(String[] args) {
		List<Produto> carrinho = new ArrayList<>();
		carrinho.add(new ProdutoFisico("Cadeira", 200.0, 50.0));
		ProdutoDigital pd = new ProdutoDigital("Curso Java", 150.0);
		carrinho.add(pd);
		
		for(Produto p : carrinho) {
			System.out.println(p.getNome() + " - Total: " + p.calcularPreco());
		}
	}

}
