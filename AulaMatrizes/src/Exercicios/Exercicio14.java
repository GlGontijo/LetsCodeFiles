package Exercicios;

import java.util.Random;

public class Exercicio14 {
    // 14. Faça um programa para gerar automaticamente numeros entre 0 e 99 de uma cartela de bingo.
    // Sabendo que cada cartela devera conter 5 linhas de 5 números, gere estes dados de modo a nao ter números
    // repetidos dentro das cartelas. O programa deve exibir na tela a cartela gerada.

    public static void main(String[] args) {
        int[][] cartela = new int[5][5];
        int min, max;

        System.out.println(" B | I  | N  | G  | O  |");
        for (int i=0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                // valores padrão por coluna do Bingo
                switch (j){
                    case 0: min = 1; max = 15; break;
                    case 1: min = 16; max = 30; break;
                    case 2: min = 31; max = 45; break;
                    case 3: min = 46; max = 60; break;
                    default: min = 61; max = 75;
                }
                int n = rndFaixa(min,max);
                // sem valores repetidos
                int x=0;
                while (x < cartela[i].length){
                    if (cartela[x][j] == n){
                        n = rndFaixa(min, max);
                        x = 0;
                    }
                    x++;
                }
                cartela[i][j] = n;
                System.out.printf("%2d | ", cartela[i][j]);
            }
            System.out.println();
        }
    }

    public static int rndFaixa(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }
}
