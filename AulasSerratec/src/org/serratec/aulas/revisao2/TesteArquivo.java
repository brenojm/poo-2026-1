package org.serratec.aulas.revisao2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TesteArquivo {

	public static void main(String[] args) throws IOException {
//		CONTEUDO ARQUIVO
//		PEDIDO_01;CLIENTE_A
//
//		PEDIDO_02;CLIENTE_B
		File arquivo = new File("/Aula/pedido.csv");
		BufferedReader br = new BufferedReader(new FileReader(arquivo));
		
		String linha;
		
		while((linha = br.readLine()) != null) {
			if(linha.trim().isEmpty()) continue;
			// PEDIDO_01;CLIENTE_01;25.9
			// String[] valores = {"PEDIDO_01";"CLIENTE_01";"25.9"}
			String[] campos = linha.split(";");
			System.out.println("Novo bloco de entrada: Pedido - " + campos[0] + " Cliente - " + campos[1]);
		}
		br.close();
	}

}
