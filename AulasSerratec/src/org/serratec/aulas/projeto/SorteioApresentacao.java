package org.serratec.aulas.projeto;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SorteioApresentacao {

	public static void main(String[] args) {

		List<String> grupos = new ArrayList<>();

		grupos.add("Grupo 1");
		grupos.add("Grupo 2");
		grupos.add("Grupo 3");
		grupos.add("Grupo 4");
		grupos.add("Grupo 5");
		grupos.add("Grupo 6");
		grupos.add("Grupo 7");

		// O SecureRandom é um gerador aleatório e bem difícil de prever. Garante que o sorteio será o mais imparcial dentro do possível
		SecureRandom sorteador = new SecureRandom();

		// O shuffle na nossa lista de grupos, mistura todas as posições usando o sorteador que instanciamos.
		Collections.shuffle(grupos, sorteador);


		System.out.println("=== ORDEM DE APRESENTAÇÃO SORTEADA ===");
		for (int i = 0; i < grupos.size(); i++) {
			System.out.println((i + 1) + "º a apresentar: " + grupos.get(i));
		}
		System.out.println("======================================");
	}

}
