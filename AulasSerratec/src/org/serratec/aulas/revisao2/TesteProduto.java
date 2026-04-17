package org.serratec.aulas.revisao2;

import org.serratec.aulas.revisao2.model.ProdutoDigital;
import org.serratec.aulas.revisao2.model.ProdutoFisico;

public class TesteProduto {

	public static void main(String[] args) {
		ProdutoFisico p1 = new ProdutoFisico("Livro", 50.0, 10.0);
		ProdutoDigital p2 = new ProdutoDigital("E-Book", 30.0);
		System.out.println(p1.getNome() + " : " + p1.calcularPreco());
		System.out.println(p2.getNome() + " : " + p2.calcularPreco());
	}

}
