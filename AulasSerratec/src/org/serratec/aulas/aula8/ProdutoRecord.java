package org.serratec.aulas.aula8;

public record ProdutoRecord(String nome, String descricao) {
	
	public void exibir() {
		System.out.println("Teste Record! " + nome() + " " + descricao());
	}
	
}
