package org.serratec.aulas.aula9;

import org.serratec.aulas.aula9.excecoes.ContaException;

public class ContaCorrente implements Conta {
	private String numero;
	private double saldo;
	
	public ContaCorrente(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "[numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	public boolean saque(double valor) {
		if(saldo < valor) {
			throw new ContaException("Valor não pode ser maior que saldo!");
		}
		saldo -= valor;
		return true;
	}
	
	public boolean deposito(double valor) {
		if(valor <= 0) {
			throw new ContaException("Valor deve ser maior que zero!");
		}
		saldo += valor;
		return true;
	}
	
	
}
