package br.com.letscode.projetofinal.enums;

public enum PratosPrecosEnum {
    PASTA(30d),
    LASANHA(70d),
    POLPETONE(50d);

    private final double valor;

    PratosPrecosEnum(double valor) {this.valor = valor;}

    public double getValor() {return this.valor;}
}
