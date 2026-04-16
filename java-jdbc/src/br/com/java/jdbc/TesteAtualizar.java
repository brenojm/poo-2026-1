package br.com.java.jdbc;

import br.com.java.jdbc.model.Cliente;
import br.com.java.jdbc.persistance.ClienteDao;

public class TesteAtualizar {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(4, "João Silva", "24988889997", "joao2@gmail.com");
		ClienteDao dao = new ClienteDao();
		dao.atualizar(cliente);
	}

}
