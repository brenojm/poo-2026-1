package org.serratec.aulas.aula6.teste;

import org.serratec.aulas.aula6.Cidade;
import org.serratec.aulas.aula6.Contato;
import org.serratec.aulas.aula6.EnderecoContato;
import org.serratec.aulas.aula6.Estado;
import org.serratec.aulas.aula6.Telefone;

public class TesteContato {

	public static void main(String[] args) {
		Estado rj = new Estado("Rio de Janeiro", "RJ");
		Cidade petropolis = new Cidade("Petrópolis", rj);
		EnderecoContato endereco = new EnderecoContato("Rua Fonseca Ramos 181", "Centro", "25685040", petropolis);
		
		Contato contato = new Contato("Roberta", endereco);
		
		Telefone t1 = new Telefone("2234-1250");
		Telefone t2 = new Telefone("2237-1350");
		
		Telefone[] telefones = {t1, t2};
		
		contato.setTelefones(telefones);
		
		System.out.println("Nome: " + contato.getNome());
		System.out.println("Endereco: " + contato.getEndereco().getRua() 
				+ " " + contato.getEndereco().getBairro() 
				+ " " + contato.getEndereco().getCidade().getNomeCidade() 
				+ " " + contato.getEndereco().getCidade().getEstado().getNomeEstado());
		
		contato.mostrarTelefones();
	}

}
