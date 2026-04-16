package br.com.banco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.banco.config.ConnectionFactory;
import br.com.banco.model.Conta;

public class ContaDao {
	
	public Connection getConnection() {
		return new ConnectionFactory().getConnection();
	}
	
	public void inserirConta(Conta conta) {
		String sql = "insert into conta(numero_conta, titular, saldo) values(?,?,?)";
		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, conta.getNumeroConta());
			stmt.setString(2, conta.getTitular());
			stmt.setDouble(3, conta.getSaldo());
			stmt.execute();
		} catch (SQLException e) {
			System.err.println("Erro ao inserir conta");
		}
	}
	
	public List<Conta> listarConta() {
		String sql = "select * from conta";
		List<Conta> contas = new ArrayList<Conta>();
		try (Connection conn = getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Conta conta = new Conta(rs.getInt("numero_conta"),
						rs.getString("titular"),
						rs.getDouble("saldo"));
				contas.add(conta);
			}
		} catch (SQLException e) {
			System.err.println("Erro ao listar contas");
			e.printStackTrace();
		}
		return contas;
	}
	
	public Conta buscarConta(int numero_conta) {
		String sql = "select * from conta where numero_conta=?";
		Conta conta = null;
		try (Connection conn = getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setInt(1, numero_conta);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				conta = new Conta(rs.getInt("numero_conta"), rs.getString("titular"), rs.getDouble("saldo"));
			}
 		} catch (SQLException e) {
 			System.err.println(e);
 			e.printStackTrace();
 		}
		return conta;
	}
	
	public void apagarConta(int numero_conta) {
		String sql = "delete from conta where numero_conta=?";
		try (Connection connection = getConnection(); PreparedStatement stmt = connection.prepareStatement(sql)) {
			stmt.setInt(1, numero_conta);
			stmt.execute();
			System.out.println("Conta excluida!");
		} catch(SQLException e) {
			System.err.println(e);
 			e.printStackTrace();
		}
	}
	
	public void saqueDeposito(int numeroConta, double valor) {
		Conta conta = buscarConta(numeroConta);
		
		if(conta == null) {
			System.out.println("Conta " + numeroConta + " não foi encontrada");
			return;
		}
		
		if(valor < 0 && conta.getSaldo() + valor < 0) {
			System.out.println("Saldo insuficiente | Saldo: " + conta.getSaldo());
			return;
		}
		// 5000 + 500 = 5500
		// 5000 + -500 = 4500
		String sql = "update conta set saldo = saldo + ? where numero_conta=?";
		try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setDouble(1, valor);
			stmt.setInt(2, numeroConta);
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("Erro no saque ou deposito");
		}
		
		
	}
}
