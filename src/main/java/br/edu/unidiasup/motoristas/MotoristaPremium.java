package br.edu.unidiasup.motoristas;

public class MotoristaPremium extends Motorista {

    private static final double taxaPlataforma = 0.15;
    private static final double bonusPorCorrida = 2.00;

    public MotoristaPremium(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public void registrarCorrida(double valor) {
        if (valor < 0.0) {
            throw new IllegalArgumentException(
                    "O valor da corrida não pode ser negativo."
            );
        }

        super.registrarCorrida(valor + bonusPorCorrida);
    }

    @Override
    public double calcularPagamentoLiquido() {
        return getValorTotalArrecadadoBruto() * (1.0 - taxaPlataforma);
    }
}