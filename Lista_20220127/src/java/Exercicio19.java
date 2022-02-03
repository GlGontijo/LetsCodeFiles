package java;

import java.util.Scanner;

public class Exercicio19 {
    // 19)  Elabore  um  algoritmo  que,  dados  dois  vetores  inteiros  de  10  posições, leia  os  dois  vetores,
    // some  os valores  da  mesma  posição  e  armazene  em  um  terceiro  vetor  inteiro  de  10  posições.
    // No  final  imprima este terceiro vetor.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 10;
        int[] vetor1 = new int[contador];
        int[] vetor2 = new int[contador];
        int[] vetorResultado = new int[contador];

        System.out.println("\nPrimeira sequência");
        for (int i=0; i < contador; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor da primeira sequência:");
            vetor1[i] = sc.nextInt();
        }
        System.out.println("\nSegunda sequência");
        for (int i=0; i < contador; i++){
            System.out.println("Digite o "+(i+1)+"º valor da segunda sequência:");
            vetor2[i] = sc.nextInt();
            vetorResultado[i] = vetor1[i] + vetor2[i];
        }
        System.out.println("\nA sequencia resultante da soma posicional das anteriores é:");
        for (int resultado : vetorResultado){
            System.out.printf("%d%n",resultado);
        }
    }
}
