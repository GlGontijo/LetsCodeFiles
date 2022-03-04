package br.com.letscode.poo.entity;

public class Concessionaria {

    private Carro[] carros;
    private Moto[] motos;

    public Concessionaria(Carro[] carros, Moto[] motos) {
        this.carros = carros;
        this.motos = motos;
    }

    public Carro[] getCarros() { return carros; }
    public void setCarros(Carro[] carros) { this.carros = carros; }

    public Moto[] getMotos() { return motos; }
    public void setMotos(Moto[] motos) { this.motos = motos; }

    public void imprimeCarros() {
        for (Carro carro : this.carros) {
            System.out.println(carro);
        }
    }
}
