package org.serratec.aulas.aula5;

public class Maratona {
	protected String nome;
	protected String sexo;
	protected int idade;
	protected double altura;
	
	public Maratona(String nome, String sexo, int idade, double altura) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " Sexo: " + sexo + " Idade: " + idade + " Altura: " + altura;
	}
	
	public boolean verificaSituacao() {
		if(idade > 18 || altura >= 1.80) {
			return true;
		} else {
			return false;
		}
	}
	
	public void mostraSituacao() {
		boolean resultado = verificaSituacao();
		System.out.println(resultado ? "Participará!" : "Não Participará!");
	}
	
	
}
