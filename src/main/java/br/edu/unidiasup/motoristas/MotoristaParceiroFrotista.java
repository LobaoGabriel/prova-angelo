package br.edu.unidiasup.motoristas;

public class MotoristaParceiroFrotista extends Motorista {
    private static final double taxaPlataforma = 0.20;
    private static final double aluguel = 800.00;

    public MotoristaParceiroFrotista(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = getValorTotalArrecadadoBruto() * (1.0 - taxaPlataforma)
                - aluguel;

        return Math.max(pagamentoLiquido, 0.0);
    }
}
