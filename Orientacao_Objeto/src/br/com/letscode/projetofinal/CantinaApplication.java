package br.com.letscode.projetofinal;

import java.util.Scanner;

public class CantinaApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sair = false;

        System.out.println("\n" +
                "  ##########################\n" +
                "  #    Seja bem Vindo à    #\n" +
                "  #  Cantina Codifichiamo  #\n" +
                "  ##########################");
        System.out.println();

        do {
            System.out.println("Escolha o que vai querer:\n" +
                    " 1 - Lanches\n" +
                    " 2 - Comidas\n" +
                    " 3 - Bebidas\n" +
                    " 0 - Não obrigado! Estou satisfeito.");
            int opt = sc.nextInt();
            sc.nextLine();
            switch (opt){
                case 1:
                    System.out.println("Você escolheu: 1 - Lanches");
                    System.out.println("Deseja escolher mais algum item? S/N");
                    String resp = sc.next();
                    if (!resp.equalsIgnoreCase("S")){
                        sair = true;
                    }
                    break;
                case 2:
                    System.out.println("Você escolheu: 2 - Comidas");
                    System.out.println("Deseja escolher mais algum item? S/N");
                    resp = sc.next();
                    if (!resp.equalsIgnoreCase("S")){
                        sair = true;
                    }
                    break;
                case 3:
                    System.out.println("Você escolheu: 3 - Bebidas");
                    System.out.println("Deseja escolher mais algum item? S/N");
                    resp = sc.next();
                    if (!resp.equalsIgnoreCase("S")){
                        sair = true;
                    }
                    break;
                case 0:
                    System.out.println("Tem certeza de que deseja sair? S/N");
                    resp = sc.next();
                    if (resp.equalsIgnoreCase("S")){
                        sair = true;
                    }
                    break;
                default:
                    System.out.printf("Opção %d inválida. Tente novamente!",opt);
                    System.out.println();
            }
        }while (!sair);

        System.out.println("\n" +
                "*** Obrigado pelo pedido – Conte conosco! ***");
    }
}
