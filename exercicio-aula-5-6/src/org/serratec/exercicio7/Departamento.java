package org.serratec.exercicio7;

public class Departamento {
	private String nomeSetor;
	private Professor[] professores = new Professor[5];

	public Departamento(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public void adicionarProfessor(Professor p) {
		for (int i = 0; i < professores.length; i++) {
			if (professores[i] == null) {
				professores[i] = p;
				break;
			}
		}
	}

	public void listarProfessores() {
		System.out.println("Departamento: " + nomeSetor);
		for (Professor p : professores) {
			if (p != null) {
				System.out.println("- " + p.getNome());
			}
		}
	}
}
