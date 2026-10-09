package br.edu.unidiasup.motoristas;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    private static final NumberFormat FORMATO_MOEDA = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));

    public static void main(String[] args) {
        MotoristaIniciante motoristaIniciante = new MotoristaIniciante("Jayne Chaves", "ABC1D23");
        motoristaIniciante.registrarCorrida(100.00);
        motoristaIniciante.registrarCorrida(120.00);
        motoristaIniciante.registrarCorrida(80.00);

        MotoristaPremium motoristaPremium = new MotoristaPremium("Gabriel Mendoncinha", "DEF4G56");
        motoristaPremium.registrarCorrida(100.00);
        motoristaPremium.registrarCorrida(120.00);
        motoristaPremium.registrarCorrida(80.00);

        MotoristaParceiroFrotista motoristaFrotista = new MotoristaParceiroFrotista("Ynara Stanislavovna", "GHI7J89");
        motoristaFrotista.registrarCorrida(300.00);
        motoristaFrotista.registrarCorrida(250.00);
        motoristaFrotista.registrarCorrida(200.00);

        imprimirExtrato("MOTORISTA INICIANTE", motoristaIniciante);
        imprimirExtrato("MOTORISTA PREMIUM", motoristaPremium);
        imprimirExtrato("MOTORISTA PARCEIRO FROTISTA", motoristaFrotista);
    }

    private static void imprimirExtrato(String categoria, Motorista motorista) {
        System.out.println("========================================");
        System.out.println("EXTRATO DE PAGAMENTO - " + categoria);
        System.out.println("========================================");
        System.out.println("Nome: " + motorista.getNome());
        System.out.println("Placa do veículo: " + motorista.getPlacaVeiculo());
        System.out.println("Corridas realizadas: " + motorista.getQuantidadeCorridasMes());
        System.out.println("Valor bruto: " + FORMATO_MOEDA.format(motorista.getValorTotalArrecadadoBruto()));
        System.out.println("Valor líquido a receber: " + FORMATO_MOEDA.format(motorista.calcularPagamentoLiquido()));
        System.out.println();
    }
}
