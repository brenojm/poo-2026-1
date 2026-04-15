package org.serratec.aulas.aula10.teste;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExemploBufferedReader {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Aula/teste.txt"));
			while(br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
		} catch (IOException e) {
			System.out.println("Erro ao acessar o arquivo");
		}
		

	}

}
