package org.serratec.aulas.aula5;

public class AtletaProfissional extends Maratona {
	private double peso;
	
	public AtletaProfissional(String nome, String sexo, int idade, double altura, double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}
	
	@Override
	public boolean verificaSituacao() {
		if(idade > 18 || altura >= 1.80 || peso > 60) {
			return true;
		} else {
			return false;
		}
	}
}
