package Exercicios;

import java.util.Random;

public class Exercicio16 {
    // 16. Faca um programa para corrigir uma prova com 10 questoes de multipla escolha (a, b, c, d ou e), em uma turma 
    // com 3 alunos. Cada questao vale 1 ponto. Leia o gabarito, e para cada aluno leia sua matricula (numero inteiro) e 
    // suas respostas. Calcule e escreva:  Para cada aluno, escreva sua matrıcula, suas respostas, e sua nota. 
    // O percentual de aprovacao, assumindo media 7.0.

    public static void main(String[] args) {
        Random rnd = new Random();
        int qtdAlunos = 3;
        int qtdQuestoes = 10;
        char[] gabarito = {'a','e','c','b','d','e','c','a','b','d'};
        char[][] respAlunos = new char[qtdAlunos][qtdQuestoes];
        double[] resultado = new double[qtdAlunos];
        int[] matricula = new int[qtdAlunos];

        for (int i=0; i < respAlunos.length; i++){
            matricula[i] = rnd.nextInt(100000);
            System.out.printf("\nAluno matricula: %5d :",matricula[i]);
            resultado[i] = 0;
            for (int j=0; j < respAlunos[i].length; j++){
                int resp = rnd.nextInt(5) + 61; // cod ascii
                switch (resp){
                    case 61 : respAlunos[i][j] = 'a'; break;
                    case 62 : respAlunos[i][j] = 'b'; break;
                    case 63 : respAlunos[i][j] = 'c'; break;
                    case 64 : respAlunos[i][j] = 'd'; break;
                    case 65 : respAlunos[i][j] = 'e'; break;
                    default : respAlunos[i][j] = ' ';
                }
                if (respAlunos[i][j] == gabarito[j]){
                    resultado[i]++;
                }
                System.out.printf("\nQuestão %2d: Resp: %s - Gab: %s",
                        j+1,respAlunos[i][j],gabarito[j]);
            }
            System.out.printf("\nNota Aluno %d = %.2f\n",i+1,resultado[i]);
        }

    }
}
