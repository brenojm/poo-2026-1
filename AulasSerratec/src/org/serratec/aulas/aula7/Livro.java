package org.serratec.aulas.aula7;

public class Livro {
	private String autor;
	private String titulo;
	private double valor;
	
	public Livro(String autor, String titulo, double valor) {
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "[autor=" + autor + ", titulo=" + titulo + ", valor=" + valor + "]";
	}
	
	public void reajuste(double valor) {
		if(valor > 0) {
			this.valor = valor;
			System.out.println("Valor do livro reajustado!");
		} else {
			System.out.println("Valor passado é inválido!");
		}
	}
	
	
}
