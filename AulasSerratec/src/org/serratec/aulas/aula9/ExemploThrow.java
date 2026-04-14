package org.serratec.aulas.aula9;

public class ExemploThrow {
	
	public static int divisao(int i, int j) throws ArithmeticException {
		return i / j;
	}
	
	public static void main(String[] args) {
			System.out.println(divisao(20, 0));
	}
}
