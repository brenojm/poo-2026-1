package org.serratec.aulas.revisao;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		conta.titular = "Ana Silva";
		conta.numero = 1001;
		conta.depositar(500.0); // Depósito: R$ 500,00 | Saldo: R$ 500,00
		conta.sacar(200.0); // Saque: R$ 200,00 | Saldo: R$ 300,00
		conta.sacar(400.0); // Saldo insuficiente
		conta.exibirDados();

	}

}
