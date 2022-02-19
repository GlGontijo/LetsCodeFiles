package Aula02_20220217.Metodos;

public class Fornecedor extends Pessoa {
    double vlrCredit = 0;
    double vlrDivida = 0;

    public double getVlrCredit() {
        return vlrCredit;
    }
    public void setVlrCredit(double vlrCredit) {
        this.vlrCredit = vlrCredit;
    }

    public double getVlrDivida() {
        return vlrDivida;
    }
    public void setVlrDivida(double vlrDivida) {
        this.vlrDivida = vlrDivida;
    }

    public double obterSaldo(){
        return (getVlrCredit() - getVlrDivida());
    }
}
