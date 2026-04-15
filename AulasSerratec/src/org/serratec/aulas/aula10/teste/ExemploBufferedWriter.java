package org.serratec.aulas.aula10.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploBufferedWriter {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("/Aula/teste.txt", true));
			bw.newLine();
			bw.write("abc");
			bw.close();
		} catch (IOException e) {
			System.out.println("Erro ao acessar o arquivo!");
		}
		

	}

}
