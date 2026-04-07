package org.serratec.aulas.revisao;

public class TesteConta {

	public static void main(String[] args) {
		Conta c = new Conta();

		c.titular = "Maria"; // public acesso liberado
		// c.saldo = 5000; // ERRO: acesso negado
		c.tipo = "CC"; // package, liberado para classe dentro do mesmo pacote
		c.agencia = "001"; // protected, liberado pois está no mesmo pacote

		c.depositar(1000.0); // método public acesso liberado
		System.out.println(c.getSaldo()); // ✅ getter public

	}

}
