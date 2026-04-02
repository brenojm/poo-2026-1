package org.serratec.aulas.aula2;

public class ExCurtoCircuito {

	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int c = 10;
		boolean d = 1 == 10;
		
		if((a > 5) && (c > b)) {
			System.out.println("&& - Somente a primeira expressão é avaliada");
		}
		
		if((b == 5) || (c == 0)) {
			System.out.println("|| - Somente a primeira expressão é avaliada");
		}
		
		if((a > 5) & (c > b)) {
			System.out.println("& - Ambas expressões são avaliadas");
		}
		
		if((b == 5) | (c == 0)) {
			System.out.println("| - Ambas expressões são avaliadas");
		}
		System.out.println(d);
	}

}
