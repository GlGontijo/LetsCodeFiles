package br.com.letscode.poo.entity;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {return ajudaDeCusto;}
    public void setAjudaDeCusto(double ajudaDeCusto) {this.ajudaDeCusto = ajudaDeCusto;}

    @Override
    public double calcularSalario(int diasTrab, double descontos){
        float vlrDia = (float)(this.salarioBase / 30);
        double salarioBruto = (vlrDia * diasTrab);
        return (salarioBruto - (salarioBruto * this.imposto) - descontos + this.ajudaDeCusto);
    }

}
