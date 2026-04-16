package br.com.java.jdbc.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	String url = "jdbc:postgresql://localhost:5432/cliente";
	String usuario = "postgres";
	String senha = "jogadornumero01";
	private Connection connection;
	
	public Connection getConnection() {
		System.out.println("Conectando ao banco de dados...");
		try {
			connection = DriverManager.getConnection(url, usuario, senha);
			if(connection != null) {
				System.out.println("Conectado com sucesso!");
			} else {
				System.out.println("Erro nos dados da conexão!");
			}
		} catch(SQLException e) {
			System.err.println("Não foi possível conectar...");
			e.printStackTrace();
		}
		return connection;
	}
}
