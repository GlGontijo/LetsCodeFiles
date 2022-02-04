package Exercicios;

public class Exercicio03 {
    // 3. Fac ̧a um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da
    //coluna de cada elemento. Em seguida, imprima na tela a matriz.

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j;
                System.out.printf("%2d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
