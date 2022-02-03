package java;

import lib.Calculadora;

import java.util.Scanner;

public class Exercicio09 {
    // 9. Faça um Programa que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 10;
        double[] numeros = new double[contador];
        double[] numQuadrados = new double[contador];
        double soma = 0;

        System.out.println("Digite "+contador+" números:");
        for (int i=0; i < numeros.length; i++){
            System.out.println((1+i)+"º número:");
            numeros[i] = sc.nextDouble();
            numQuadrados[i] = Calculadora.multiplica(numeros[i],numeros[i]);
            soma += numQuadrados[i];
        }

        System.out.println("A soma dos quadrados de todos os números digitados é: "+soma);
    }
}
