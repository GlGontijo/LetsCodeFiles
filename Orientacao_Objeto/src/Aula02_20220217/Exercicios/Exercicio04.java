package Aula02_20220217.Exercicios;

import Aula02_20220217.Metodos.Administrador;

import java.util.Scanner;

public class Exercicio04 {
    /*
    4. Implemente a classe Administrador como subclasse da classe Empregado. Um determinado administrador tem
    como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo:
        ajudaDeCusto (ajudas referentes a viagens, estadias, ...).

    Note que deverá redefinir na classe Administrador o método herdado calcularSalario (o salário de um administrador
    é equivalente ao salário de um empregado usual acrescido das ajuda de custo).
    Escreva um programa de teste adequado para esta classe.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtem o total de cadastros.
        System.out.println("Quantos administradores deseja cadastrar?");
        Administrador[] administrador = new Administrador[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0; i < administrador.length; i++){
            administrador[i] = new Administrador();
            System.out.println("\nInforme os dados do "+(i+1)+"º administrador:");
            System.out.println("Nome:");
            administrador[i].setNome(scanner.nextLine());
            System.out.println("Endereço:");
            administrador[i].setEndereco(scanner.nextLine());
            System.out.println("Telefone:");
            administrador[i].setTelefone(scanner.nextLine());
            System.out.println("Codigo de Setor:");
            administrador[i].setCodigoSetor(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Salário Base (R$):");
            administrador[i].setSalarioBase(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Imposto sobre salario (%): Ex: '10'");
            administrador[i].setImposto(scanner.nextFloat());
            scanner.nextLine();
            System.out.println("Total de dias trabalhados: ('30' para todos)");
            int diasTrab = (scanner.nextInt());
            scanner.nextLine();
            System.out.println("Total de descontos (R$):");
            double descontos = (scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Total Ajuda de Custo (R$):");
            administrador[i].setAjudaDeCusto(scanner.nextDouble());
            scanner.nextLine();

            System.out.printf("Salario Final do funcionario %s: \nR$ %.2f%n",
                    administrador[i].getNome(),
                    administrador[i].calcularSalario(diasTrab,descontos));
        }
    }
}
