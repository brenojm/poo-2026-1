package org.serratec.aulas.aula6;

public class Endereco {
	private String rua;
	private String bairro;
	private String cidade;
	
	public Endereco(String rua, String bairro, String cidade) {
		setRua(rua);
		setBairro(bairro);
		setCidade(cidade);
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		if(rua != null && !rua.isBlank()) {
			this.rua = rua;
		} else {
			System.out.println("Rua é inválida!");
		}
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		if(bairro != null && !bairro.isBlank()) {
			this.bairro = bairro;
		} else {
			System.out.println("Bairro é inválida!");
		}
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		if(cidade != null && !cidade.isBlank()) {
			this.cidade = cidade;
		} else {
			System.out.println("Cidade é inválida!");
		}
	}

	@Override
	public String toString() {
		return "[rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + "]";
	}
	
	
	
	
}
