package br.com.letscode.projetofinal.entity;

public class Cardapio {
    private final CardapioLanche cardapioLanche = new CardapioLanche();
    private final CardapioBebida cardapioBebida = new CardapioBebida();
    private final CardapioPrato cardapioPrato = new CardapioPrato();

    public void opcoesCardapio() {
        System.out.println("Escolha o que vai querer:\n" +
                " 1 - Lanches\n" +
                " 2 - Pratos\n" +
                " 3 - Bebidas");
    }

    public String listaCardapio(int opt) {
        String tipoProduto;
        System.out.println();
        switch (opt) {
            case 1:
                cardapioLanche.iniciaCardapio();
                cardapioLanche.listaProdutos();
                tipoProduto = "Lanche";
                break;
            case 2:
                cardapioPrato.iniciaCardapio();
                cardapioPrato.listaProdutos();
                tipoProduto = "Prato";
                break;
            case 3:
                cardapioBebida.iniciaCardapio();
                cardapioBebida.listaProdutos();
                tipoProduto = "Bebida";
                break;
            default:
                tipoProduto = "ERRO";
        }
        return tipoProduto;
    }

    public String getProdutoCardapio(String tipoProduto, int idProduto){
        String produto = null;
        if (tipoProduto.equalsIgnoreCase("Lanche")){
            produto = cardapioLanche.getProduto(idProduto);
        } else if (tipoProduto.equalsIgnoreCase("Prato")){
            produto = cardapioPrato.getProduto(idProduto);
        } else if (tipoProduto.equalsIgnoreCase("Bebida")){
            produto = cardapioBebida.getProduto(idProduto);
        }
        return produto;
    }

    public double getVlrProdutoCardapio(String tipoProduto, int idProduto){
        double valorProduto = 0d;
        if (tipoProduto.equalsIgnoreCase("Lanche")){
            valorProduto = cardapioLanche.getPreco(idProduto);
        } else if (tipoProduto.equalsIgnoreCase("Prato")){
            valorProduto = cardapioPrato.getPreco(idProduto);
        } else if (tipoProduto.equalsIgnoreCase("Bebida")){
            valorProduto = cardapioBebida.getPreco(idProduto);
        }
        return valorProduto;
    }

}
