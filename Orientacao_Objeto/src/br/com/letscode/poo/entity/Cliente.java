package br.com.letscode.poo.entity;

import java.math.BigDecimal;

public class Cliente extends Pessoa {
    private String cpf;
    private BigDecimal rendaMensal;

    public Cliente(){}

    public Cliente(String nome, String endereco, String telefone, String cpf, BigDecimal rendaMensal) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
        this.rendaMensal = rendaMensal;
    }

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public BigDecimal getRendaMensal() {return rendaMensal;}
    public void setRendaMensal(BigDecimal rendaMensal) {this.rendaMensal = rendaMensal;}

    public boolean hasCPF(String cpf) {
        return this.cpf.equals(cpf);
    }

    public static boolean isCPF(String cpf){
        if(!cpf.matches("\\d{11}")){
            System.out.println("CPF " + cpf + " digitado é inválido.");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                super.toString() +
                ", cpf='" + cpf + '\'' +
                ", rendaMensal=" + rendaMensal +
                '}';
    }

}
