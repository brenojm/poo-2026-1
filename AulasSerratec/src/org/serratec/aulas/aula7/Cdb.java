package org.serratec.aulas.aula7;

public class Cdb implements Conta {
	private double saldo;
	private double iof;
	
	public Cdb(double saldo, double iof) {
		this.saldo = saldo;
		this.iof = iof;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setIof(double iof) {
		this.iof = iof;
	}
	
	@Override
	public void sacaConta(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
	}
	
	@Override
	public void depositaConta(double valor) {
		saldo += valor;
	}
}
