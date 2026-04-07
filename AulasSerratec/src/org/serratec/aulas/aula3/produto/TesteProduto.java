package org.serratec.aulas.aula3.produto;

import javax.swing.JOptionPane;

public class TesteProduto {

		    public static void main(String[] args) {

		        String nome = "Ana";
		        int    idade = 21;
		        double altura = 1.68;

		        // ─── print / println ──────────────────────────────────────
		        System.out.print("Sem quebra de linha");
		        System.out.println(" — agora com quebra");
		        System.out.println("Concatenação: " + nome + " tem " + idade + " anos");
		        System.out.println();    // linha em branco

		        // ─── printf — saída formatada ─────────────────────────────
		        System.out.printf("Nome: %s%n", nome);
		        System.out.printf("Idade: %d anos%n", idade);
		        System.out.printf("Altura: %.2f m%n", altura);

		        // Tabela formatada com alinhamento
		        System.out.printf("%-15s %5s %8s%n", "Nome", "Idade", "Altura");
		        System.out.printf("%-15s %5d %8.2f%n", nome, idade, altura);
		        // %-15s = String alinhada à ESQUERDA com 15 chars de largura
		        // %5d  = inteiro com 5 chars (alinhado à direita)

		        // ─── String.format — para montar strings ──────────────────
		        String msg = String.format("Olá, %s! Você tem %d anos.", nome, idade);
		        System.out.println(msg);

		        // ─── JOptionPane — interface gráfica ──────────────────────
		        String entrada = JOptionPane.showInputDialog("Qual seu nome?");
		        JOptionPane.showMessageDialog(null, "Olá, " + entrada + "!");
		    }
		}
