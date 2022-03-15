package br.com.letscode.poo.aulas.aula20220308.exercicios;

import br.com.letscode.poo.aulas.aula20220308.exercicios.exececao.contas.ContaBancaria;
import br.com.letscode.poo.aulas.aula20220308.exercicios.exececao.contas.ContaException;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria(500d, 500d);
        boolean hasConta = true;

        while (hasConta){
            System.out.println("Escolha a ação a ser tomada:\n" +
                    " 1 - Verificar o saldo da conta\n" +
                    " 2 - Sacar um valor da conta\n" +
                    " 3 - Depositar na conta\n" +
                    " 0 - Sair");
            switch (scanner.nextInt()){
                case 1 :
                    System.out.println("Saldo da Conta Bancaria");
                    System.out.println("Saldo normal: R$ " + contaBancaria.getSaldo());
                    System.out.println("Valor limite: R$ " + (contaBancaria.getSaldoComLimite() - contaBancaria.getSaldo()));
                    System.out.println("Valor total disponível: R$ " + contaBancaria.getSaldoComLimite());
                    break;
                case 2 :
                    boolean hasSaque = true;
                    while (hasSaque) {
                        System.out.println("Saque da Conta Bancaria");
                        System.out.println("Digite o valor a ser sacado:");
                        try {
                            contaBancaria.sacar(scanner.nextInt());
                            hasSaque = false;
                        } catch (ContaException e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println();
                    }
                    break;
                case 3 :
                    boolean hasDeposito = true;
                    while (hasDeposito){
                        System.out.println("Deposito da Conta Bancaria");
                        System.out.println("Digite o valor a ser depositado:");
                        try {
                            contaBancaria.depositar(scanner.nextInt());
                            hasDeposito = false;
                        } catch (ContaException e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println();

                    }
                    break;
                case 0 :
                    scanner.nextLine();
                    System.out.println("Confirma a saída da Conta Bancaria? S/N");
                    if (scanner.next().equalsIgnoreCase("S")){
                        System.out.println("Saindo do sistema...");
                        hasConta = false;
                    }
                    break;
                default :
                    System.out.println("Opção inválida. Tente novamente.");
            }
            scanner.nextLine();
            System.out.println();
        }
    }
}
