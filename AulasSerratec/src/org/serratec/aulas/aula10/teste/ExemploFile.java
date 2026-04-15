package org.serratec.aulas.aula10.teste;

import java.io.File;
import java.util.Scanner;

public class ExemploFile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe o nome de um arquivo ou diretorio:\n");
		String nome = ler.nextLine();
		
		File file = new File(nome);
		
		if(file.exists()) {
			if(file.isFile()) {
				System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes\n", file.getName(), file.length());
			} else {
				System.out.printf("\nConteudo do diretorio:\n");
				String diretorio[] = file.list();
				for(String item : diretorio) {
					System.out.printf("%s\n", item);
				}
			}
		} else {
			System.out.printf("Arquivo ou diretorio informado nao existe!\n");
		}

	}

}
