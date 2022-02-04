package Exercicios;

import java.util.Random;

public class Exercicio04 {
    // 4. Leia uma matriz 4 x 4, imprima a matriz e retorne a localizac ̧ao (linha e a coluna) do maior valor.

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random rnd = new Random();
        int colunaMaior = 0;
        int linhaMaior = 0;

        System.out.println("Matriz:");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                matriz[i][j] = rnd.nextInt(100);
                if (matriz[i][j] > matriz[linhaMaior][colunaMaior]){
                    linhaMaior = i;
                    colunaMaior = j;
                }
                System.out.printf("%2d ",matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("O maior valor se encontra na linha "+linhaMaior+" e coluna "+colunaMaior);
    }
}
