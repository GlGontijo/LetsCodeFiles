package br.com.letscode.tp1.aulas.aula20220329.exercicios;

import br.com.letscode.tp1.aulas.aula20220329.entities.Pedido;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio02 {
    // 2. Dada uma relação de pedidos:
    public static void main(String[] args) {
        // Construindo pedidos:
        List<Pedido> relacaoPedidosList = new ArrayList<>();

        relacaoPedidosList.add(new Pedido("Cliente Padrao","Vendedor01",1,3d,10d));
        relacaoPedidosList.add(new Pedido("Jose Silva","Vendedor02",5,1d,20d));
        relacaoPedidosList.add(new Pedido("Cliente Padrao","Vendedor02",2,2d,15d));
        relacaoPedidosList.add(new Pedido("Joana Cartafina","Vendedor01",3,2d,18.5d));
        relacaoPedidosList.add(new Pedido("Cliente Padrao","Vendedor02",4,3d,5.5d));

        // Imprime os pedidos:
        System.out.println("Lista de pedidos: " + relacaoPedidosList);
        System.out.println();

        // Agrupar pedidos por vendedor
        System.out.println("Pedidos por Vendedor: " +
                relacaoPedidosList.stream()
                        .collect(Collectors.groupingBy(Pedido::getVendedor))
                        .entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toList())
        );
    }

    public static Map<String,List<Double>> pedidosPorVendedor(List<Pedido> pedidos){
//        pedidos.stream()
//                .
        return null;
    }

}
