package Exercicios;

import java.util.Random;

public class Exercicio12 {
    // 12. Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta.

    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matrizA = new int[3][3];
        int[][] matrizT = new int[3][3];

        System.out.println("\nMatrizA:");
        for (int i=0; i < matrizA.length; i++){
            for (int j=0; j < matrizA[i].length; j++){
                matrizA[i][j] = rnd.nextInt(100);
                matrizT[j][i] = matrizA[i][j];
                System.out.printf("%3d ",matrizA[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nTransposta da MatrizA:");
        for (int[] linha : matrizT){
            for (int valor : linha){
                System.out.printf("%3d ",valor);
            }
            System.out.println();
        }
    }
}
