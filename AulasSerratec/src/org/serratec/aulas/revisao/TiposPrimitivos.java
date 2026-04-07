package org.serratec.aulas.revisao;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//declaração explicita
		int idade = 25;
		long cpf = 12345678901L;
		double salario = 4_500.99;
		float taxa = 1.5f;
		boolean ativo = true;
		char nota = 'A';
		
		//var
		var nome = "Carlos";
		var total = 100;
		//var x; não declarado valor, causa erro
		
		double d = 9;
		int i = (int) d;
		System.out.println(i);
		
		int grande = 1_000_000;
		byte pequeno = (byte) grande; //pode ter perda de dados
		
		final double PI = 3.14159265;
		//PI = 6; não pode ser modificado pois é constante
		System.out.println(PI);
	}

}
