package Exercicios;

import java.util.Random;

public class Exercicio13 {
    // 13. Gere matriz 4 x 4 com valores no intervalo [1, 20]. Escreva um programa que transforme a matriz gerada numa
    // matriz triangular inferior, ou seja, atribuindo zero a todos os elementos acima da diagonal principal.
    // Imprima a matriz original e a matriz transformada.

    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];

        System.out.println("\nMatrizA:");
        for (int i=0; i < matrizA.length; i++){
            for (int j=0; j < matrizA[i].length; j++){
                matrizA[i][j] = rnd.nextInt(20);
                System.out.printf("%2d ",matrizA[i][j]);
                if (i<j){
                    matrizB[i][j] = 0;
                } else {
                    matrizB[i][j] = matrizA[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("\nMatrizB:");
        for (int[] linhaB : matrizB){
            for (int valorB : linhaB){
                System.out.printf("%2d ",valorB);
            }
            System.out.println();
        }
    }
}
