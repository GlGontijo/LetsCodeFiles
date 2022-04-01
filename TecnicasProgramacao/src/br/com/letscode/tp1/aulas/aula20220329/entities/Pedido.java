package br.com.letscode.tp1.aulas.aula20220329.entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String vendedor;
    private String comprador;
    List<ItensVendidos> itensVendidosList = new ArrayList<>();

    public Pedido(String comprador, String vendedor, int codItem, double qtdItem, double valorItem) {
        this.comprador = comprador;
        this.vendedor = vendedor;
        ItensVendidos itemVendido = new ItensVendidos(codItem, qtdItem, valorItem);
        this.itensVendidosList.add(itemVendido);
    }

    public String getComprador() {return comprador;}
    public void setComprador(String comprador) {this.comprador = comprador;}

    public String getVendedor() {return vendedor;}

    public List<ItensVendidos> getItensVendidosList() {return itensVendidosList;}
    public void setItensVendidosList(int codItem, double qtdItem, double valorItem) {
        this.itensVendidosList.add(new ItensVendidos(codItem, qtdItem, valorItem));
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
