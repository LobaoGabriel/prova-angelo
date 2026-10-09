package br.edu.unidiasup.motoristas;

public abstract class Motorista {
    private final String nome;
    private final String placaVeiculo;
    private int quantidadeCorridasMes;
    private double valorTotalArrecadadoBruto;

    public Motorista(String nome, String placaVeiculo) {
        this.nome = nome;
        this.placaVeiculo = placaVeiculo;
        this.quantidadeCorridasMes = 0;
        this.valorTotalArrecadadoBruto = 0.0;
    }

    public void registrarCorrida(double valor) {
        if (valor < 0.0) {
            throw new IllegalArgumentException("O valor da corrida não pode ser negativo.");
        }

        quantidadeCorridasMes++;
        valorTotalArrecadadoBruto += valor;
    }

    protected void acrescentarAoValorBruto(double valor) {
        valorTotalArrecadadoBruto += valor;
    }

    public abstract double calcularPagamentoLiquido();

    public String getNome() {
        return nome;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public int getQuantidadeCorridasMes() {
        return quantidadeCorridasMes;
    }

    public double getValorTotalArrecadadoBruto() {
        return valorTotalArrecadadoBruto;
    }
}
