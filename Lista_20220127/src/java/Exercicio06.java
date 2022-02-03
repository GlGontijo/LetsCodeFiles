package java;

import java.util.Scanner;

public class Exercicio06 {
    // 6. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno,
    // imprima o número de alunos com média maior ou igual a 7.0.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdAlunos = 3;
        int qtdNotas = 4;
        String[] nomeAluno = new String[qtdAlunos];
        float[] mediaAluno = new float[qtdAlunos];
        float[] notaAluno = new float[qtdNotas];
        float totalNotas =0;

        for (int i = 0; i < nomeAluno.length; i++){
            System.out.println("Digite o nome do Aluno "+(1+i)+":");
            nomeAluno[i] = sc.nextLine();
            System.out.println("Digite as notas do Aluno "+(1+i)+":");
            for (int j = 0; j < notaAluno.length; j++){
                System.out.printf("%dº Bimestre:%n",1+j);
                notaAluno[j] = sc.nextFloat();
                sc.nextLine();
                totalNotas += notaAluno[j];
            }
            mediaAluno[i] = totalNotas / qtdNotas;
            totalNotas = 0;
        }

        System.out.println("Os alunos com média 7.00 ou acima são:");
        for (int i = 0; i < nomeAluno.length; i++){
            if (mediaAluno[i] >= 7.0){
                System.out.printf("%s, média: %.2f%n",nomeAluno[i],mediaAluno[i]);
            }
        }

    }
}
