package org.serratec.aulas.revisao;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno("Maria", 1001);
		Aluno a3 = new Aluno("João", 1002, 8.5);

		System.out.println(a1); // Aluno[null, mat.0, média=0,0]
		System.out.println(a2); // Aluno[Maria, mat.1001, média=0,0]
		System.out.println(a3); // Aluno[João, mat.1002, média=8,5]
	}

}
