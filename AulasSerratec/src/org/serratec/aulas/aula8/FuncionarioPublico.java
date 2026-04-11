package org.serratec.aulas.aula8;

public class FuncionarioPublico {
	private String nome;
	private double salario;
	private final int anoConcurso;
	
	public FuncionarioPublico(String nome, double salario, int anoConcurso) {
		this.nome = nome;
		this.salario = salario;
		this.anoConcurso = anoConcurso;
	}
//	Não pode ser modificado após atribuição, visto que é um atributo final
//	public void setAnoConcurso(int anoConcurso) {
//		this.anoConcurso = anoConcurso;
//	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " Salario: " + salario + " Ano do Concurso: " + anoConcurso;
	}
}
