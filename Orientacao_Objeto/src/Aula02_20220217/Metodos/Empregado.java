package Aula02_20220217.Metodos;

public class Empregado extends Pessoa {
    private int codigoSetor;
    protected double salarioBase;
    protected float imposto;

    public int getCodigoSetor() {
        return codigoSetor;
    }
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getImposto() {
        return imposto * 100;
    }
    public void setImposto(float imposto) {
        this.imposto = imposto / 100;
    }

    public double calcularSalario(int diasTrab, double descontos){
        float vlrDia = (float)(this.salarioBase / 30);
        double salarioBruto = (vlrDia * diasTrab);
        return (salarioBruto - (salarioBruto * imposto)) - descontos;
    }
}
