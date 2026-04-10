package org.serratec.aulas.aula7.teste;

import org.serratec.aulas.aula7.Livro;
import org.serratec.aulas.aula7.Operacao;

public class TesteLivro {

	public static void main(String[] args) {
		Livro l1 = new Livro("Aditya Y. Bhargava", "Entendendo Algoritmos", 53.48);
		Livro l2 = new Livro("Robert C. Martin", "Arquitetura Limpa", 101.81);
		
		Operacao o1 = new Operacao("EMPRESTIMO", l1);
		
		o1.emprestarLivro();
		
		Operacao o2 = new Operacao("VENDA", l2);
		
		o2.venderLivro();

	}

}
