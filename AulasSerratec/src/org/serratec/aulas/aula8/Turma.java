package org.serratec.aulas.aula8;

public class Turma {
	private int numero;
	private PeriodoCurso periodo;
	
	public Turma(int numero, PeriodoCurso periodo) {
		this.numero = numero;
		this.periodo = periodo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public PeriodoCurso getPeriodoCurso() {
		return periodo;
	}
	
	public String toString() { 
		return periodo.getDias() + "-" + periodo.getCargaHoraria();
	}
}
