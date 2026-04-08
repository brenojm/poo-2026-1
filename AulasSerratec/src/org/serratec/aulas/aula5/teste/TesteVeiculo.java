package org.serratec.aulas.aula5.teste;

import org.serratec.aulas.aula5.Caminhao;
import org.serratec.aulas.aula5.VeiculoPasseio;

public class TesteVeiculo {

	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao();
		VeiculoPasseio vp = new VeiculoPasseio();
		
		vp.setPlaca("ABC-1234");
		vp.setQuantPortas(4);
		vp.setValor(50_000);
		vp.calcularIPVA();
		vp.mostrarIPVA();
		
		caminhao.setPlaca("BCD-2345");
		caminhao.setCargaMaxima(2_000);
		caminhao.setValor(50_000);
		caminhao.calcularIPVA();
		caminhao.mostrarIPVA();
		
		System.out.println("Placa: " + vp.getPlaca() + " QntPortas: " + vp.getQuantPortas());
		System.out.println("Placa: " + caminhao.getPlaca() + " CargaMaxima: " + caminhao.getCargaMaxima());
		
	}

}
