package org.serratec.aulas.revisao;

import java.util.Scanner;

public class ExemploLaco {
	public static void main(String[] args) {

		// while
		int i = 6;
		while (i < 5) {
			System.out.print(i + " "); // 0 1 2 3 4
			i++;
		}

		// do...while
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			System.out.print("Digite um número positivo: ");
			numero = sc.nextInt();
		} while (numero <= 0); // repete enquanto inválido

		// for clássico
		for (int j = 0; j < 10; j++) {
			System.out.print(j + " "); // 0 1 2 3 4 5 6 7 8 9
		}

		// ─── break e continue ─────────────────────────────────────
		for (int k = 0; k < 10; k++) {
			if (k == 3) { continue; }
			if (k == 7)
				break; // para no 7
			System.out.print(k + " "); // 0 1 2 4 5 6
		}

	}
}
