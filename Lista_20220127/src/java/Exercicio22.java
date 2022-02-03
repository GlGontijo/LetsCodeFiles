package java;

import java.util.Scanner;

public class Exercicio22 {
    // 22)  Elabore  um  algoritmo  que  dado  três  vetores  reais  de  5  posições,  leia  estes  vetores,
    // calcule  a expressão  ( (vetor1  *  vetor3)  /  vetor2  ) ,  utilizando  os  valores  da  mesma  posição,
    // armazenando  em  um quarto vetor, também de números reais de 5 posições. No final, imprima os números do quarto vetor.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 5;
        double[] vetor1 = new double[contador];
        double[] vetor2 = new double[contador];
        double[] vetor3 = new double[contador];
        double[] vetorResultado = new double[contador];

        System.out.println("\nPrimeira sequência");
        for (int i=0; i < contador; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor da primeira sequência:");
            vetor1[i] = sc.nextDouble();
        }
        System.out.println("\nSegunda sequência");
        for (int i=0; i < contador; i++){
            System.out.println("Digite o "+(i+1)+"º valor da segunda sequência:");
            vetor2[i] = sc.nextInt();
            while (vetor2[i] == 0){
                System.out.println("Não pode ser zero, digite outro valor:");
                vetor2[i] = sc.nextInt();
            }
        }
        System.out.println("\nSegunda sequência");
        for (int i=0; i < contador; i++){
            System.out.println("Digite o "+(i+1)+"º valor da terceira sequência:");
            vetor3[i] = sc.nextInt();
            vetorResultado[i] = ((vetor1[i] * vetor3[i]) / vetor2[i]);
        }
        System.out.println("\nA sequencia resultante da equação posicional das anteriores é:");
        for (int i=0; i < contador; i++){
            System.out.printf("Posição %d: ((%.2f * %.2f) / %.2f) = %.2f%n",i,vetor1[i],vetor3[i],vetor2[i],vetorResultado[i]);
        }
    }
}
