package java;

import java.util.Scanner;

public class Exercicio16 {
    // 16) Faça um algoritmo que, dado um vetor de 50 números, imprimi-lo na ordem inversa à da leitura.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 50;
        int[] numeros = new int[contador];

        for (int i=0; i < numeros.length; i++){
            System.out.printf("Digite o %d numero:%n", i+1);
            numeros[i] = sc.nextInt();
        }
        System.out.println("Os "+numeros.length+" digitados, em ordem inversa, são:");
        for (int j = numeros.length-1; j >= 0; j--){
            System.out.printf("%d ",numeros[j]);
        }
    }
}
