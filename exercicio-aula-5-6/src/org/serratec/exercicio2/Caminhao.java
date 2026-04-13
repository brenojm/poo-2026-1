package org.serratec.exercicio2;

public class Caminhao extends VeiculoBase {
    private int quantidadeEixos;

    public Caminhao(String placa, double pesoTon, int quantidadeEixos) {
        super(placa, pesoTon);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularPedagio() {
        return super.calcularPedagio() + (2.0 * quantidadeEixos);
    }
}
