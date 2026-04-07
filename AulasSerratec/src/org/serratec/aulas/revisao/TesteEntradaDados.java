package org.serratec.aulas.revisao;

import java.util.Scanner;

public class TesteEntradaDados {

	public static void main(String[] args) {

		// 1. Instanciar o Scanner ligado ao teclado (System.in)
		Scanner sc = new Scanner(System.in);

		// 2. Ler String — nextLine lê a linha inteira
		System.out.print("Nome completo: ");
		String nome = sc.nextLine();

		// 3. Ler inteiro
		System.out.print("Idade: ");
		int idade = sc.nextInt();

		// 4. Limpar o \n residual antes do próximo nextLine
		sc.nextLine();

		// 5. Ler decimal
		System.out.print("Altura (ex: 1.75): ");
		double altura = sc.nextDouble();
		sc.nextLine(); // limpar novamente

		// 6. Ler uma única palavra
		System.out.print("Cidade: ");
		String cidade = sc.nextLine();

		// 7. Exibir resultado formatado
		System.out.printf("%nResumo:%n");
		System.out.printf("Nome:   %s%n", nome);
		System.out.printf("Idade:  %d anos%n", idade);
		System.out.printf("Altura: %.2f m%n", altura);
		System.out.printf("Cidade: %s%n", cidade);

		// 8. Boas práticas: fechar o recurso
		sc.close();
	}

}
