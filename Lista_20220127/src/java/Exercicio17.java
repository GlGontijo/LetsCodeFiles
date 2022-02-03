package java;

import java.util.Scanner;

public class Exercicio17 {
    // 17) Faça algoritmo que carregue um vetor com 15 posições, calcule e mostre:
    //   a) O maior elemento do vetor e em que posição esse elemento se encontra;
    //   b) O menor elemento do vetor e em que posição esse elemento se encontra.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 15;
        int[] numeros = new int[contador];
        int maiorNumero = 0;
        int menorNumero = 0;
        int posMaior = 0;
        int posMenor = 0;

        for (int i=0; i < numeros.length; i++){
            System.out.printf("Digite o %dº número:%n",i+1);
            numeros[i] = sc.nextInt();
            if (i == 0){
                maiorNumero = numeros[i];
                posMaior = i;
                menorNumero = numeros[i];
                posMenor = i;
            } else if (numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
                posMaior = i;
            } else if (numeros[i] < menorNumero){
                menorNumero = numeros[i];
                posMenor = i;
            }
        }

        System.out.printf("%nO MAIOR número é %d. " +
                "Ele se encontra na posição %d do vetor.",maiorNumero,posMaior);
        System.out.printf("%nO MENOR número é %d. " +
                "Ele se encontra na posição %d do vetor.",menorNumero,posMenor);
    }
}
