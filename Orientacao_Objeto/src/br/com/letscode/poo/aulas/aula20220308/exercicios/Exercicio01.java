package br.com.letscode.poo.aulas.aula20220308.exercicios;

import br.com.letscode.poo.entity.Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        boolean hasCalc = true;
        boolean isStarted = false;
        char operacao;

        while (hasCalc){
            try {
                if (!isStarted) {System.out.println("\nInforme o primeiro valor para cálculo:");
                    calculadora.setResultado(sc.nextFloat());
                    isStarted = true;
                } else {
                    System.out.println("\n" +
                            "Informe a operação: ( + - * / = C )\n" +
                            " + Soma\n" +
                            " - Subtração\n" +
                            " * Multiplicação\n" +
                            " C Zerar / Reiniciar\n" +
                            " E Sair da Calculadora");
                    System.out.print("= " + calculadora.getResultado() + " ");
                    operacao = sc.next().charAt(0);
                    switch (operacao) {
                        case '+':
                            calculadora.historico();
                            System.out.print("+ ");
                            calculadora.soma(sc.nextFloat());
                            sc.nextLine();
                            break;
                        case '-':
                            calculadora.historico();
                            System.out.print("- ");
                            calculadora.subtrai(sc.nextFloat());
                            sc.nextLine();
                            break;
                        case '*':
                            calculadora.historico();
                            System.out.print("* ");
                            calculadora.multiplica(sc.nextFloat());
                            sc.nextLine();
                            break;
                        case '/':
                            calculadora.historico();
                            System.out.print("/ ");
                            calculadora.divide(sc.nextFloat());
                            sc.nextLine();
                            break;
                        case 'c':
                        case 'C':
                            calculadora.limpaHistorico();
                            isStarted = false;
                            break;
                        case 'e':
                        case 'E':
                            System.out.print("\nResultado Final = " + calculadora.getResultado());
                            System.out.print("\nTem certeza de que deseja sair? S/N ");
                            if (sc.next().equalsIgnoreCase("S")) {
                                calculadora.limpaHistorico();
                                hasCalc = false;
                            }
                            break;
                        default:
                            System.out.println("Operação '" + operacao + "' não existe.");
                    }
                }
            } catch (InputMismatchException e){
                System.out.println("Valor não numérico informado. " + e.getLocalizedMessage());
                sc.nextLine();
            }
        }
    }
}
