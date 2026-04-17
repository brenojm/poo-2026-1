package org.serratec.aulas.aula12.teste;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import org.serratec.aulas.aula12.Fornecedor;

public class TesteFornecedorLeitura {

	public static void main(String[] args) {
		System.out.println("Leitura dos objetos");
		List<Fornecedor> fornecedores = new ArrayList();
		System.out.println("Recuperando objeto");
		try {
			FileInputStream arqLeitura = new FileInputStream("/Aula/fornecedor.dat");
			ObjectInputStream lerObjeto = new ObjectInputStream(arqLeitura);
			fornecedores = (List<Fornecedor>)lerObjeto.readObject();
			lerObjeto.close();
			arqLeitura.close();
			System.out.println(fornecedores);
		} catch (Exception e) {
			System.err.println("Erro");
			e.printStackTrace();
		}

	}

}
