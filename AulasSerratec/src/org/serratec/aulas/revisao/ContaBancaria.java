package org.serratec.aulas.revisao;

public class ContaBancaria {
	String titular;
	int numero;
	double saldo;
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.printf("Deposito: %.2f | Saldo: %.2f%n", valor, saldo);
		//System.out.println("Deposito: " + valor + " | Saldo: " + saldo);
	}
	
	public boolean sacar(double valor) {
		if(valor > saldo) {
			System.out.println("Saldo insuficiente!");
			return false;
		}
		saldo -= valor;
		System.out.printf("Saque: %.2f | Saldo: %.2f%n", valor, saldo);
		return true;
	}
	
	public void exibirDados() {
		System.out.printf("Conta %d | %s | Saldo: R$ %.2f%n",
                numero, titular, saldo);

	}

}
