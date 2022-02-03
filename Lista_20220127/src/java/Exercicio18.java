package java;

import java.util.Scanner;

public class Exercicio18 {
    // 18) Elabore um algoritmo que leia um vetor A de 30 números inteiros e imprima o maior valor.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 30;
        int[] A = new int[contador];
        int maiorNumero = 0;

        for (int i = 0; i < A.length; i++) {
            System.out.printf("Digite o %dº número:%n", i + 1);
            A[i] = sc.nextInt();
            if (i == 0) {
                maiorNumero = A[i];
            } else if (A[i] > maiorNumero) {
                maiorNumero = A[i];
            }
        }

        System.out.printf("%nO MAIOR número é %d. ", maiorNumero);
    }
}
