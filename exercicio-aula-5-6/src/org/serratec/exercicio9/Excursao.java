package org.serratec.exercicio9;

public class Excursao {
	private String destino;
	private Guia guia;
	private Turista[] turistas = new Turista[10];

	public Excursao(String destino, Guia guia) {
		this.destino = destino;
		this.guia = guia;
	}

	public void adicionarTurista(Turista t) {
		for (int i = 0; i < turistas.length; i++) {
			if (turistas[i] == null) {
				turistas[i] = t;
				break;
			}
		}
	}

	public void exibirExcursao() {
		System.out.println("Destino: " + destino + " | Guia: " + guia.getNome());
		System.out.println("Turistas inscritos:");
		for (Turista t : turistas) {
			if (t != null) {
				System.out.println("- " + t.getNome());
			}
		}
	}
}
