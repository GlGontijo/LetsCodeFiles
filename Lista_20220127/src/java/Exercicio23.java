package java;

import java.util.Scanner;

public class Exercicio23 {
    // 23)  Elabore  um  algoritmo que  leia  os  vetores  A e  B  de  números  reais  de 4,  calcule  a  média  ponderada.
    // Armazene a  média  em  um  terceiro vetor  e,  no final, imprima,  na  ordem  inversa, este  terceiro  vetor,
    // com duas casas decimais. Peso A é 4 e peso B é 6.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 4;
        double[] vetorA = new double[contador];
        double[] vetorB = new double[contador];
        double[] vetorMedia = new double[contador];
        double pesoA = 4;
        double pesoB = 6;

        for (int i=0; i < contador; i++){
            System.out.printf("Digite o %dº valor da primeira sequência:\n",i+1);
            vetorA[i] = sc.nextDouble();
        }
        for (int i=0; i < contador; i++){
            System.out.printf("Digite o %dº valor do segunda sequência:\n",i+1);
            vetorB[i] = sc.nextDouble();
            vetorMedia[i] = ((vetorA[i] * pesoA)+(vetorB[i] * pesoB)) / (pesoA + pesoB);
        }
        for (int j = contador-1; j >= 0; j--){
            System.out.printf("\nO valor da %d média ponderada é: %.2f",j+1,vetorMedia[j]);
        }
    }
}
