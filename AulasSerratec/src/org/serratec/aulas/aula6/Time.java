package org.serratec.aulas.aula6;

public class Time {
	private String nome;
	private Atleta[] atletas;
	
	public Time(String nome, Atleta[] atletas) {
		this.nome = nome;
		this.atletas = atletas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Atleta[] getAtletas() {
		return atletas;
	}
	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}
	
	@Override
	public String toString() {
		return "Time: " + nome;
	}
	
	public void adicionarAtleta(Atleta atleta) {
		for(int i = 0; i < atletas.length; i++) {
			if(atletas[i] == null) {
				atletas[i] = atleta;
				return;
			}
		}
	}
	
	public void mostrarAtletas() {
		System.out.println("Time: " + nome);
		for(int i = 0; i < atletas.length; i++) {
			if(atletas[i] != null) {
				System.out.println(i + " " + "Nome: " + atletas[i].getNome());
			} else {
				return;
			}
		}
	}
	
	
}
