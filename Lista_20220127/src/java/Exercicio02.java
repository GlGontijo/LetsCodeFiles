package java;

import java.util.Scanner;

public class Exercicio02 {
    // 2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[];
        numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o "+ (1 + i) +"º numero:");
            numeros[i] = sc.nextInt();
        }

        for (int j = numeros.length -1; j >= 0; j--) {
            System.out.println((j + 1)+"º numero digitado: "+numeros[j]);
        }
    }
}
