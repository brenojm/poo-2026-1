package org.serratec.aulas.aula8;

import java.time.LocalDate;

public class Carro extends Veiculo {
	private String categoria;
	
	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}

	@Override
	public double lavarVeiculo() {
		double valorLavagem = TipoServico.LAVAGEM.getValorServico();
		valorCobrado += valorLavagem;
		System.out.println("Carro lavado! O valor cobrado foi: R$" + valorLavagem);
		return valorCobrado;
	}

	@Override
	public double trocarOleo() {
		double valorOleo = TipoServico.OLEO.getValorServico();
		if(dataConserto.getDayOfWeek().name().equals("SATURDAY")) {
			valorOleo -= 50;
		}
		valorCobrado += valorOleo;
		System.out.println("Oleo foi trocado! O valor cobrado foi: R$" + valorOleo);
		return valorCobrado;
	}

	@Override
	public double revisao() {
		double valorRevisao = TipoServico.REVISAO.getValorServico();
		if(dataConserto.getMonthValue() == 8) {
			valorRevisao = valorRevisao * 0.9;
		}
		
		valorCobrado += valorRevisao;
		System.out.println("Revisão realizada! O valor cobrado foi: R$" + valorRevisao);
		return valorCobrado;
	}
	
	
}
