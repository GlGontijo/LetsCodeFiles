package Exercicios;

public class Exercicio07 {
    // 7. Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos sao da forma:
    //    A[i][j] = 2i + 7j − 2 se i < j;
    //    A[i][j] = 3i² − 1 se i = j;
    //    A[i][j] = 4i³ − 5j² + 1 se i > j.

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        System.out.println("\nMatriz:");
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz[i].length; j++){
                if (i < j){
                    matriz[i][j] = (2*i)+(7*j)-2;
                } else if (i == j){
                    matriz[i][j] = (3*(i*i))-1;
                } else {
                    matriz[i][j] = (4*(i*i*i))-(5*(j*j))+1;
                }
                System.out.printf("%5d ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}
