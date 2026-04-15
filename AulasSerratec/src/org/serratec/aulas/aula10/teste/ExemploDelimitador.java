package org.serratec.aulas.aula10.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploDelimitador {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("/Aula/exercicio.csv"));
			sc.useDelimiter(";");
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		}

	}

}
