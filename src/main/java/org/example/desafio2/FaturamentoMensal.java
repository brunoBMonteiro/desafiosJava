package org.example.desafio2;

public class FaturamentoMensal {
    public static void main(String[] args) {
        double[] faturamentoDiario = {1200.0, 1500.0, 800.0, 0.0, 0.0, 2500.0, 1300.0, 2000.0, 1750.0, 900.0, 1200.0,
                1000.0, 1800.0, 1600.0, 1350.0, 1100.0, 0.0, 0.0, 2200.0, 2500.0, 1900.0, 1000.0, 1500.0, 1700.0, 
                2000.0, 2300.0, 1200.0, 1350.0, 900.0, 1600.0};

        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];

        for (int i = 1; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] < menorFaturamento) {
                menorFaturamento = faturamentoDiario[i];
            }
            if (faturamentoDiario[i] > maiorFaturamento) {
                maiorFaturamento = faturamentoDiario[i];
            }
        }

        System.out.println("Menor faturamento diário: R$" + menorFaturamento);
        System.out.println("Maior faturamento diário: R$" + maiorFaturamento);

        double somaFaturamento = 0.0;
        int numDiasComFaturamento = 0;

        for (int i = 0; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > 0.0) {
                somaFaturamento += faturamentoDiario[i];
                numDiasComFaturamento++;
            }
        }
        double mediaMensal = somaFaturamento / numDiasComFaturamento;

        System.out.println("Média mensal de faturamento diário: R$" + mediaMensal);
        int numDiasAcimaDaMedia = 0;

        for (int i = 0; i < faturamentoDiario.length; i++) {
            if (faturamentoDiario[i] > mediaMensal) {
                numDiasAcimaDaMedia++;
            }
        }
        System.out.println("Número de dias com faturamento diário acima da média mensal: " + numDiasAcimaDaMedia);
    }
}
