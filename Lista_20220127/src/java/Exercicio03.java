package java;

import java.util.Scanner;

public class Exercicio03 {
    // 3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float notas[];
        notas = new float[4];
        float total = 0;

        for (int i = 0; i < notas.length; i++){
            System.out.printf("Digite a %dº nota: %n",1+i);
            notas[i] = sc.nextFloat();
            total += notas[i];
        }

        for (int j = 0; j < notas.length; j++) {
            System.out.printf("A %dª nota foi: %.2f%n",1+j,notas[j]);
        }

        System.out.printf("A média das notas informadas foi: %.2f", (total / notas.length));
    }
}
