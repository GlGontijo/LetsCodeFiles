package br.com.letscode.projetofinal.enums;

public enum BebidasPrecosEnum {
    REFRIGERANTE(5d),
    SUCO(7d),
    VINHO(50d);

    private final double valor;

    BebidasPrecosEnum(double valor) {this.valor = valor;}

    public double getValor() {return this.valor;}
}
