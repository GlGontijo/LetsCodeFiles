package java;

import java.util.Scanner;

public class Exercicio12 {
    // 12. Foram anotadas as idades e alturas de 30 alunos. 
    // Faça um Programa que determine quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 30;
        int[] idades = new int[contador];
        float[] alturas = new float[contador];
        float somaAlturas = 0;
        float mediaAlturas;
        int totalAlunosBaixos = 0;

        System.out.println("Informe a idade e altura dos "+contador+" alunos abaixo:");
        for (int i=0; i< idades.length; i++){
            System.out.printf("Digite a IDADE do %dº aluno:%n",1+i);
            idades[i] = sc.nextInt();
            System.out.printf("Digite a ALTURA do %dº aluno:%n",1+i);
            alturas[i] = sc.nextFloat();
            somaAlturas += alturas[i];
        }

        mediaAlturas = somaAlturas / alturas.length;

        for (int i=0; i < idades.length; i++){
            if (idades[i] > 13){
                if (alturas[i] < mediaAlturas){
                    totalAlunosBaixos++;
                }
            }
        }

        System.out.printf("O total de Alunos, maiores de 13 anos," +
                "cuja altura é menor que a média geral de %.2fm, " +
                "é de: %n%d Alunos.",mediaAlturas,totalAlunosBaixos);
    }
}
