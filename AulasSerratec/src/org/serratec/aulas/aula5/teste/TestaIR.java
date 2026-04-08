package org.serratec.aulas.aula5.teste;

import org.serratec.aulas.aula5.PessoaFisica;
import org.serratec.aulas.aula5.PessoaJuridica;

public class TestaIR {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Breno", 10_000, "12345678901", "123456789");
		PessoaJuridica pj = new PessoaJuridica("João", 10_000, "123456789", "123456");
		
		System.out.println(pf.toString());
		pf.calculoIR();
		System.out.println(pj);
		pj.calculoIR();

	}

}
