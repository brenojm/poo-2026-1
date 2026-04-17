package org.serratec.aulas.aula12;

import java.io.Serializable;


/**
 * 
 * @author Breno Magrani
 * @since classe criada em abril de 2026
 * 
 */
public class Fornecedor implements Serializable {
	private static final Long serialVersionUID = 1L;
	
	/**
	 *  O cnpj é o identificador de uma empresa.
	 */
	private String cnpj;
	private String nome;
	
	public Fornecedor(String cnpj, String nome) {
		this.cnpj = cnpj;
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "[cnpj=" + cnpj + ", nome=" + nome + "]";
	}
	
	/**
	 * @author Admin
	 * @param valor double - valor pagamento
	 * @return	valor double - valor pago
	 * @throws IllegalArgumentException
	 */
	public double pagamentoFornecedor(double valor) throws IllegalArgumentException{
		return 0.0;
	}
	
	
	
}
