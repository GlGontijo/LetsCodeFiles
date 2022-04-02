package br.com.letscode.tp1.aulas.aula20220329.exercicios;

import br.com.letscode.tp1.aulas.aula20220329.entities.ItensVendidos;
import br.com.letscode.tp1.aulas.aula20220329.entities.Pedido;
import br.com.letscode.tp1.aulas.aula20220329.entities.TotalPorVendedor;

import java.util.*;
import java.util.stream.Collectors;

public class Exercicio02 {
    // 2. Dada uma relação de pedidos:
    public static void main(String[] args) {
        // Imprime os pedidos:
        System.out.println("Lista de pedidos: " + getPedidosTeste()
                .stream()
                .sorted(Comparator.comparing(Pedido::getVendedor))
                .collect(Collectors.toList()));
        System.out.println();

        // Agrupar pedidos por vendedor e totalizar itens e valores
        List<Map.Entry<String, TotalPorVendedor>> pedidosVendedorList = getPedidosTeste()
                .stream()
                .collect(Collectors.groupingBy(Pedido::getVendedor))
                .entrySet().stream()
                .map(entry -> pedidosPorVendedor(entry))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toList());
        System.out.println("Pedidos por Vendedor: " + pedidosVendedorList);
    }

    public static List<Pedido> getPedidosTeste() {
        // Construindo pedidos:
        List<Pedido> relacaoPedidosList = new ArrayList<>();

        relacaoPedidosList.add(
                new Pedido("Cliente Padrao", "Vendedor01",
                        List.of(new ItensVendidos(1, 3d, 10d))
                ));
        relacaoPedidosList.add(
                new Pedido("Jose Silva", "Vendedor02",
                        List.of(new ItensVendidos(5, 1d, 20d))
                ));
        relacaoPedidosList.add(
                new Pedido("Cliente Padrao", "Vendedor02",
                        List.of(new ItensVendidos(2, 2d, 15d))
                ));
        relacaoPedidosList.add(
                new Pedido("Joana Cartafina", "Vendedor01",
                        List.of(new ItensVendidos(3, 2d, 18.5d))
                ));
        relacaoPedidosList.add(
                new Pedido("Cliente Padrao", "Vendedor02",
                        List.of(new ItensVendidos(4, 3d, 5.5d))
                ));

        return relacaoPedidosList;
    }

    public static Map.Entry<String, TotalPorVendedor> pedidosPorVendedor(Map.Entry<String, List<Pedido>> entry){
        String vendedor = entry.getKey();
        List<Pedido> pedidos = entry.getValue();
        double vlrTotal = pedidos.stream().mapToDouble(Pedido::getValTotalItens).sum();
        double qtdTotal = pedidos.stream().mapToDouble(Pedido::getQtdTotalItens).sum();

        return Map.entry(vendedor,new TotalPorVendedor(qtdTotal,vlrTotal));
    }

}
