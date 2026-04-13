package org.serratec.exercicio4;

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miado");
    }
    
    @Override
    public String toString() {
        return "Gato: " + nome + ", Idade: " + idade;
    }
}
