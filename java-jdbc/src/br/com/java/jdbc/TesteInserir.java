package br.com.java.jdbc;

import java.util.List;
import java.util.Scanner;

import br.com.java.jdbc.model.Cliente;
import br.com.java.jdbc.persistance.ClienteDao;

public class TesteInserir {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Telefone: ");
		String telefone = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		Cliente cliente = new Cliente(nome, telefone, email);
		ClienteDao dao = new ClienteDao();
		dao.inserir(cliente);


	}

}
