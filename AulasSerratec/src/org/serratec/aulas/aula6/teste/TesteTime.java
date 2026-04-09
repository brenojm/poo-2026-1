package org.serratec.aulas.aula6.teste;

import org.serratec.aulas.aula6.Atleta;
import org.serratec.aulas.aula6.Time;

public class TesteTime {

	public static void main(String[] args) {
		Atleta a1 = new Atleta("Luís Henrique", 24);
		Atleta a2 = new Atleta("Bruno Henrique", 29);
		Atleta a3 = new Atleta("Davi Luiz", 36);
		
		Time time = new Time("Brasil", new Atleta[11]);
		
		time.adicionarAtleta(a1);
		time.adicionarAtleta(a2);
		time.adicionarAtleta(a3);
		
		time.mostrarAtletas();

	}

}
