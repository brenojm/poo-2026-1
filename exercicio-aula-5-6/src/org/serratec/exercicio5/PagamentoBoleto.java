package org.serratec.exercicio5;

public class PagamentoBoleto extends Pagamento {
	private String codigoBarras;

	public PagamentoBoleto(double valor, String data, String codigoBarras) {
		super(valor, data);
		this.codigoBarras = codigoBarras;
	}

	@Override
	public String toString() {
		return "Pagamento Boleto - Valor: R$ " + valor + ", Data: " + data + ", Código: " + codigoBarras;
	}
}
