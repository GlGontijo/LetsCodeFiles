package Exercicios;

import java.util.Random;

public class Exercicio20 {
    // 20. Faça programa que leia uma matriz 3 x 6 com valores reais.
    // (a) Imprima a soma de todos os elementos das colunas ımpares.
    // (b) Imprima a media aritmetica dos elementos da segunda e quarta colunas.
    // (c) Substitua os valores da sexta coluna pela soma dos valores das colunas 1 e 2.
    // (d) Imprima a matriz modificada.

    public static void main(String[] args) {
        Random rnd = new Random();
        double[][] matrizReal = new double[3][6];
        double soma = 0;
        double media;
        int qtdElementos = 0;

        System.out.println("\nMatrizReal:");
        for (int i=0; i < matrizReal.length; i++){
            for (int j=0; j < matrizReal[i].length; j++){
                matrizReal[i][j] = rnd.nextInt(100);
                System.out.printf("%6.2f ",matrizReal[i][j]);
            }
            System.out.println();
        }

        System.out.println("\na)");
        for (double[] linhas : matrizReal) {
            for (int j = 0; j < linhas.length; j++) {
                // indices pares são colunas impares
                if (j % 2 == 0){
                    soma += linhas[j];
                }
            }
        }
        System.out.printf("A soma de todos os elementos das colunas ímpares = %.2f\n",soma);

        System.out.println("\nb)");
        soma = 0;
        for (double[] linhas : matrizReal) {
            for (int j = 0; j < linhas.length; j++) {
                // indices das colunas 2 e 4
                if (j == 1 || j == 3) {
                    soma += linhas[j];
                    qtdElementos++;
                }
            }
        }
        media = soma / qtdElementos;
        System.out.printf("A media de todos os elementos das colunas 2 e 4 = %.2f\n",media);

        System.out.println("\nc) e d)");
        System.out.println("Matriz Nova:");
        for (double[] linhas : matrizReal) {
            linhas[5] = (linhas[0] + linhas[1]);
            for (double valor : linhas){
                System.out.printf("%6.2f ",valor);
            }
            System.out.println();
        }
    }
}
