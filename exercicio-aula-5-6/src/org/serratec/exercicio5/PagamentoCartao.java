package org.serratec.exercicio5;

public class PagamentoCartao extends Pagamento {
    private String bandeira;

    public PagamentoCartao(double valor, String data, String bandeira) {
        super(valor, data);
        this.bandeira = bandeira;
    }

    @Override
    public String toString() {
        return "Pagamento Cartão - Valor: R$ " + valor + ", Data: " + data + ", Bandeira: " + bandeira;
    }
}
