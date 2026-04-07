package org.serratec.aulas.revisao;

public class Produto {
	// ─── Atributos privados
	private String nome;
	private double preco;
	private int estoque;

	// ─── GETTERS ──────────────────────────────────────────────────
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public boolean isDisponivel() {
		return estoque > 0;
	}

	// ─── SETTERS COM VALIDAÇÃO ────────────────────────────────────
	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			System.out.println("Nome inválido! Não pode ser vazio");
			return;
		}
		this.nome = nome.trim(); // remove espaços extras
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			System.out.println("Preço inválido! Deve ser maior que 0");
			return;
		}
			
		this.preco = preco;
	}

	public void setEstoque(int estoque) {
		this.estoque = Math.max(0, estoque); // nunca negativo
	}


}
