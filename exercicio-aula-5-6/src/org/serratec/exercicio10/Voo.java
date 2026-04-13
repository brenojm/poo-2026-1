package org.serratec.exercicio10;

public class Voo {
	private int numeroVoo;
	private String companhia;
	private Passageiro[] passageiros;

	public Voo(int numeroVoo, String companhia) {
		this.numeroVoo = numeroVoo;
		this.companhia = companhia;
		this.passageiros = new Passageiro[50];
	}

	public void fazerCheckIn(Passageiro p) {
		for (int i = 0; i < passageiros.length; i++) {
			if (passageiros[i] == null) {
				passageiros[i] = p;
				break;
			}
		}
	}

	public void mostrarLotacao() {
		int contador = 0;
		for (Passageiro p : passageiros) {
			if (p != null) {
				contador++;
			}
		}
		System.out.println(
				"O Voo " + numeroVoo + " da " + companhia + " possui " + contador + " passageiros confirmados.");
	}
}
