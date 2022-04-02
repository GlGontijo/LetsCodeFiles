package br.com.letscode.tp1.aulas.aula20220329.entities;

public class TotalPorVendedor {
    private double qtdTotal;
    private double vlrTotal;

    public TotalPorVendedor(double qtdTotal, double vlrTotal) {
        this.qtdTotal = qtdTotal;
        this.vlrTotal = vlrTotal;
    }

    @Override
    public String toString() {
        return "TotalPorVendedor{" +
                "qtdTotal=" + qtdTotal +
                ", vlrTotal=" + vlrTotal +
                '}';
    }
}
