package br.com.letscode.tp1.aulas.aula20220329.entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String vendedor;
    private String comprador;
    private List<ItensVendidos> itensVendidosList = new ArrayList<>();

    public Pedido(String comprador, String vendedor, List<ItensVendidos> itensVendidosList) {
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.itensVendidosList.addAll(itensVendidosList);
    }

    public String getComprador() {return comprador;}
    public void setComprador(String comprador) {this.comprador = comprador;}

    public String getVendedor() {return vendedor;}

    public List<ItensVendidos> getItensVendidosList() {return itensVendidosList;}
    public void setItensVendidosList(List<ItensVendidos> itensVendidosList) {
        this.itensVendidosList.addAll(itensVendidosList);
    }

    public double getValTotalItens() {
        return itensVendidosList.stream()
                .mapToDouble(ItensVendidos::getValorItem).sum();
    }

    public double getQtdTotalItens() {
        return itensVendidosList.stream()
                .mapToDouble(ItensVendidos::getQtdItem).sum();
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "vendedor='" + vendedor + '\'' +
                ", comprador='" + comprador + '\'' +
                ", itensVendidosList=" + itensVendidosList +
                '}';
    }
}
