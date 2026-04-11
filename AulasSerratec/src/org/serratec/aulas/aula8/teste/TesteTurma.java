package org.serratec.aulas.aula8.teste;

import org.serratec.aulas.aula8.PeriodoCurso;
import org.serratec.aulas.aula8.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		Turma turma = new Turma(123, PeriodoCurso.TARDE);
		
		System.out.println("Turma: " + turma.getNumero());
		System.out.println("Dias: " + turma.getPeriodoCurso().getDias());
		System.out.println("Carga Horária: " + turma.getPeriodoCurso().getCargaHoraria());
		System.out.println("Valor: " + turma.getPeriodoCurso().getValor());
	}

}
