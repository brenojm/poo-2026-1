package org.serratec.aulas.aula10.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploArquivo {

	public static void main(String[] args) {
		File arquivo = new File("/Aula/teste.txt");
		
		try {
			Scanner sc = new Scanner(arquivo);
			
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		}
		

	}

}
