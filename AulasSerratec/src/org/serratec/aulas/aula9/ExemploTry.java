package org.serratec.aulas.aula9;

public class ExemploTry {
	public static int divisao(int i, int j) throws ArithmeticException {
		return i / j;
	}

	public static void main(String[] args) {
		try {
			System.out.println(divisao(20, 1));
		} catch (Exception e) {
			System.out.println("Erro! Divisão por zero! Troque o valor a dividir");
		} finally {
			System.out.println("Programa encerrado!");
		}

	}
}
