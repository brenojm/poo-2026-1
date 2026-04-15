package org.serratec.aulas.aula10.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ExemploOutputStreamWriter {

	public static void main(String[] args) {
		try {
			OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("/Aula/teste.txt", true));
			out.append("\noi");
			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao acessar arquivo!");
		}
		

	}

}
