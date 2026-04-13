package org.serratec.exercicio4;

public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
    
    @Override
    public String toString() {
        return "Animal: " + nome + ", Idade: " + idade;
    }
}