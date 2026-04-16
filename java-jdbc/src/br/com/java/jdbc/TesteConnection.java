package br.com.java.jdbc;

import java.sql.Connection;

import br.com.java.jdbc.persistance.ConnectionFactory;

public class TesteConnection {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();

	}

}
