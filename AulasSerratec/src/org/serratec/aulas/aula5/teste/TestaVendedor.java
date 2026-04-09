package org.serratec.aulas.aula5.teste;

import java.util.Scanner;

import org.serratec.aulas.aula5.Fixo;
import org.serratec.aulas.aula5.Vendedor;

public class TestaVendedor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcao = 'N';
		int opcaoVendedor;
		double valorVenda;
		double totalVendido = 0;
		
		
		Fixo f1 = new Fixo("Joana", "12345678901", 2000, 3);
		Fixo f2 = new Fixo("Maria", "12345678902", 2000, 5);
		
		Fixo[] vendedores = {f1, f2};
		
		System.out.println("----------------Sistema de Vendas----------------");
		System.out.println("Vendedores: ");
		System.out.println("1-" + f1.getNome());
		System.out.println("2-" + f2.getNome());
		
		while(opcao == 'N') {
			System.out.println("Escolha o vendedor: ");
			opcaoVendedor = sc.nextInt();
			
			System.out.println("Digite o valor da venda: ");
			valorVenda = sc.nextDouble();
			
			if(opcaoVendedor == 1) {
				f1.calcularSalario(valorVenda);
			} else {
				f2.calcularSalario(valorVenda);
			}
			totalVendido += valorVenda;
			
			System.out.println("Deseja encerrar o programa?");
			opcao = sc.next().charAt(0);
		}
		
		System.out.println("----------------Salário dos vendedores----------------");
		System.out.println("nome: " + f1.getNome());
		System.out.println("salario: " + f1.getSalarioBruto());
		System.out.println("nome: " + f2.getNome());
		System.out.println("salario: " + f2.getSalarioBruto());
		System.out.println("----------------Total vendido----------------");
		System.out.println("Total: " + totalVendido);
	}
}
