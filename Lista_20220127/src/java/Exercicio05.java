package java;

import java.util.Scanner;

public class Exercicio05 {
    // 5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
    // Armazene os números pares no vetor PAR e os números ÍMPARES no vetor ímpar.
    // Imprima os três vetores.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 20;
        int contadorPar = 0;
        int contadorImpar = 0;
        int[] numeros = new int[contador];

        for (int i = 0; i < contador; i++){
            System.out.printf("Digite o %dº número inteiro:%n", 1+i);
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0){
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }

        int[] par = new int[contadorPar];
        int[] impar = new int[contadorImpar];
        int j = 0;
        int k = 0;

        System.out.printf("Os números digitados são: %n");
        for (int numero : numeros){
            System.out.printf("%d ",numero);
            if (numero % 2 == 0){
                par[j] = numero;
                j++;
            } else {
                impar[k] = numero;
                k++;
            }
        }

        System.out.printf("%nOs numeros pares são:%n");
        for (int numpar : par){
            System.out.printf("%d ",numpar);
        }
        System.out.printf("%nOs numeros impares são:%n");
        for (int numimpar : impar){
            System.out.printf("%d ",numimpar);
        }
    }
}
