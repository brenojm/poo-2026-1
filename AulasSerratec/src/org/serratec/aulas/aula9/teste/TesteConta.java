package org.serratec.aulas.aula9.teste;

import org.serratec.aulas.aula9.ContaCorrente;
import org.serratec.aulas.aula9.excecoes.ContaException;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("12345-6", 2000);
		try {
			cc.deposito(-1000);
			cc.saque(4000);
		} catch (ContaException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		} finally {
			System.out.println(cc);
		}
		
		
	}

}
