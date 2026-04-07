package org.serratec.aulas.revisao;

public class TesteExemploEscopo {

	public static void main(String[] args) {
        ExemploEscopo obj1 = new ExemploEscopo();
        ExemploEscopo obj2 = new ExemploEscopo();

        obj1.valorInstancia = 100;          // altera só obj1
        ExemploEscopo.contadorClasse = 99;                // altera PARA TODOS

        System.out.println(obj2.valorInstancia);  // 10  (não foi alterado)
        System.out.println(obj2.contadorClasse);  // 99  (compartilhado!)
    }


}
