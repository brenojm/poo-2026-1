package org.serratec.aulas.aula7;

public class Poupanca implements Conta {
	private String titular;
	private double saldo;
	
	public Poupanca(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public void depositaConta(double valor) {
		if(valor < 0) {
			System.out.println("Valor é inválido!");
		} else {
			saldo += valor;
			System.out.println("Deposito efetuado! O saldo atual é: " + saldo);
		}
	}
	
	@Override
	public void sacaConta(double valor) {
		if(saldo < valor) {
			System.out.println("Saldo insuficiente, o saldo atual é: " + saldo);
		} else {
			saldo -= valor;
			System.out.println("Saque efetuado! O saldo atual é: " + saldo);
		}
	}
}
