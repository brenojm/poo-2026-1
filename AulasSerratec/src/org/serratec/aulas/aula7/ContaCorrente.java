package org.serratec.aulas.aula7;

public class ContaCorrente implements Conta {
	private double saldo;
	private double taxa;

	public ContaCorrente(double saldo, double taxa) {
		this.saldo = saldo;
		this.taxa = taxa;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public void sacaConta(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
		}

	}

	@Override
	public void depositaConta(double valor) {
		saldo += valor;
	}

}
