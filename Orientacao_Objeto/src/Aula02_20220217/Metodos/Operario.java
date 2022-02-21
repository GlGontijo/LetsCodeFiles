package Aula02_20220217.Metodos;

public class Operario extends Empregado{
    private double vlrProd;
    private double comissao;

    public double getVlrProd() { return vlrProd; }
    public void setVlrProd(double vlrProd) { this.vlrProd = vlrProd; }

    // Comissao recebe % e armazena decimal
    public double getComissao() { return comissao *100; }
    public void setComissao(double comissao) { this.comissao = comissao /100; }

    @Override
    public double calcularSalario(int diasTrab, double descontos){
        float vlrDia = (float)(this.salarioBase / 30);
        double salarioBruto = (vlrDia * diasTrab);
        double vlrComissao = (this.vlrProd * comissao);
        return (salarioBruto - (salarioBruto * this.imposto) - descontos + vlrComissao);
    }
}
