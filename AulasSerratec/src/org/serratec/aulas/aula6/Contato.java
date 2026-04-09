package org.serratec.aulas.aula6;

public class Contato {
	private String nome;
	private Telefone[] telefones;
	private EnderecoContato endereco;
	
	public Contato(String nome, EnderecoContato endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Telefone[] getTelefones() {
		return telefones;
	}
	
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	
	public EnderecoContato getEndereco() {
		return endereco;
	}
	
	public void mostrarTelefones() {
		for(int i = 0; i < telefones.length; i++) {
			if(telefones[i] != null) {
				System.out.println("Telefone: " + telefones[i].getNumero());
			}
		}
	}
	

}
