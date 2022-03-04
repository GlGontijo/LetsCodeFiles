package br.com.letscode.poo.entity;

public class Fornecedor extends Pessoa {
    double vlrCredit;
    double vlrDivida;

    public double getVlrCredit() {return vlrCredit;}
    public void setVlrCredit(double vlrCredit) {this.vlrCredit = vlrCredit;}

    public double getVlrDivida() {return vlrDivida;}
    public void setVlrDivida(double vlrDivida) {this.vlrDivida = vlrDivida;}

    public double obterSaldo(){return (getVlrCredit() - getVlrDivida());}

    // Exercicios do dia 22-12-2022

    public Fornecedor(){}

    public Fornecedor(String nome, String endereco, String telefone,double vlrCredit, double vlrDivida){
        super(nome,endereco,telefone);
        this.vlrCredit = vlrCredit;
        this.vlrDivida = vlrDivida;
    }

    // Exercicios do dia 22-12-2022
    // Polimorfismo de Sobreposição: Sobrescrevendo o método toString()
    // Usado para 'imprimir' os parametros da classe.
    @Override
    public String toString() {
        return super.toString() +
                ", vlrCredit=R$" + vlrCredit +
                ", vlrDivida=R$" + vlrDivida ;
    }
}
