package org.serratec.aulas.aula5;

public class AtletaAmador extends Maratona {
	private boolean atestado;
	
	public AtletaAmador(String nome, String sexo, int idade, double altura, boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}
	
	@Override
	public boolean verificaSituacao() {
		if((idade > 18 || altura >= 1.80) && atestado) {
			return true;
		} else {
			return false;
		}
	}

}
