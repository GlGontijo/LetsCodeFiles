package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio25 {
    // 25. Faça um programa para determinar a proxima jogada em um Jogo da Velha. Assumir que o tabuleiro e representado
    // por uma matriz de 3 x 3, onde cada posiçao representa uma das casas do tabuleiro. A matriz pode conter os
    // seguintes valores -1, 0, 1 representando respectivamente uma casa contendo uma peça minha (-1), uma casa vazia
    // do tabuleiro (0), e uma casa contendo uma peça do meu oponente (1).

    private static int[][] tabuleiro = new int[3][3];
    private static int jogador = 1;
    private static int linha = 0;
    private static int coluna = 0;

    public static String mostrarTabuleiro() {
        String peca = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (tabuleiro[i][j]) {
                    case  0 : peca = "_"; break;
                    case  1 : peca = "O"; break;
                    case -1 : peca = "X"; break;
                }
                System.out.printf("%4s",peca);
            }
            System.out.println();
        }
        return "";
    }

    public static int existeVencedor() {
        // Verifica linha
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == tabuleiro[i][1]) && (tabuleiro[i][0] == tabuleiro[i][2])
                    && (tabuleiro[i][0] != 0)) {
                return tabuleiro[i][0];
            }
        }
        // Verifica coluna
        for (int j = 0; j < 3; j++) {
            if ((tabuleiro[0][j] == tabuleiro[1][j]) && (tabuleiro[0][j] == tabuleiro[2][j])
                    && (tabuleiro[0][j] != 0)) {
                return tabuleiro[0][j];
            }
        }
        // Verifica diagonal principal
        if ((tabuleiro[0][0] == tabuleiro[1][1]) && (tabuleiro[0][0] == tabuleiro[2][2])
                && (tabuleiro[0][0] != 0)) {
            return tabuleiro[0][0];
        }
        // Verifica diagonal secundaria
        if ((tabuleiro[0][2] == tabuleiro[1][1]) && (tabuleiro[0][2] == tabuleiro[2][0])
                && (tabuleiro[0][2] != 0)) {
            return tabuleiro[0][2];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == 0) {
                    return 0;
                }
            }
        }
        return 2;
    }

    public static boolean jogada(int jogador, int linha, int coluna) {
        if ((linha < 0) || (linha > 2)) {
            return false;
        }
        if ((coluna < 0) || (coluna > 2)) {
            return false;
        }
        if (tabuleiro[linha][coluna] != 0) {
            return false;
        }
        tabuleiro[linha][coluna] = jogador;
        return true;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int vencedor = 0;
        boolean jogar = true;

        System.out.println("\nJogo da Velha:\n");
        System.out.println("Jogador = 0");
        System.out.println("Computador = X");
        System.out.println("\nIniciando...\n");

        do {
            // Iniciando com tabuleiro vazio
            for (int i = 0; i < tabuleiro.length; i++) {
                for (int j = 0; j < tabuleiro[i].length; j++) {
                    tabuleiro[i][j] = 0;
                }
            }

            System.out.println(mostrarTabuleiro());

            // Jogando
            while (vencedor == 0) {
                if (jogador == 1) {
                    System.out.println("Sua vez de jogar:");
                    System.out.println("Escolha a linha:");
                    linha = scanner.nextInt();
                    System.out.println("Escolha a coluna:");
                    coluna = scanner.nextInt();
                    if (jogada(jogador, linha, coluna)) {
                        tabuleiro[linha][coluna] = jogador;
                        jogador = -1;
                    } else {
                        System.out.println("Jogada invalida, tente novamente");
                    }
                    System.out.println(mostrarTabuleiro());
                    vencedor = existeVencedor();
                } else {
                    System.out.println("Agora é com o computador:");
                    while (jogador == -1) {
                        linha = random.nextInt(3);
                        coluna = random.nextInt(3);
                        if (jogada(jogador, linha, coluna)) {
                            tabuleiro[linha][coluna] = jogador;
                            jogador = 1;
                        }
                    }
                    System.out.println("Jogada efetuada!" +
                            "\nLinha: " + linha + "\nColuna: " + coluna);
                    System.out.println(mostrarTabuleiro());
                    vencedor = existeVencedor();
                }
            }
            switch (vencedor) {
                case 1:
                    System.out.println("\nVocê ganhou! \\o/");
                    break;
                case -1:
                    System.out.println("\nO computador ganhou! \\[_]/");
                    break;
                case 2:
                    System.out.println("\nOh não! Empate.");
                    break;
                default:
            }
            System.out.println("\nDeseja outra partida? S/N");
            String x = scanner.next();
            if (x.toUpperCase().equals("S")) {
                vencedor = 0;
            } else {
                jogar = false;
            }
        } while (jogar);
    }
}
