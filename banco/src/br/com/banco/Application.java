package br.com.banco;

import java.util.List;

import br.com.banco.dao.ContaDao;
import br.com.banco.model.Conta;

public class Application {

	public static void main(String[] args) {
		ContaDao dao = new ContaDao();
		
		System.out.println("Inserindo Contas: ");
		dao.inserirConta(new Conta(1003, "Alan Turing", 1500.00));
		dao.inserirConta(new Conta(1004, "Ada Lovelace", 2000.00));
		
		System.out.println("Realizando transações: ");
		dao.saqueDeposito(1003, 500);
		dao.saqueDeposito(1004, -100);
		
		dao.saqueDeposito(1004, -5000);
		
		for(Conta conta: dao.listarConta()) {
			System.out.println(conta);
		}
	}

}
