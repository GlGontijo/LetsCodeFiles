package Exercicios;

import java.util.Random;

public class Exercicio01 {
    // 1. Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int limite = 10;
        int cont = 0;
        Random rnd = new Random();

        System.out.println("Matriz[4][4]:");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j] = rnd.nextInt(100);
                if (matriz[i][j] > limite){ cont++;}
                System.out.printf("%2d ",matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("Na Matriz, "+cont+" elementos são maiores que 10.");
    }
}
