package br.com.letscode.poo.entity;

public class Empregado extends Pessoa {
    private int codigoSetor;
    protected double salarioBase;
    protected double imposto;
    // Implementação a pedido do exercicio 02 do dia 24-02-2022
    protected String tipoJornadaEmpregadoEnum;

    public int getCodigoSetor() {return codigoSetor;}
    public void setCodigoSetor(int codigoSetor) {this.codigoSetor = codigoSetor;}

    public double getSalarioBase() {return salarioBase;}
    public void setSalarioBase(double salarioBase) {this.salarioBase = salarioBase;}

    //Imposto recebe % e armazena decimal
    public double getImposto() {return imposto * 100;}
    public void setImposto(double imposto) {this.imposto = imposto / 100d;}

    public double calcularSalario(int diasTrab, double descontos){
        // Implementação a pedido do exercicio 03 do dia 22-02-2022
        double perAcresc;
        // Implementação a pedido do exercicio 01 do dia 24-02-2022
        final double perSetor1 = 0.05d;
        final double perSetor2 = 0.10d;
        final double perSetor3 = 0.20d;
        switch (this.codigoSetor) {
            case 1: perAcresc = perSetor1; break;
            case 2: perAcresc = perSetor2; break;
            case 3: perAcresc = perSetor3; break;
            default:
                perAcresc = 0;
                System.out.printf("O setor %d não possui percentual de acréscimo salarial.", this.codigoSetor);
        }

        float vlrDia = (float)(this.salarioBase / 30);
        double salarioBruto = (vlrDia * diasTrab);
        double acrescimos = ((vlrDia * diasTrab) * perAcresc);
        return (salarioBruto - (salarioBruto * imposto)) - descontos + acrescimos;
    }

    // Exercicios do dia 22-12-2022

    public Empregado(){}

    public Empregado(
            String nome, String endereco, String telefone, int codigoSetor,double salarioBase,
            float imposto, String tipoJornadaEmpregadoEnum){
        super(nome,endereco,telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto / 100d;
        this.tipoJornadaEmpregadoEnum = tipoJornadaEmpregadoEnum;
    }

    // Exercicios do dia 22-12-2022
    // Polimorfismo de Sobreposição: Sobrescrevendo o método toString()
    // Usado para 'imprimir' os parametros da classe.
    @Override
    public String toString() {
        return super.toString() +
                ", codigoSetor=" + this.codigoSetor +
                ", salarioBase=R$" + this.salarioBase +
                ", imposto=" + (this.imposto * 100d) + "%" +
                ", jornada de trabalho='" + tipoJornadaEmpregadoEnum + "'.";
    }
}
