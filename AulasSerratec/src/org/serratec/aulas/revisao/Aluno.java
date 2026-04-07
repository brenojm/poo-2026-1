package org.serratec.aulas.revisao;

public class Aluno {
	private String nome;
	private int matricula;
	private double media;

	// ─── 1. Construtor padrão (default) ──────────────────────────
	// Se não declararmos nenhum, Java cria este implicitamente.
	// Ao declarar qualquer construtor, ele deixa de existir automaticamente.
	public Aluno() {
		this.media = 0.0; // inicializa com valor padrão
	}

	// ─── 2. Construtor com parâmetros ─────────────────────────────
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.media = 0.0;
	}

	// ─── 3. Sobrecarga — outro construtor com mais parâmetros ──────
	public Aluno(String nome, int matricula, double media) {
		this(nome, matricula); // ← reutiliza o construtor acima
		this.media = media; // this() DEVE ser a 1ª instrução!
	}

	@Override
	public String toString() {
		return String.format("Aluno[%s, mat.%d, média=%.1f]", nome, matricula, media);
	}

}
