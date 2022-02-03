package java;

import lib.Calculadora;

import java.util.Scanner;

public class Exercicio21 {
    // 21) Utilizando a questão 7, elabore um algoritmo que calcule a média de altura do time.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 4;
        int[] numeros = new int[contador];
        double[] alturas = new double[contador];
        double somaAltura = 0;
        double mediaAltura;

        System.out.println("Informe o número e altura dos "+contador+" jogadores:");
        for (int i=0; i< numeros.length; i++){
            System.out.printf("Digite o NUMERO do %dº jogador:%n",1+i);
            numeros[i] = sc.nextInt();
            System.out.printf("Digite a ALTURA do %dº Jogador:%n",1+i);
            alturas[i] = sc.nextDouble();
            somaAltura += alturas[i];
        }

        mediaAltura = Calculadora.divide(somaAltura,contador);
        System.out.printf("\nAltura média do time: %.2f\n",mediaAltura);

        System.out.println("\nJogadores acima ou na média de altura:");
        for (int i=0; i< alturas.length; i++){
            if (alturas[i] >= mediaAltura){
                System.out.printf("Número %s - Altura = %.2fm%n",numeros[i],alturas[i]);
            }
        }
        System.out.println("\nJogadores abaixo da média de altura:");
        for (int i=0; i< alturas.length; i++){
            if (alturas[i] < mediaAltura){
                System.out.printf("Número %s - Altura = %.2fm%n",numeros[i],alturas[i]);
            }
        }
    }
}
