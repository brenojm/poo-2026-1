package org.serratec.aulas.aula12.teste;

import org.serratec.aulas.aula12.Proprietario;

public class TesteProprietario {

	public static void main(String[] args) {
		Proprietario p1 = new Proprietario(1, "Mariana");
		Proprietario p2 = new Proprietario(1, "Mariana");
		
		if(p1.equals(p2)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
	}

}
