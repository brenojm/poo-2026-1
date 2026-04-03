package org.serratec.aulas.aula3.pessoa;

public class TestePessoa {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Arthur");
		p.setPeso(70);
		p.setAltura(1.68);
		
		if(p.getPeso() > 0 && p.getAltura() > 0) {
			System.out.println(p.getNome() + " está com o " + p.resultado());
		} else {
			System.out.println("Peso e/ou altura é inválido!");
		}
		
	}
}
