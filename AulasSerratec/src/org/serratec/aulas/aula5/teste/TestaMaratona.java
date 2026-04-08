package org.serratec.aulas.aula5.teste;

import org.serratec.aulas.aula5.AtletaAmador;
import org.serratec.aulas.aula5.AtletaProfissional;

public class TestaMaratona {

	public static void main(String[] args) {
		AtletaAmador a1 = new AtletaAmador("João", "M", 17, 1.70, true);
		AtletaAmador a2 = new AtletaAmador("Maria", "F", 19, 1.71, false);
		AtletaProfissional a3 = new AtletaProfissional("Carlos", "M", 25, 1.86, 90);
		
		System.out.println(a1);
		a1.mostraSituacao();
		System.out.println(a2);
		a2.mostraSituacao();
		System.out.println(a3);
		a3.mostraSituacao();
	}

}
