package Exercicios;

import java.util.Random;

public class Exercicio19 {
    // 19. Faca um programa que leia uma matriz de 5 linhas e 4 colunas contendo as seguintes informacoes sobre alunos
    // de uma disciplina, sendo todas as informacoes do tipo inteiro:
    //  • Primeira coluna: numero de matrıcula (use um inteiro)
    //  • Segunda coluna: media das provas
    //  • Terceira coluna: media dos trabalhos
    //  • Quarta coluna: nota final
    // Elabore um programa que:
    //  (a) Leia as tres primeiras informacoes de cada aluno
    //  (b) Calcule a nota final como sendo a soma da media das provas e da media dos trabalhos
    //  (c) Imprima a matrıcula do aluno que obteve a maior nota final (assuma que so existe uma maior nota)
    //  (d) Imprima a media aritmetica das notas finais

    public static void main(String[] args) {
        Random rnd = new Random();
        int qtdAlunos = 5;
        int qtdInf = 4;
        int[][] mtzAlunos = new int[qtdAlunos][qtdInf];
        double[] mediaInf = new double[qtdInf - 1];
        int maiorNota = 0;
        int melhorAluno = 0;

        System.out.println();
        System.out.println("Dados Alunos:");
        System.out.println(" Matric. | Md Prov | Md Trab | Nota Fn ");
        for (int i=0; i < mtzAlunos.length; i++){
            for (int j=0; j < mtzAlunos[i].length; j++){
                switch (j){
                    case 0 :
                        mtzAlunos[i][j] = rnd.nextInt(100000);
                        System.out.printf(" %5d ",mtzAlunos[i][j]);
                        break;
                    case 1 :
                        mtzAlunos[i][j] = rnd.nextInt(6);
                        System.out.printf(" %5d,00 ",mtzAlunos[i][j]);
                        break;
                    case 2 :
                        mtzAlunos[i][j] = rnd.nextInt(6);
                        System.out.printf(" %5d,00 ",mtzAlunos[i][j]);
                        break;
                    case 3 :
                        mtzAlunos[i][j] = (mtzAlunos[i][j-2] + mtzAlunos[i][j-1]);
                        System.out.printf(" %5d,00 ",mtzAlunos[i][j]);
                        break;
                    default:
                }
            }
            System.out.println();
        }

        System.out.println("\na)");
        System.out.println(" Matric. | Md Prov | Md Trab ");
        for (int[] alunos : mtzAlunos){
            for (int j=0; j < 3; j++){
                switch (j) {
                    case 0:
                        System.out.printf(" %5d ", alunos[j]);
                        break;
                    case 1:
                    case 2:
                        System.out.printf(" %5d,00 ", alunos[j]);
                        break;
                    default:
                }
            }
            System.out.println();
        }

        System.out.println("\nc)");
        for (int[] alunos : mtzAlunos){
            if (alunos[3] > maiorNota) {
                maiorNota = alunos[3];
                melhorAluno = alunos[0];
            }
        }
        System.out.printf("O melhor aluno foi o de matrícula %d com nota final = %d,00.\n",melhorAluno,maiorNota);

        System.out.println("\nd)");
        System.out.println("As médias gerais da turma foram:");
        System.out.println(" Md Prov | Md Trab | Nota Fn ");
        for (int x=0; x < mediaInf.length; x++){
            int soma = 0;
            int i=0;
            while (i < mtzAlunos.length) {
                soma += mtzAlunos[i][x+1];
                i++;
            }
            mediaInf[x] = (double)soma / mtzAlunos.length;
            System.out.printf(" %6.2f  ", mediaInf[x]);
        }
    }
}
