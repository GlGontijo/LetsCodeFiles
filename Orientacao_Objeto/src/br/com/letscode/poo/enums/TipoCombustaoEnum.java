package br.com.letscode.poo.enums;

public enum TipoCombustaoEnum {

    GASOLINA("Gasolina"),
    ALCOOL("Álcool"),
    FLEX("Flex"),
    ELETRICO("Elétrico");

    private final String descricao;

    TipoCombustaoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
