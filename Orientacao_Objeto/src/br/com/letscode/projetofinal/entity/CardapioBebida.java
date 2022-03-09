package br.com.letscode.projetofinal.entity;

import br.com.letscode.projetofinal.enums.BebidasPrecosEnum;
import br.com.letscode.projetofinal.enums.BebidasProdutosEnum;
import br.com.letscode.projetofinal.interfaces.ICardapio;

import java.util.ArrayList;

public class CardapioBebida implements ICardapio {
    private final ArrayList<String> listaProdutos = new ArrayList<>();
    private final ArrayList<Double> listaPrecos = new ArrayList<>();

    @Override
    public void iniciaCardapio(){
        for (BebidasProdutosEnum bebidasProdutos : BebidasProdutosEnum.values()) {
            this.listaProdutos.add(bebidasProdutos.getDescricao());
        }
        for (BebidasPrecosEnum bebidasPrecos : BebidasPrecosEnum.values()) {
            this.listaPrecos.add(bebidasPrecos.getValor());
        }
    }

    @Override
    public void listaProdutos() {
        System.out.println("Bebidas:");
        for (int i = 0; i < this.listaProdutos.size(); i++){
            System.out.printf("%d - %s - R$ %.2f", i+1, this.listaProdutos.get(i), this.listaPrecos.get(i));
            System.out.println();
        }
    }

    @Override
    public double getPreco(int idProduto) {
        return listaPrecos.get(idProduto);
    }

    @Override
    public String getProduto(int idProduto) {
        return listaProdutos.get(idProduto);
    }
}
