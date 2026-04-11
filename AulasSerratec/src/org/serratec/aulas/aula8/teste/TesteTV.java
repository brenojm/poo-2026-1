package org.serratec.aulas.aula8.teste;

import org.serratec.aulas.aula8.MarcaTV;
import org.serratec.aulas.aula8.TV;

public class TesteTV {

	public static void main(String[] args) {
		TV tv = new TV(MarcaTV.SAMSUNG, "SN3200");
		System.out.println(tv);
		
		for(MarcaTV marca : MarcaTV.values()) {
			System.out.println(marca);
		}

	}

}
