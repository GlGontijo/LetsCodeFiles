package br.com.letscode.tp1.aulas.aula20220322.entities;

import br.com.letscode.tp1.aulas.aula20220322.interfaces.IFormaGeometrica;

public class Quadrado implements IFormaGeometrica {
    private long lado;

    public Quadrado(long lado) {
        this.lado = lado;
    }

    @Override
    public long calculaArea(){
        return lado * lado;
    }
}
