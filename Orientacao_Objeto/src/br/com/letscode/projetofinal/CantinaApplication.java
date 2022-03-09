package br.com.letscode.projetofinal;

import br.com.letscode.projetofinal.entity.Cardapio;
import br.com.letscode.projetofinal.entity.Pedido;

import java.util.Scanner;

public class CantinaApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hasPedido = false;
        boolean isMenu = true;
        Pedido pedido = new Pedido();
        Cardapio cardapio = new Cardapio();

        System.out.println("\n" +
                "  ##########################\n" +
                "  #    Seja bem Vindo à    #\n" +
                "  #  Cantina Codifichiamo  #\n" +
                "  ##########################");
        System.out.println();

        do {
            if (hasPedido){
                System.out.println();
                System.out.println("Menu Pedido:\n" +
                        " 1 - Adicionar Itens ao Pedido\n" +
                        " 2 - Lista Pedido Aberto\n" +
                        " 3 - Excluir Itens do Pedido\n" +
                        " 4 - Fecha Pedido Aberto\n" +
                        " 0 - Cancelar Pedido Aberto (sair)");
                switch (sc.nextInt()){
                    case 1:
                        hasPedido = false;
                        break;
                    case 2:
                        pedido.listaPedido();
                        System.out.println();
                        break;
                    case 3:
                        pedido.listaPedido();
                        System.out.println();
                        System.out.println("Qual item deseja excluir?");
                        pedido.removeProduto(sc.nextInt()); sc.nextLine();
                        break;
                    case 4:
                        pedido.listaPedido();
                        System.out.println();
                        System.out.println("Confirma fechamento do pedido acima? S/N");
                        if (sc.next().equalsIgnoreCase("S")){
                            pedido.removePedido();
                            isMenu = false;
                        }
                        break;
                    case 0:
                        pedido.listaPedido();
                        System.out.println("Cancelar o pedido acima? S/N");
                        if (sc.next().equalsIgnoreCase("S")){
                            pedido.removePedido();
                            isMenu = false;
                        }
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente!");
                }
            }
            System.out.println();
            while (!hasPedido) {
                cardapio.opcoesCardapio();
                int opt = sc.nextInt(); sc.nextLine();
                String tipoProduto = cardapio.listaCardapio(opt);
                while (tipoProduto.equalsIgnoreCase("ERRO")) {
                    System.out.printf("Opção %d inválida. Tente novamente!", opt);
                    cardapio.opcoesCardapio();
                    opt = sc.nextInt(); sc.nextLine();
                    tipoProduto = cardapio.listaCardapio(opt);
                }
                System.out.printf("Valor adicional do Delivery: R$ %.2f\n", pedido.getVlrDeliveryProduto(tipoProduto));
                int idProduto = (sc.nextInt() - 1); sc.nextLine();
                pedido.insereProduto(tipoProduto, cardapio.getProdutoCardapio(tipoProduto, idProduto),
                        cardapio.getVlrProdutoCardapio(tipoProduto, idProduto));
                pedido.delivery(tipoProduto);
                System.out.printf("Adicionado o produto %s ao pedido.\n",cardapio.getProdutoCardapio(tipoProduto,idProduto));
                System.out.println("Deseja pedir mais algum item? S/N");
                if (sc.next().equalsIgnoreCase("N")){
                    hasPedido = true;
                }
            }
        } while (isMenu);

        System.out.println("*** Obrigado pelo pedido – Conte conosco! ***");
    }
}
