package org.serratec.aulas.aula9;

public class ExemploMult {
	public static void main(String[] args) {
		int vetor[] = { 5, 10, 20 };
		int i = 10, j = 0, resultado = 0;
		String texto = null;
		
		try {
			resultado = i / j;
			System.out.println(vetor[5]);
			System.out.println(texto.toUpperCase());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro! Indice fora de faixa!");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Erro! Divisão por zero!");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Erro! Valores nulos!");
		} catch (Exception e) {
			System.out.println("Erro inesperado!");
			e.printStackTrace();
		} finally {
			System.out.println("Programa finalizado!");
		}
	}
}
