package br.com.letscode.poo.entity;

import java.util.ArrayList;

public class Calculadora {
    private final ArrayList<Float> valores = new ArrayList<>();
    private final ArrayList<String> operacoes = new ArrayList<>();
    private float resultado;

    public float getResultado() {return resultado;}

    public void setResultado(float resultado) {
        this.resultado = resultado;
        valores.add(resultado);
    }

    // operacoes de cáuculo
    public float soma(float valor){
        resultado += valor;
        valores.add(valor);
        operacoes.add(String.valueOf('+'));
        return resultado;
    }
    public float subtrai(float valor){
        resultado -= valor;
        valores.add(valor);
        operacoes.add(String.valueOf('-'));
        return resultado;
    }
    public float multiplica(float valor){
        resultado *= valor;
        valores.add(valor);
        operacoes.add(String.valueOf('*'));
        return resultado;
    }
    public float divide(float valor){
        if (valor == 0f){
            System.out.println("Divisão por zero não permitida.");
            System.out.println();
        } else {
            resultado /= valor;
            valores.add(valor);
            operacoes.add(String.valueOf('/'));
        }
        return resultado;
    }

    // Imprime tudo que foi feito até aqui
    public void historico(){
        System.out.println("Historico:");
        // primeiro valor
        System.out.print(" " + valores.get(0));
        for (int i=0; i < operacoes.size(); i++){
            System.out.print(" " + operacoes.get(i));
            System.out.print(" " + valores.get(i+1));
        }
        System.out.print(" ");
    }

    // Limpa todos os arrays
    public void limpaHistorico(){
        valores.clear();
        operacoes.clear();
        resultado = 0;
    }
}
