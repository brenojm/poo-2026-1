package org.serratec.aulas.aula3.pessoa;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double calcularIMC() {
		double imc = peso / (altura * altura);
		double imcRound = (double)Math.round((double)imc * 100) / 100;
		System.out.println(imcRound);
		return imc;
	}
	
	public String resultado() {
		double imc = calcularIMC();
		if(imc < 18.5) {
			return "Abaixo do Peso";
		} else if (imc < 24.9) {
			return "Peso Normal";
		} else {
			return "Acima do peso";
		}
	}
}
