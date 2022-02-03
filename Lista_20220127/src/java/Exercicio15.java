package java;

import java.util.Scanner;

public class Exercicio15 {
    // 15)  Faça um algoritmo  que  carregue  um  vetor  com  dez  números  reais,
    // calcule  e  mostre  a  quantidade  de números negativos e a soma dos números positivos desse vetor.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 10;
        int[] numeros = new int[contador];
        int qtdNegativos = 0;
        int somaPositivos = 0;
        int qtdNulos = 0;

        for (int i=0; i < numeros.length; i++){
            System.out.println("Digite o número de sequência "+(i+1));
            numeros[i] = sc.nextInt();
            if (numeros[i] > 0){
                somaPositivos += numeros[i];
            } else if (numeros[i] < 0){
                qtdNegativos++;
            } else {
                qtdNulos++;
            }
        }

        System.out.printf("Foram digitados %d números negativos.%n" +
                "A soma dos valores positivos digitados é %d.%n",qtdNegativos,somaPositivos);
        if (qtdNulos > 0){
            System.out.printf("%d números digitados foram igual a zero.",qtdNulos);
        }
    }
}
