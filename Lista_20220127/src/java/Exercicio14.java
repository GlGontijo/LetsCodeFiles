package java;

import java.util.Scanner;

public class Exercicio14 {
    // 14)  Faça um algoritmo que carregue um vetor de seis elementos numéricos inteiros, calcule e mostre:
    //    a) A quantidade de números pares;
    //    b) Quais os números pares;
    //    c) A quantidade de números ímpares;
    //    d) Quais os números ímpares.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 6;
        int[] numeros = new int[contador];
        int[] pares;
        int[] impares;
        int qtdPar = 0;
        int qtdImpar = 0;

        for (int i=0; i < numeros.length; i++){
            System.out.printf("Digite o %dº número:%n",i+1);
            numeros[i] = sc.nextInt();
            sc.nextLine();
            if (numeros[i] % 2 == 0){ qtdPar++; }
            else { qtdImpar++; }
        }

        pares = new int[qtdPar];
        impares = new int[qtdImpar];
        int j = 0;
        int k = 0;
        for (int numero : numeros){
            if (numero % 2 == 0){
                pares[j] = numero;
                j++;
            } else {
                impares[k] = numero;
                k++;
            }
        }

        System.out.printf("%nOs %d números PARES digitados foram:%n",pares.length);
        for (int par : pares){
            System.out.printf("%d ",par);
        }

        System.out.printf("%nOs %d números IMPARES digitados foram:%n",impares.length);
        for (int impar : impares){
            System.out.printf("%d ",impar);
        }
    }
}
