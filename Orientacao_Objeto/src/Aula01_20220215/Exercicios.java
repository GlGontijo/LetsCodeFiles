package Aula01_20220215;

import Metodos.Livro;
import Metodos.Veiculo;

import java.util.Scanner;

public class Exercicios {
    public static Scanner scanner = new Scanner(System.in);

    // Exercicio 01
    public static class Exercicio01 {
        public static void main(String[] args) {

            // Obtendo os dados
            System.out.println("Informe os dados do Funcionario: ");
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Sobrenome: ");
            String sobrenome = scanner.nextLine();
            System.out.println("Cidade: ");
            String cidade = scanner.nextLine();
            System.out.println("UF: ");
            String estado = scanner.nextLine();
            System.out.println("Horas Trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Valor recebido por hora: ");
            double vlrHora = scanner.nextDouble();
            scanner.nextLine();

            Funcionario funcionario = new Funcionario(
                    nome,sobrenome,cidade,estado,horasTrabalhadas,vlrHora
            );

            boolean continuar = true;
            do{
                System.out.println("Escolha o que deseja fazer:" +
                        "\n1 - Incrementar a quantidade de horas trabalhadas" +
                        "\n2 - Substituir o valor por hora do funcionário" +
                        "\n3 - Calcular o salário do funcionário no final do mês");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println();
                        System.out.println("Informe a quantidade de horas a serem acrescidas");
                        funcionario.printNomeSobrenome();
                        int horas = scanner.nextInt();
                        scanner.nextLine();
                        funcionario.incrementaHora(horas);
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Informe o novo valor por hora");
                        funcionario.printNomeSobrenome();
                        funcionario.setVlrHora(scanner.nextDouble());
                        scanner.nextLine();
                        System.out.println("Novo valor por hora: R$" + funcionario.getVlrHora());
                        break;
                    case 3:
                        System.out.println();
                        funcionario.calcSalario();
                        break;
                    default:
                        System.out.println("\nOpção "+opcao+" inválida!\n");
                }

                System.out.println("\nDeseja realizar mais alguma operação? S/N");
                String resp = scanner.next();
                if (!resp.equalsIgnoreCase("S")) {continuar = false;}
            } while (continuar);
        }
    }


    // Exercicio 02
    public static class Exercicio02 {
        public static void main(String[] args) {
            Livro livro1 = new Livro();
            Livro livro2 = new Livro(
                    "Jose",
                    "Dom Casmurro",
                    200
            );

            // livro1 recebe os valores do teclado
            System.out.println("\nInforme os dados do livro1:");
            System.out.println("Nome do leitor:");
            livro1.setPessoaLeitor(scanner.nextLine());
            System.out.println("Titulo do livro:");
            livro1.setTitulo(scanner.nextLine());
            System.out.println("Total de paginas do livro:");
            livro1.setPagTotal(scanner.nextInt());
            scanner.nextLine();

            System.out.println("\nQuantas paginas lidas?");
            System.out.println("Livro1 "+ livro1.getTitulo() +": ");
            float perc1 = livro1.getProgressoLivro(scanner.nextInt());
            scanner.nextLine();
            System.out.printf("%s ja leu %.2f%% do livro %s.\n",
                    livro1.getPessoaLeitor(),
                    perc1,
                    livro1.getTitulo());
            System.out.println();
            System.out.println("Livro2 "+ livro2.getTitulo() +": ");
            float perc2 = livro2.getProgressoLivro(scanner.nextInt());
            scanner.nextLine();
            System.out.printf("%s ja leu %.2f%% do livro %s.\n",
                    livro2.getPessoaLeitor(),
                    perc2,
                    livro2.getTitulo());
            System.out.println();
        }
    }


    // Exercicio 03
    public static class Exercicio03 {
        public static void main(String[] args) {
            Veiculo carro = new Veiculo();

            carro.setModelo("HB20");
            carro.setMarca("Hyundai");
            carro.setCor("Prata");
            carro.setAnoFab(2021);
            carro.setVlrFipe(70000);
            carro.setVelMax(180);

            boolean continuar = true;
            while(continuar) {
                carro.printInfo();
                System.out.println();
                System.out.println("Escolha: " +
                        "\n1 - Acelerar" +
                        "\n2 - Frear");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao){
                    case 1 :
                        System.out.println("Informe a velocidade:");
                        int velAumenta = scanner.nextInt();
                        scanner.nextLine();
                        carro.acelerar(velAumenta);
                        break;
                    case 2 :
                        System.out.println("Informe a velocidade:");
                        int velDiminui = scanner.nextInt();
                        scanner.nextLine();
                        carro.frear(velDiminui);
                        break;
                    default :
                        System.out.println("Opção inválida!");
                }

                System.out.println("\nDeseja continuar? S/N");
                String resp = scanner.nextLine();
                if (!resp.equalsIgnoreCase("S")){
                    continuar = false;
                }
            }
        }
    }
}
