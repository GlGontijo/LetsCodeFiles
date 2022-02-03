package java;

import java.util.Scanner;

public class Exercicio20 {
    // 20)  Um  time  de  basquete  possui  12  jogadores.
    // Elabore  um  algoritmo  que,  dados  dois  vetores   NÚMERO e ALTURA,
    // calcule e imprima o número do jogador mais alto e a sua altura.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 12;
        int[] numeros = new int[contador];
        float[] alturas = new float[contador];
        float maiorAltura = 0;

        System.out.println("Informe o número e altura dos "+contador+" jogadores:");
        for (int i=0; i< numeros.length; i++){
            System.out.printf("Digite o NUMERO do %dº jogador:%n",1+i);
            numeros[i] = sc.nextInt();
            System.out.printf("Digite a ALTURA do %dº Jogador:%n",1+i);
            alturas[i] = sc.nextFloat();
            if (i == 0 || alturas[i] > maiorAltura){
                maiorAltura = alturas[i];
            }
        }

        System.out.println("\nJogador(es) do time com a maior altura:");
        for (int i=0; i< alturas.length; i++){
            if (alturas[i] == maiorAltura){
                System.out.printf("Número %s - Altura = %.2fm%n",numeros[i],alturas[i]);
            }
        }
    }
}
