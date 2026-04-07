package org.serratec.aulas.revisao;

public class TesteProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
        p.setNome("Café Especial");
        p.setPreco(35.90);
        p.setEstoque(100);

        System.out.println(p.getNome());         // Café Especial
        System.out.println((p.isDisponivel()) ? "Disponível" : "Indisponível");    // true
        p.setPreco(-5);

	}

}
