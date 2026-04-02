package org.serratec.aulas.aula2.aluno;

public class ExemploAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		a.codigo = 132;
		a.nome = "Joaquim";
		a.endereco = "Rua do Imperador 89";
		
		System.out.println("Nome: " + a.nome + "\nEndereço: " + a.endereco + "\nCodigo: " + a.codigo + "\nTelefone: " + a.telefone);
	}

}
