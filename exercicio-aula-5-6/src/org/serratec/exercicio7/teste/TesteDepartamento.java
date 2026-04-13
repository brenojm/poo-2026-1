package org.serratec.exercicio7.teste;

import org.serratec.exercicio7.Departamento;
import org.serratec.exercicio7.Professor;

public class TesteDepartamento {
    public static void main(String[] args) {
        Professor p1 = new Professor("Breno", "MAT001");
        Professor p2 = new Professor("Ana", "MAT002");
        Professor p3 = new Professor("Carlos", "MAT003");
        
        Departamento ti = new Departamento("Tecnologia da Informação");
        ti.adicionarProfessor(p1);
        ti.adicionarProfessor(p2);
        ti.adicionarProfessor(p3);
        
        ti.listarProfessores();
    }
}
