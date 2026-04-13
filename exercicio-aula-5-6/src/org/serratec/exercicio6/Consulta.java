package org.serratec.exercicio6;

public class Consulta {
	private String data;
	private Medico medico;
	private Paciente paciente;

	public Consulta(String data, Medico medico, Paciente paciente) {
		this.data = data;
		this.medico = medico;
		this.paciente = paciente;
	}

	public void exibirDetalhes() {
		System.out.println("Consulta marcada para o dia " + data + ": Dr. " + medico.getNome() + " atenderá o paciente "
				+ paciente.getNome() + ".");
	}
}
