package org.serratec.aulas.aula6;

public class EnderecoContato {
	private String rua;
	private String bairro;
	private String cep;
	private Cidade cidade;
	
	public EnderecoContato(String rua, String bairro, String cep, Cidade cidade) {
		this.rua = rua;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}
	
	public String getRua() {
		return rua;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCep() {
		return cep;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
}
