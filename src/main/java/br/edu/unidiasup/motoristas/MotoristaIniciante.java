package br.edu.unidiasup.motoristas;

public class MotoristaIniciante extends Motorista {
    private static final double taxaPlataforma = 0.25;
    private static final double taxaInatividade = 50.00;
    private static final int minCorridas = 5;

    public MotoristaIniciante(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoAposTaxa = getValorTotalArrecadadoBruto() * (1.0 - taxaPlataforma);

        if (getQuantidadeCorridasMes() < minCorridas) {
            pagamentoAposTaxa -= taxaInatividade;
        }

        return pagamentoAposTaxa;
    }
}
