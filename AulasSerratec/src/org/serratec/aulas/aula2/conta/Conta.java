package org.serratec.aulas.aula2.conta;

public class Conta {
	int numero;
	double saldo;
	String titular;
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Deposito efetuado!");
	}
	
	public boolean saque(double valor) {
		if(this.saldo > valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
}
