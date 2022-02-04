package Exercicios;

import java.util.Random;

public class Exercicio05 {
    // 5. Leia uma matriz 5 x 5. Leia tambem um valor  ́ X. O programa devera fazer uma busca desse valor na matriz e,
    // ao final, escrever a localizac ̧ao (linha e coluna) ou uma mensagem de “nao encontrado”.

    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matriz = new int[5][5];
        int x = rnd.nextInt(100);
        boolean existeX = false;

        System.out.println("\nMatriz:");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j] = rnd.nextInt(100);
                System.out.printf("%2d ",matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nNa matriz, o elemento "+x+" pode ser encontrado:");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                if (matriz[i][j] == x){
                    existeX = true;
                    System.out.println("Na Linha "+i+" e Coluna "+j);
                }
            }
        }

        if (!existeX){
            System.out.println("Elemento não encontrado!");
        }
    }
}
