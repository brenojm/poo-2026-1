package org.serratec.aulas.aula9;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraArquivo {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("teste.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		}
		
		
	}
}
