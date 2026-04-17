package org.serratec.aulas.revisao2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.serratec.aulas.revisao2.exception.PedidoInvalidoException;

public class TesteException {

	
	public static void main(String[] args) {
		try {
//			CONTEUDO ARQUIVO
//			PEDIDO_01;25
//
//			PEDIDO_02;50
			File arquivo = new File("/Aula/pedido2.csv");
			BufferedReader br = new BufferedReader(new FileReader(arquivo));
			
			String linha;
			
			while((linha = br.readLine()) != null) {
				if(linha.trim().isEmpty()) continue;

				String[] campos = linha.split(";");
				
				if(campos.length < 2) throw new PedidoInvalidoException("Linha incompleta");
				// "25" -> 25
				double quantidade = Double.parseDouble(campos[1]);
				int quantidadeInt = (int)quantidade;
				
				System.out.println("Quantidade: " + quantidadeInt);
			}
			br.close();
		} catch (NumberFormatException e) {
			System.err.println("Erro de formato: " + e.getMessage());
		} catch (PedidoInvalidoException e) {
			System.err.println("Regra Violada: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Erro ao acessar arquivo");
		}
		

	}

}
