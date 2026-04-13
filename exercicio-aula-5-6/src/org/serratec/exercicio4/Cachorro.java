package org.serratec.exercicio4;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }
    
    @Override
    public String toString() {
        return "Cachorro: " + nome + ", Idade: " + idade;
    }
}
