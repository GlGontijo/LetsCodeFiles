package Exercicios;

import java.util.Random;

public class Exercicio09 {
    // 9. Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estao abaixo da diagonal principal.

    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matriz = new int[3][3];
        int soma = 0;

        System.out.println("Matriz:");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j] = rnd.nextInt(100);
                System.out.printf("%3d ",matriz[i][j]);
                if (i > j){
                    soma += matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("\nA soma dos valores abaixo da diagonal principal da matriz é: "+soma);
    }
}
