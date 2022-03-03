package Aula02_20220217.Exercicios;

import Metodos.Empregado;

import java.util.Scanner;

public class Exercicio03 {
    /*
    3. Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe
    Empregado tem, para além dos atributos que caracterizam a classe Pessoa, os atributos:
        codigoSetor (inteiro),
        salarioBase (vencimento base)
        imposto (porcentagem retida dos impostos).

    Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario.
    Escreva um programa de teste adequado para a classe Empregado.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtem o total de cadastros.
        System.out.println("Quantos empregados deseja cadastrar?");
        Empregado[] empregado = new Empregado[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0; i < empregado.length; i++){
            empregado[i] = new Empregado();
            System.out.println("\nInforme os dados do "+(i+1)+"º empregado:");
            System.out.println("Nome:");
            empregado[i].setNome(scanner.nextLine());
            System.out.println("Endereço:");
            empregado[i].setEndereco(scanner.nextLine());
            System.out.println("Telefone:");
            empregado[i].setTelefone(scanner.nextLine());
            System.out.println("Codigo de Setor:");
            empregado[i].setCodigoSetor(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Salário Base (R$):");
            empregado[i].setSalarioBase(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Imposto sobre salario (%): Ex: '10'");
            empregado[i].setImposto(scanner.nextFloat());
            scanner.nextLine();
            System.out.println("Total de dias trabalhados: ('30' para todos)");
            int diasTrab = (scanner.nextInt());
            scanner.nextLine();
            System.out.println("Total de descontos (R$):");
            double descontos = (scanner.nextDouble());
            scanner.nextLine();

            System.out.printf("Salario Final do funcionario %s: \nR$ %.2f%n",
                    empregado[i].getNome(),
                    empregado[i].calcularSalario(diasTrab,descontos));
        }
    }
}
