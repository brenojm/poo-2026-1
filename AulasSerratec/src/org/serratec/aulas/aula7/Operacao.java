package org.serratec.aulas.aula7;

public class Operacao implements Livraria {
	private String tipo;
	private double valorOperacao;
	private Livro livro;
	
	public Operacao(String tipo, Livro livro) {
		this.tipo = tipo;
		this.livro = livro;
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public double getValorOperacao() {
		return valorOperacao;
	}

	@Override
	public String toString() {
		return "[tipo=" + tipo + ", valorOperacao=" + valorOperacao + ", livro=" + livro + "]";
	}
	
	@Override
	public void emprestarLivro() {
		if(tipo.equals("EMPRESTIMO")) {
			System.out.println("Livro: " + livro.getTitulo() + " está sendo emprestado");
			valorOperacao = (livro.getValor() * 0.02) + TAXA_LIVRO;
			System.out.println("Valor: " + valorOperacao);
		} else {
			System.out.println("Tipo da operação não condiz com emprestar livro");
		}
		
	}
	
	@Override
	public void venderLivro() {
		if(tipo.equals("VENDA")) {
			System.out.println("Livro: " + livro.getTitulo() + " comprado");
			valorOperacao = livro.getValor() * 1.09;
			System.out.println("Valor: " + valorOperacao);
		} else {
			System.out.println("Tipo da operação não condiz com vender livro");
		}
		
	}
	
}
