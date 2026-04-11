package org.serratec.aulas.aula8;

public class PolicialFederal extends Policial {
	private String matricula;
	
	public PolicialFederal(String lotacao) {
		super(lotacao);
	}
	
	public final void mostrarValores() {
		System.out.println(cpf);
	}
}
