package org.serratec.aulas.aula9.teste;

public class ExercicioVetor {

	public static void main(String[] args) {
		int[] vetor1 = { 1, 2, 3, 4, 5 };
		int[] vetor2 = { 3, 0, 2 };
		
		for(int i = 0; i < vetor1.length; i++) {
			if(i >= vetor2.length) {
				System.out.println("Indice " + i + " está fora do limite de " + vetor2.length + " do vetor");
				break;
			}
			
			try {
				System.out.println(vetor1[i] / vetor2[i]);
			} catch (ArithmeticException e) {
				System.err.println("Erro ao dividir " + vetor1[i] + " por " + vetor2[i] + " - Divisão por zero");
			} catch (Exception e) {
				System.err.println("Erro inesperado: " + e.getMessage());
			}
			
		}

	}

}
