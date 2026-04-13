package org.serratec.exercicio5.teste;

import org.serratec.exercicio5.PagamentoBoleto;
import org.serratec.exercicio5.PagamentoCartao;

public class TestePagamento {
	public static void main(String[] args) {
		PagamentoCartao pgCartao = new PagamentoCartao(150.0, "15/04/2026", "Visa");
		PagamentoBoleto pgBoleto = new PagamentoBoleto(300.0, "20/04/2026", "12345678901234567890");

		System.out.println(pgCartao.toString());
		System.out.println(pgBoleto.toString());
	}
}
