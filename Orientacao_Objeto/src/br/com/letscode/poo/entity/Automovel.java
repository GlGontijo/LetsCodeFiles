package br.com.letscode.poo.entity;

public abstract class Automovel {

    protected String fabricante;
    protected String modelo;
    protected int ano;
    protected String tipoCombustaoEnum;
    private double preco;

    public Automovel() { }

    public Automovel(String fabricante, String modelo, int ano, String tipoCombustaoEnum, double preco) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.tipoCombustaoEnum = tipoCombustaoEnum;
        this.preco = preco;
    }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public String getTipoCombustaoEnum() { return tipoCombustaoEnum; }
    public void setTipoCombustaoEnum(String tipoCombustaoEnum) { this.tipoCombustaoEnum = tipoCombustaoEnum; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

}
