package Exercicios;

import java.util.Random;

public class Exercicio23 {
    // 23. Faça um programa que leia uma matriz A de tamanho 3 x 3 e calcule B = A²

    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[matrizA.length][matrizA[0].length];

        System.out.println("\nMatrizA:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = random.nextInt(10);
                System.out.printf("%3d ", matrizA[i][j]);
            }
            System.out.println();
        }

        // verifica se o numero de colunas de matrizA é o mesmo que o numero de linhas de matrizB
        if (matrizA[0].length != matrizA.length) {
            System.out.println("O numero de colunas de MatrizA devia ser igual ao numero de linhas de MatrizB");
        }else {
            System.out.println("\nMatrizB = A²:");
            for (int i = 0; i < matrizB.length; i++) {
                for (int j = 0; j < matrizB[i].length; j++) {
                    int soma = 0;
                    for (int x = 0; x < matrizA[0].length; x++) {
                        soma = soma + (matrizA[i][x] * matrizA[x][j]);
                    }
                    matrizB[i][j] = soma;
                    System.out.printf("%3d ", matrizB[i][j]);
                }
                System.out.println();
            }
        }
    }
}
