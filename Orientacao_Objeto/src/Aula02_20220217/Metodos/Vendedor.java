package Aula02_20220217.Metodos;

public class Vendedor extends Empregado{
    private double vlrVend;
    private double comissao;

    public double getVlrVend() { return vlrVend; }
    public void setVlrVend(double vlrVend) { this.vlrVend = vlrVend; }

    // Comissao recebe % e armazena decimal
    public double getComissao() { return comissao *100; }
    public void setComissao(double comissao) { this.comissao = comissao /100; }

    @Override
    public double calcularSalario(int diasTrab, double descontos){
        float vlrDia = (float)(this.salarioBase / 30);
        double salarioBruto = (vlrDia * diasTrab);
        double vlrComissao = (this.vlrVend * comissao);
        return (salarioBruto - (salarioBruto * this.imposto) - descontos + vlrComissao);
    }
}

