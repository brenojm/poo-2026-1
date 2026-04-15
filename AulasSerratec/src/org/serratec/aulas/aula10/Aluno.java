package org.serratec.aulas.aula10;

public class Aluno {
	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String paraCSV() {
		return nome + ";" + idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
}
