package Exercicios;

import java.util.Random;

public class Exercicio18 {
    // 18. Faca um programa que permita ao usuario entrar com uma matriz de 3 x 3 numeros inteiros.
    // Em seguida, gere um array unidimensional pela soma dos numeros de cada coluna da matriz e mostrar na tela esse array.

    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matriz = new int[3][3];
        int[] vetorSoma = new int[3];

        System.out.println("\nMatriz:");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j] = rnd.nextInt(100);
                System.out.printf("%2d ",matriz[i][j]);
                vetorSoma[j] += matriz[i][j];
            }
            System.out.println();
        }

        System.out.println("\nVetor Soma das colunas da matriz:");
        for (int x : vetorSoma){
            System.out.printf("%2d ",x);
        }
        System.out.println();
    }
}
