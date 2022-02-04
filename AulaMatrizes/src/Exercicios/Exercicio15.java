package Exercicios;

import java.util.Random;

public class Exercicio15 {
    // 15. Leia uma matriz 5 x 10 que se refere respostas de 10 questoes de múltipla escolha, referentes a 5 alunos.
    // Leia tambem um vetor de 10 posiçoes contendo o gabarito de respostas que podem ser a, b, c ou d.
    // Seu programa devera comparar as respostas de cada candidato com o gabarito e emitir um vetor denominado resultado,
    // contendo a pontuaçao correspondente a cada aluno.

    public static void main(String[] args) {
        Random rnd = new Random();
        char[][] respAlunos = new char[5][10];
        char[] gabarito = {'a','d','c','a','b','a','c','b','d','d'};
        double[] resultado = new double[5];

        for (int i=0; i < respAlunos.length; i++){
            System.out.printf("\nAluno %d :",i+1);
            resultado[i] = 0;
            for (int j=0; j < respAlunos[i].length; j++){
                int resp = rnd.nextInt(4) + 61; // cod ascii
                switch (resp){
                    case 61 : respAlunos[i][j] = 'a'; break;
                    case 62 : respAlunos[i][j] = 'b'; break;
                    case 63 : respAlunos[i][j] = 'c'; break;
                    case 64 : respAlunos[i][j] = 'd'; break;
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
