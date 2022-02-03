package java;

import java.util.Scanner;

public class Exercicio24 {
    // 24)  Elabore  um  algoritmo  que  dado  dois  vetores  inteiros  de  3  posições,  leia  estes  vetores, calcule
    // a expressão  (vetor1  -   vetor2  ),  utilizando  os  valores  da  mesma  posição,  armazenando  em um  terceiro vetor,
    // também  de  números  inteiros   de  3  posições.  No  final,  imprima  os  números  ímpares do  terceiro vetor.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 3;
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
            vetorResultado[i] = vetor1[i] - vetor2[i];
        }
        System.out.println("\nOs valores ímpares resultantes da subtração posicional dos dois vetores são:");
        for (int resultado : vetorResultado){
            if (resultado % 2 != 0){
                System.out.printf("%d ",resultado);
            }
        }
    }
}
