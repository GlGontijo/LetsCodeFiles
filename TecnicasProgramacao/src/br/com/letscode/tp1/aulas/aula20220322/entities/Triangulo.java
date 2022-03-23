package br.com.letscode.tp1.aulas.aula20220322.entities;

import br.com.letscode.tp1.aulas.aula20220322.interfaces.FormaGeometrica;

public class Triangulo implements FormaGeometrica {
    private long base;
    private long altura;

    public Triangulo(long base, long altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public long calculaArea() {
        return (base * altura) / 2;
    }
}
