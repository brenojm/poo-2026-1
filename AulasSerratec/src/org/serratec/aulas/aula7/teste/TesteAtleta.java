package org.serratec.aulas.aula7.teste;

import org.serratec.aulas.aula7.Atleta;
import org.serratec.aulas.aula7.Pais;

public class TesteAtleta {
	public static void main(String[] args) {
		Pais p1 = new Pais("Brasil");
		Pais p2 = new Pais("Estados-Unidos");
		
		Atleta a1 = new Atleta("Anderson Silva", 70, p1);
		Atleta a2 = new Atleta("Jon Jone", 61, p2);
		Atleta a3 = new Atleta("Vitor Belfort", 92, p1);
		
		System.out.println("Total de Participantes: " + Atleta.getTotalParticipantes());
		
	}
}
