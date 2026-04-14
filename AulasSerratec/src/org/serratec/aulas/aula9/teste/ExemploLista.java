package org.serratec.aulas.aula9.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExemploLista {

	public static void main(String[] args) {
		List<String> alunos = new ArrayList<>();
		alunos.add("Breno");
		alunos.add("João");
		alunos.add("Maria");
		alunos.add("Breno");
		
		List<String> filaEspera = new LinkedList<>();
		filaEspera.add("Davi");
		filaEspera.add("Helena");
		
		Set<String> materias = new HashSet<>();
		materias.add("Java POO");
		materias.add("Spring API");
		materias.add("Java POO");
		
		Set<String> aprovados = new TreeSet<>();
		aprovados.add("Zeca");
		aprovados.add("Beatriz");
		aprovados.add("Bernardo");
		
		Collections.sort(alunos);
		
		Collections.shuffle(alunos);
		
		String primeiroAprovado = Collections.min(aprovados);
		
		Collections.reverse(alunos);
		
		System.out.println("Alunos (Sort/Shuffle):" + alunos);
		System.out.println("Fila de Espera (LinkedList): " + filaEspera);
		System.out.println("Grade de Matérias (HashSet): " + materias);
		System.out.println("Lista de Aprovados (TreeSet): " + aprovados);
		System.out.println("Primeiro Aprovado da Lista em Ordem Alfabetica: " + primeiroAprovado);

	}

}
