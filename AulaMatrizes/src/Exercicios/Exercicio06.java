package Exercicios;

import java.util.Random;

public class Exercicio06 {
    // 6. Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posicao das matrizes lidas.

    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        int[][] matrizC = new int[4][4];

        for (int i=0; i < 4; i++){
            for (int j=0; j < 4; j++){
                matrizA[i][j] = rnd.nextInt(100);
                matrizB[i][j] = rnd.nextInt(100);
                if (matrizA[i][j] >= matrizB[i][j]){
                    matrizC[i][j] = matrizA[i][j];
                } else {
                    matrizC[i][j] = matrizB[i][j];
                }
            }
        }

        System.out.println("\nMatrizA:");
        for (int linha[] : matrizA){
            for (int valor : linha){
                System.out.printf("%2d ",valor);
            }
            System.out.println();
        }
        System.out.println("\nMatrizB:");
        for (int linha[] : matrizB){
            for (int valor : linha){
                System.out.printf("%2d ",valor);
            }
            System.out.println();
        }
        System.out.println("\nMatrizC:");
        for (int linha[] : matrizC){
            for (int valor : linha){
                System.out.printf("%2d ",valor);
            }
            System.out.println();
        }
    }
}
