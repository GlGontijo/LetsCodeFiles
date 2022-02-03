package java;

import java.util.Scanner;

public class Exercicio11 {
    // 11. Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 10;
        String[] vetor1 = new String[contador];
        String[] vetor2 = new String[contador];
        String[] vetor3 = new String[contador];
        String[] vetorFinal = new String[(vetor1.length + vetor2.length + vetor3.length)];

        System.out.println("\nPrimeira sequência de elementos.");
        for (int i=0, j=0; i < vetor1.length; i++){
            System.out.printf("Digite o %dº elemento da primeira sequência:%n",1+i);
            vetor1[i] = sc.nextLine();
            vetorFinal[j] = vetor1[i];
            j = j+3;
        }

        System.out.println("\nSegunda sequência de elementos.");
        for (int i=0, j=1; i < vetor2.length; i++){
            System.out.printf("Digite o %dº elemento da segunda sequência:%n",1+i);
            vetor2[i] = sc.nextLine();
            vetorFinal[j] = vetor2[i];
            j = j+3;
        }

        System.out.println("\nTerceira sequência de elementos.");
        for (int i=0, j=2; i < vetor3.length; i++){
            System.out.printf("Digite o %dº elemento da terceira sequência:%n",1+i);
            vetor3[i] = sc.nextLine();
            vetorFinal[j] = vetor3[i];
            j = j+3;
        }

        System.out.println("\nIntercalando as sequências acima, temos:");
        for (String vetor : vetorFinal){
            System.out.println(vetor);
        }
    }
}
