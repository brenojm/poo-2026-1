package org.serratec.aulas.revisao;

public class TesteFuncionario {

	public static void main(String[] args) {
		System.out.println(Funcionario.getTotalFuncionarios()); // 0

        Funcionario f1 = new Funcionario("Ana",   3000.0);
        Funcionario f2 = new Funcionario("Bruno", 4500.0);
        Funcionario f3 = new Funcionario("Carla", 5200.0);

        f1.exibir();  // [1] Ana — R$ 3000,00
        f2.exibir();  // [2] Bruno — R$ 4500,00

        System.out.println(Funcionario.getTotalFuncionarios()); // 3
        System.out.println("Salário mínimo: " + Funcionario.SALARIO_MINIMO);


	}

}
