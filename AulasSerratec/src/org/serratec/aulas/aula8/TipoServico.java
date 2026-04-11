package org.serratec.aulas.aula8;

public enum TipoServico {
	OLEO(100),
	LAVAGEM(50),
	REVISAO(200);
	
	private final double valorServico;
	
	TipoServico(double valorServico) {
		this.valorServico = valorServico;
	}

	public double getValorServico() {
		return valorServico;
	}
	
}
