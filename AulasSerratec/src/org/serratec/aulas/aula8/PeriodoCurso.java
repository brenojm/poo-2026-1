package org.serratec.aulas.aula8;

public enum PeriodoCurso {
	NOTURNO("ter a qua", 2500, 40),
	INTEGRAL("seg a sex", 1800, 20),
	TARDE("qui a sex", 3200, 80);
	
	private String dias;
	private double valor;
	private int cargaHoraria;
	
	private PeriodoCurso(String dias, double valor, int cargaHoraria) {
		this.dias = dias;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
	
}
