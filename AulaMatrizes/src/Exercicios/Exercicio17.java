package Exercicios;

import java.util.Random;

public class Exercicio17 {
    // 17. Leia uma matriz 10 x 3 com as notas de 10 alunos em 3 provas. Em seguida, escreva o numero de alunos cuja
    // pior nota foi na prova 1, o numero de alunos cuja pior nota foi na prova 2, e o numero de alunos cuja pior nota
    // foi na prova 3. Em caso de empate das piores notas de um aluno, o criterio de desempate e arbitrario, mas o aluno
    // deve ser contabilizado apenas uma vez.

    public static void main(String[] args) {
        Random rnd = new Random();
        float[][] notasAlunos = new float[10][3];
        int[] piorNota = new int[10];
        int qtdPior1 = 0;
        int qtdPior2 = 0;
        int qtdPior3 = 0;

        System.out.println();
        for (int i=0; i < notasAlunos.length; i++){
            System.out.println("Notas aluno "+(i+1)+":");
            for (int j=0; j < notasAlunos[i].length; j++){
                notasAlunos[i][j] = (float) (rnd.nextInt(21) * 0.5);
                System.out.printf("Prova %d = %.2f\n",j+1,notasAlunos[i][j]);
                int x=0;
                float y=10;
                while (x < notasAlunos[i].length){
                    if (notasAlunos[i][x] < y){
                        y = notasAlunos[i][x];
                        piorNota[i] = x+1;
                        x=0;
                    }
                    x++;
                }
            }
            System.out.println();
        }

        for (int aluno : piorNota){
            switch (aluno){
                case 1 : qtdPior1++; break;
                case 2 : qtdPior2++; break;
                case 3 : qtdPior3++; break;
                default:
            }
        }

        System.out.println("\nAs piores notas foram:\n");
        System.out.printf("Prova 1 - %d alunos\n",qtdPior1);
        System.out.printf("Prova 2 - %d alunos\n",qtdPior2);
        System.out.printf("Prova 3 - %d alunos\n",qtdPior3);
    }
}
