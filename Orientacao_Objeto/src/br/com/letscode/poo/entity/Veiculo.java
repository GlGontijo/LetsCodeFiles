package br.com.letscode.poo.entity;

public class Veiculo {
    private String modelo;
    private String marca;
    private String cor;
    private int anoFab;
    private int velMax;
    private int velAtual;
    private float vlrFipe;

    public Veiculo(){}

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFab() {
        return anoFab;
    }
    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public int getVelMax() {
        return velMax;
    }
    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public int getVelAtual() {
        return velAtual;
    }
    public void setVelAtual(int velAtual) {
        this.velAtual = velAtual;
    }

    public float getVlrFipe() {
        return vlrFipe;
    }
    public void setVlrFipe(float vlrFipe) {
        this.vlrFipe = vlrFipe;
    }

    public void printInfo(){
        System.out.println("\nVeiculo: "+getModelo()+
                "\nMarca: "+this.getMarca()+
                "\nCor: "+this.getCor());
    }

    public void acelerar(int velAumenta){
        if ((getVelAtual() + velAumenta) <= getVelMax()){
            this.velAtual += velAumenta;
            System.out.println("Estou acelerando "+getVelAtual()+"km/h");
        } else {
            System.out.println("Velocidade acima do valor permitido para o veiculo");
        }
    }

    public void frear(int velDiminui){
        this.velAtual -= velDiminui;
        System.out.println("Estou freando o veiculo "+getModelo());
        System.out.println("Velocidade atual: "+getVelAtual()+"km/h");
    }
}
