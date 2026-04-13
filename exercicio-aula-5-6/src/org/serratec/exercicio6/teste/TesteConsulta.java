package org.serratec.exercicio6.teste;

import org.serratec.exercicio6.Consulta;
import org.serratec.exercicio6.Medico;
import org.serratec.exercicio6.Paciente;

public class TesteConsulta {
	public static void main(String[] args) {
		Paciente paciente = new Paciente("João", "12345-6");
		Medico medico = new Medico("House", "CRM-9876");
		Consulta consulta = new Consulta("15/04/2026", medico, paciente);

		consulta.exibirDetalhes();
	}
}