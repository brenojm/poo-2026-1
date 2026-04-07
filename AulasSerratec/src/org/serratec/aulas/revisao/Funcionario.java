package org.serratec.aulas.revisao;

public class Funcionario {
	 // ─── Atributo ESTÁTICO — pertence à CLASSE ────────────────────
    private static int    totalFuncionarios = 0;
    public  static final double SALARIO_MINIMO = 1412.00;  // constante

    // ─── Atributos de INSTÂNCIA — pertencem ao OBJETO ─────────────
    private int    id;
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        totalFuncionarios++;             // atualiza contador da CLASSE
        this.id      = totalFuncionarios;
        this.nome    = nome;
        this.salario = salario;
    }

    // ─── Método ESTÁTICO — pertence à CLASSE ──────────────────────
    public static int getTotalFuncionarios() {
        return totalFuncionarios;
        // ❌ NÃO pode usar: this.nome  (não há objeto associado!)
        // ❌ NÃO pode usar: nome, salario (atributos de instância)
    }

    // ─── Método de INSTÂNCIA — pertence ao OBJETO ─────────────────
    public void exibir() {
        System.out.printf("[%d] %s — R$ %.2f%n", id, nome, salario);
    }

}
