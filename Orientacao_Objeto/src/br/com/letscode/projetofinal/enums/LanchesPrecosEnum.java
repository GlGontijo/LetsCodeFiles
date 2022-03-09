package br.com.letscode.projetofinal.enums;

public enum LanchesPrecosEnum {
    BURGUER(30d),
    PIZZA(45d),
    FOGAZZA(20d);

    private final double valor;

    LanchesPrecosEnum(double valor) {this.valor = valor;}

    public double getValor() {return this.valor;}
}
