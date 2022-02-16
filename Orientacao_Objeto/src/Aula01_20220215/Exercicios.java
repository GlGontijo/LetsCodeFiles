package Aula01_20220215;

import java.util.Scanner;

public class Exercicios {
    public static Scanner scanner = new Scanner(System.in);

    // Exercicio 01
    public static class Exercicio01{

        public static class Funcionario {
            String nome;
            String sobrenome;
            String cidade;
            String estado;
            int horasTrabalhadas;
            double vlrHora;

            Funcionario(){}

            Funcionario(String nome, String sobrenome, String cidade, String estado, int horasTrabalhadas, double vlrHora){
                this.nome = nome;
                this.sobrenome = sobrenome;
                this.cidade = cidade;
                this.estado = estado;
                this.horasTrabalhadas = horasTrabalhadas;
                this.vlrHora = vlrHora;
            }

            public void printNomeSobrenome() {
                System.out.println("Funcionario: "+this.nome+" "+this.sobrenome);
            }

            public void incrementaHora(int horasTrabalhadas){
                System.out.println("Horas trabalhadas antes: "+this.horasTrabalhadas);
                System.out.println("Horas adicionadas "+horasTrabalhadas);
                this.horasTrabalhadas += horasTrabalhadas;
                System.out.println("Saldo final de Horas: "+this.horasTrabalhadas);
            }

            public void calcSalario(){
                printNomeSobrenome();
                double salario = this.horasTrabalhadas * this.vlrHora;
                System.out.println("Horas trabalhadas: "+this.horasTrabalhadas);
                System.out.println("Valor hora: R$"+this.vlrHora);
                System.out.println("Salario final: R$"+salario);
            }
        }

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
                        funcionario.vlrHora = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.println("Novo valor por hora: R$" + funcionario.vlrHora);
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
    public static class Exercicio02{

        public static class Livro {
            String pessoaLeitor;
            String titulo;
            int pagTotal;
            int pagLida;

            Livro(){}

            Livro(String pessoaLeitor, String titulo, int pagTotal){
                this.pessoaLeitor = pessoaLeitor;
                this.titulo = titulo;
                this.pagTotal = pagTotal;
            }

            public float getProgressoLivro(int pagLida){
                this.pagLida = pagLida;
                System.out.println("Paginas do livro: "+this.pagTotal);
                System.out.println("Pagina atual: "+this.pagLida);
                return ((float)this.pagLida / (float)this.pagTotal)*100;
            }
        }

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
            livro1.pessoaLeitor = scanner.nextLine();
            System.out.println("Titulo do livro:");
            livro1.titulo = scanner.nextLine();
            System.out.println("Total de paginas do livro:");
            livro1.pagTotal = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nQuantas paginas lidas?");
            System.out.println("Livro1 "+livro1.titulo+": ");
            float perc1 = livro1.getProgressoLivro(scanner.nextInt());
            scanner.nextLine();
            System.out.printf("%s ja leu %.2f%% do livro %s.\n",
                    livro1.pessoaLeitor,
                    perc1,
                    livro1.titulo);
            System.out.println();
            System.out.println("Livro2 "+livro2.titulo+": ");
            float perc2 = livro2.getProgressoLivro(scanner.nextInt());
            scanner.nextLine();
            System.out.printf("%s ja leu %.2f%% do livro %s.\n",
                    livro2.pessoaLeitor,
                    perc2,
                    livro2.titulo);
            System.out.println();
        }
    }


    // Exercicio 03
    public static class Exercicio03{

        public static class Veiculo {
            String modelo;
            String marca;
            String cor;
            int anoFab;
            int velMax;
            int velAtual;
            float vlrFipe;

            Veiculo(){}

            void printInfo(){
                System.out.println("\nVeiculo: "+this.modelo+
                        "\nMarca: "+this.marca+
                        "\nCor: "+this.cor);
            }

            void acelerar(int velAumenta){
                if ((this.velAtual + velAumenta) <= this.velMax){
                    this.velAtual += velAumenta;
                    System.out.println("Estou acelerando "+this.velAtual+"km/h");
                } else {
                    System.out.println("Velocidade acima do valor permitido para o veiculo");
                }
            }

            void frear(int velDiminui){
                this.velAtual -= velDiminui;
                System.out.println("Estou freando o veiculo "+this.modelo);
                System.out.println("Velocidade atual: "+this.velAtual+"km/h");
            }
        }

        public static void main(String[] args) {
            Veiculo carro = new Veiculo();

            carro.modelo = "HB20";
            carro.marca = "Hyundai";
            carro.cor = "Prata";
            carro.anoFab = 2021;
            carro.vlrFipe = 70000;
            carro.velMax = 180;

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
