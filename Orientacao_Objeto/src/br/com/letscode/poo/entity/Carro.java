package br.com.letscode.poo.entity;

public class Carro extends Automovel{

    private int quantidadePortas;
    private boolean hasAirBag;

    public Carro(String fabricante, String modelo, int ano, String tipoCombustaoEnum, double preco,
                 int quantidadePortas, boolean hasAirBag) {
        super(fabricante, modelo, ano, tipoCombustaoEnum, preco);
        this.quantidadePortas = quantidadePortas;
        this.hasAirBag = hasAirBag;
    }

    public int getQuantidadePortas() { return quantidadePortas; }
    public void setQuantidadePortas(int quantidadePortas) { this.quantidadePortas = quantidadePortas; }

    public boolean hasAirBag() { return hasAirBag; }
    public void setHasAirBag(boolean hasAirBag) { this.hasAirBag = hasAirBag; }

    @Override
    public String toString() {
        return "Carro{" +
                "quantidadePortas=" + quantidadePortas +
                ", hasAirBag=" + hasAirBag +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", tipoCombustaoEnum='" + tipoCombustaoEnum + '\'' +
                '}';
    }
}
