package org.serratec.aulas.aula12;

import java.util.Objects;

public class Proprietario {
	private int codigo;
	private String nome;
	
	public Proprietario(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Proprietario other = (Proprietario) obj;
		return codigo == other.codigo && Objects.equals(nome, other.nome);
	}
	
	

}
