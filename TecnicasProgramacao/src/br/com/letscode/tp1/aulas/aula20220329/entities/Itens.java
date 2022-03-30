package br.com.letscode.tp1.aulas.aula20220329.entities;

public class Itens {
    private Integer codItem;
    private String descItem;
    private Double valorItem;

    public Integer getCodItem() {return codItem;}
    public void setCodItem(Integer codItem) {this.codItem = codItem;}

    public String getDescItem() {return descItem;}
    public void setDescItem(String descItem) {this.descItem = descItem;}

    public Double getValorItem() {return valorItem;}
    public void setValorItem(Double valorItem) {this.valorItem = valorItem;}

    public Itens(Integer codItem, String descItem, Double valorItem) {
        this.codItem = codItem;
        this.descItem = descItem;
        this.valorItem = valorItem;
    }

    @Override
    public String toString() {
        return "Itens{" +
                "codItem=" + codItem +
                ", descItem='" + descItem + '\'' +
                ", valorItem=" + valorItem +
                '}';
    }
}
