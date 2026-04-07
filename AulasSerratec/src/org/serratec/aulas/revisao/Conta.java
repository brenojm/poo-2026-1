package org.serratec.aulas.revisao;

public class Conta {
	private double saldo; // só esta classe acessa
	protected String agencia; // subclasses e mesmo pacote acessam
	String tipo; // default: apenas mesmo pacote
	public String titular; // qualquer lugar acessa

	public void depositar(double valor) {
		if (valor > 0)
			saldo += valor; // valida antes de alterar!
	}

	public double getSaldo() {
		return saldo;
	} // leitura controlada
}
