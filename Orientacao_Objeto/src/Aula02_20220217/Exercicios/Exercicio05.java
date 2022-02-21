package Aula02_20220217.Exercicios;

import Aula02_20220217.Metodos.Operario;

import java.util.Scanner;

public class Exercicio05 {
    /*
    5. Implemente a classe Operário como subclasse da classe Empregado. Um determinado operário tem como
    atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo:
        * valorProducao (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário)
        * comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário).

    Note que deverá redefinir nesta subclasse o método herdado calcularSalario (o salário de um operário é equivalente
    ao salário de um empregado usual acrescido da referida comissão).
    Escreva um programa de teste adequado para esta classe.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtem o total de cadastros.
        System.out.println("Quantos operários deseja cadastrar?");
        Operario[] operario = new Operario[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0; i < operario.length; i++){
            operario[i] = new Operario();
            System.out.println("\nInforme os dados do "+(i+1)+"º operario:");
            System.out.println("Nome:");
            operario[i].setNome(scanner.nextLine());
            System.out.println("Endereço:");
            operario[i].setEndereco(scanner.nextLine());
            System.out.println("Telefone:");
            operario[i].setTelefone(scanner.nextLine());
            System.out.println("Codigo de Setor:");
            operario[i].setCodigoSetor(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Salário Base (R$):");
            operario[i].setSalarioBase(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Imposto sobre salario (%): Ex: '10'");
            operario[i].setImposto(scanner.nextFloat());
            scanner.nextLine();
            System.out.println("Total de dias trabalhados: ('30' para todos)");
            int diasTrab = (scanner.nextInt());
            scanner.nextLine();
            System.out.println("Total de descontos (R$):");
            double descontos = (scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Total Valor Produção (R$):");
            operario[i].setVlrProd(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Percentual comissão (%):");
            operario[i].setComissao(scanner.nextDouble());
            scanner.nextLine();

            System.out.printf("Salario Final do funcionario %s: \nR$ %.2f%n",
                    operario[i].getNome(),
                    operario[i].calcularSalario(diasTrab,descontos));
        }
    }
}
