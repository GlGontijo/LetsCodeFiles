package Aula01_20220215;

public class ContaBanco {
    String numeroConta;
    String agencia;
    String banco;
    String titular;
    double saldo;
    double limite;

    void depositar(double valor){
        this.saldo += valor;
    }

    void sacar(double valor){
        this.saldo += valor;
    }
}
