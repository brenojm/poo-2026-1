package org.serratec.aulas.aula10.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new InputStreamReader(new FileInputStream("/Aula/teste.txt"), "UTF-8"));
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		
		} catch (IOException e) {
			System.out.println("Erro ao acessar arquivo!");
		}

	}

}
