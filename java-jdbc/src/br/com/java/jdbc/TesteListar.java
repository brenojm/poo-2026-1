package br.com.java.jdbc;

import java.util.List;

import br.com.java.jdbc.model.Cliente;
import br.com.java.jdbc.persistance.ClienteDao;

public class TesteListar {

	public static void main(String[] args) {
		ClienteDao dao = new ClienteDao();
		List<Cliente> clientes = dao.listar();
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}

	}

}
