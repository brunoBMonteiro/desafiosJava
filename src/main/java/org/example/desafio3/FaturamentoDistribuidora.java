package org.example.desafio3;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        //faturamento mensal por estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Calculando o valor total mensal da distribuidora
        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Calculando o percentual de representação de cada estado no faturamento mensal
        double percentualSP = (faturamentoSP / faturamentoTotal) * 100;
        double percentualRJ = (faturamentoRJ / faturamentoTotal) * 100;
        double percentualMG = (faturamentoMG / faturamentoTotal) * 100;
        double percentualES = (faturamentoES / faturamentoTotal) * 100;
        double percentualOutros = (faturamentoOutros / faturamentoTotal) * 100;

        // Exibindo os resultados
        System.out.println("Percentual de representação de cada estado no faturamento mensal:");
        System.out.println("SP: " + String.format("%.2f", percentualSP) + "%");
        System.out.println("RJ: " + String.format("%.2f", percentualRJ) + "%");
        System.out.println("MG: " + String.format("%.2f", percentualMG) + "%");
        System.out.println("ES: " + String.format("%.2f", percentualES) + "%");
        System.out.println("Outros: " + String.format("%.2f", percentualOutros) + "%");
    }
}
