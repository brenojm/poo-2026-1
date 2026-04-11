package org.serratec.aulas.aula8;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;
	
	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}
	
	public int getCilindradas() {
		return cilindradas;
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
		valorCobrado += valorOleo;
		System.out.println("Oleo foi trocado! O valor cobrado foi: R$" + valorOleo);
		return valorCobrado;
	}

	@Override
	public double revisao() {
		double valorRevisao = TipoServico.REVISAO.getValorServico();
		valorCobrado += valorRevisao;
		System.out.println("Revisão realizada! O valor cobrado foi: R$" + valorRevisao);
		return valorCobrado;
	}
	
	
}
