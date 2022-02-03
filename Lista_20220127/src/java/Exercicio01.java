package java;

import java.util.Scanner;

public class Exercicio01 {
    // 1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[];
        numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o "+ (1 + i) +"º numero:");
            numeros[i] = sc.nextInt();
        }

        for (int numero : numeros) {
            System.out.println("Numero: "+numero);
        }
    }
}
