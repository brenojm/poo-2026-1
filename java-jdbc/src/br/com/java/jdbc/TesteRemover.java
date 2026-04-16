package br.com.java.jdbc;

import java.util.Scanner;

import br.com.java.jdbc.persistance.ClienteDao;

public class TesteRemover {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do cliente: ");
		int codigo = sc.nextInt();
		sc.nextLine();
		ClienteDao dao = new ClienteDao();
		dao.remover(codigo);

	}

}
