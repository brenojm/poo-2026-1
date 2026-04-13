package org.serratec.exercicio1.teste;

import org.serratec.exercicio1.Livro;
import org.serratec.exercicio1.Revista;

public class TesteBiblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro("Aprenda Java", "Autor X", 2024, 300);
        Revista revista = new Revista("Dev Magazine", "Editora Y", 2025, "Abril");
        
        System.out.println(livro.toString());
        System.out.println(revista.toString());
    }
}
