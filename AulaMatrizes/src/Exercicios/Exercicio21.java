package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio21 {
    // 21. Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuario um menu de opçoes:
    //  (a) somar as duas matrizes
    //  (b) subtrair a primeira matriz da segunda
    //  (c) adicionar uma constante as duas matrizes
    //  (d) imprimir as matrizes
    // Nas duas primeiras opçoes uma terceira matriz 3 x 3 deve ser criada. Na terceira opçao o valor da constante deve
    // ser lido e o resultado da adiçao da constante deve ser arma zenado na propria matriz.

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scanner = new Scanner(System.in);
        double[][] matrizA = new double[2][2];
        double[][] matrizB = new double[2][2];
        double[][] matrizC = new double[3][3];
        boolean executar = true;
        int opt;

        System.out.println("\nMatrizA:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = rnd.nextInt(100);
                System.out.printf("%4.0f ", matrizA[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMatrizB:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = rnd.nextInt(100);
                System.out.printf("%4.0f ", matrizB[i][j]);
            }
            System.out.println();
        }

        do{
            System.out.println("\nSelecione a operaçâo que deseja executar nas Matrizes A e B?");
            System.out.println("1 - Somar as duas matrizes");
            System.out.println("2 - Subtrair a primeira matriz da segunda");
            System.out.println("3 - Adicionar uma constante as duas matrizes");
            System.out.println("4 - Imprimir as matrizes");
            System.out.println("0 - Sair sem fazer nada");
            opt = scanner.nextInt();
            scanner.nextLine();

            switch (opt) {
                case 0 :
                    System.out.println("0 - Sair sem fazer nada\n");
                    executar = false;
                    break;
                case 1 :
                    System.out.println("1 - Somar as duas matrizes\n");
                    System.out.println("MatrizC Soma:");
                    for (int i = 0; i < matrizC.length; i++){
                        for (int j=0; j < matrizC[i].length; j++){
                            if (i < matrizA.length && j < matrizA.length){
                                matrizC[i][j] = (matrizA[i][j] + matrizB[i][j]);
                            } else {
                                matrizC[i][j] = 0;
                            }
                            System.out.printf("%5.0f ",matrizC[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("2 - Subtrair a primeira matriz da segunda\n");
                    System.out.println("MatrizC Subtração:");
                    for (int i = 0; i < matrizC.length; i++){
                        for (int j=0; j < matrizC[i].length; j++){
                            if (i < matrizA.length && j < matrizA.length){
                                matrizC[i][j] = (matrizB[i][j] - matrizA[i][j]);
                            } else {
                                matrizC[i][j] = 0;
                            }
                            System.out.printf("%5.0f ",matrizC[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3 :
                    System.out.println("3 - Adicionar uma constante as duas matrizes\n");
                    System.out.println("informe a constante:");
                    int constante = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < matrizA.length; i++){
                        for (int j=0; j < matrizA[i].length; j++){
                            matrizA[i][j] = (matrizA[i][j] + constante);
                            matrizB[i][j] = (matrizB[i][j] + constante);
                        }
                    }
                    System.out.println("MatrizA Resultante:");
                    for (double[] linhas : matrizA){
                        for (double valor : linhas){
                            System.out.printf("%5.0f ",valor);
                        }
                        System.out.println();
                    }
                    System.out.println("MatrizB Resultante:");
                    for (double[] linhas : matrizB){
                        for (double valor : linhas){
                            System.out.printf("%5.0f ",valor);
                        }
                        System.out.println();
                    }
                    break;
                case 4 :
                    System.out.println("4 - Imprimir as matrizes\n");
                    System.out.println("MatrizA:");
                    for (double[] linhas : matrizA){
                        for (double valor : linhas){
                            System.out.printf("%5.0f ",valor);
                        }
                        System.out.println();
                    }
                    System.out.println("MatrizB:");
                    for (double[] linhas : matrizB){
                        for (double valor : linhas){
                            System.out.printf("%5.0f ",valor);
                        }
                        System.out.println();
                    }
                    System.out.println("MatrizC:");
                    for (double[] linhas : matrizC){
                        for (double valor : linhas){
                            System.out.printf("%5.0f ",valor);
                        }
                        System.out.println();
                    }
                    break;
                default :
                    System.out.println("Opção "+opt+" inválida! Informe novamente.\n");
            }

            if (opt > 0 && opt < 5){
                System.out.println("\nDeseja executar mais alguma operação? ( S ) ( N )");
                String continuar = scanner.next();
                if (continuar.toUpperCase().charAt(0) != 'S'){ executar = false; }
            }
        } while (executar);
    }
}
