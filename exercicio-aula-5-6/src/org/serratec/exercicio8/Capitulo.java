package org.serratec.exercicio8;

public class Capitulo {
	private String titulo;
	private int paginas;

	public Capitulo(String titulo, int paginas) {
		this.titulo = titulo;
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getPaginas() {
		return paginas;
	}
}