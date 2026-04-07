package org.serratec.aulas.revisao;

public class Operadores {

	public static void main(String[] args) {
		double a = 10, b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
//		System.out.println((double) a / b);
		
		System.out.println(a > b);
		System.out.println(a == b);
		
		String s = "";
		if(s != null && s.length() > 0) {
			System.out.println("A variavel tem conteudo: " + s);
		}
		
		boolean r = (a > 0) && (b < 10) || !false; // !false = true
		System.out.println(r);

	}

}
