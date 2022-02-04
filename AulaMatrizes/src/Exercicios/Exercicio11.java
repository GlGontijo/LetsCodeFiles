package Exercicios;

import java.util.Random;

public class Exercicio11 {
    // 11. Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao na diagonal secundaria.

    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matriz = new int[3][3];
        int soma = 0;

        System.out.println("Matriz:");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j] = rnd.nextInt(100);
                System.out.printf("%3d ",matriz[i][j]);
                // diagonal secundaria -> i+j = n-1
                if ((i + j) == (matriz.length - 1)){
                    soma += matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("\nA soma dos valores da diagonal secundaria da matriz é: "+soma);
    }
}
