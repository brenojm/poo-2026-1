package org.serratec.aulas.aula2.aluno;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = a1;
		
		System.out.println(a1);
		System.out.println(a2);
		
		if(a1 == a3) {
			System.out.println("Refs são iguais");
		} else {
			System.out.println("Refs são diferentes");
		}

	}

}
