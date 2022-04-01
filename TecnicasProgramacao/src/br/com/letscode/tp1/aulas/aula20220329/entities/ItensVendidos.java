package br.com.letscode.tp1.aulas.aula20220329.entities;

public class ItensVendidos {
    private int codItem;
    private double qtdItem;
    private double valorItem;

    public ItensVendidos(int codItem, double qtdItem, double valorItem) {
        this.codItem = codItem;
        this.qtdItem = qtdItem;
        this.valorItem = valorItem;
    }

    public int getCodItem() {return codItem;}
    public void setCodItem(int codItem) {this.codItem = codItem;}

    public double getQtdItem() {return qtdItem;}
    public void setQtdItem(double qtdItem) {this.qtdItem = qtdItem;}

    public double getValorItem() {return valorItem;}
    public void setValorItem(double valorItem) {this.valorItem = valorItem;}

    @Override
    public String toString() {
        return "Itens{" +
                "codItem=" + codItem +
                ", qtdItem='" + qtdItem + '\'' +
                ", valorItem=" + valorItem +
                '}';
    }
}
