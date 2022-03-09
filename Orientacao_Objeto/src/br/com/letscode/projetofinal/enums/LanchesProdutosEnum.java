package br.com.letscode.projetofinal.enums;

public enum LanchesProdutosEnum {
    BURGUER("Burguer"),
    PIZZA("Pizza"),
    FOGAZZA("Fogazza");

    private final String descricao;

    LanchesProdutosEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
