package Aula02_20220217.Exercicios;

import Metodos.Fornecedor;

import java.util.Scanner;

public class Exercicio02 {
    /*
    2. Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor.
    Considere que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe
    Pessoa, os atributos:
        valorCredito (correspondente ao crédito máximo atribuído ao fornecedor).
        valorDivida (montante da dívida para com o fornecedor).

    Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores.

    Um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivida.

    Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o
    funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fornecedor fornecedor = new Fornecedor();

        System.out.println("\nInforme os dados do fornecedor:");
        System.out.println("Nome / Razão social: ");
        fornecedor.setNome(scanner.nextLine());
        System.out.println("Endereço: ");
        fornecedor.setEndereco(scanner.nextLine());
        System.out.println("Telefone: ");
        fornecedor.setTelefone(scanner.nextLine());
        System.out.println("Valor do crédito: ");
        fornecedor.setVlrCredit(scanner.nextDouble());
        System.out.println("Valor da dívida: ");
        fornecedor.setVlrDivida(scanner.nextDouble());

        System.out.println("\nO saldo do Fornecedor é de: " +fornecedor.obterSaldo());

    }
}
