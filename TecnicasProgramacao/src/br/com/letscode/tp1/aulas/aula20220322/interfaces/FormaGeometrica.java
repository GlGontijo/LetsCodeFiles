package br.com.letscode.tp1.aulas.aula20220322.interfaces;

// Interface Funcional - só define 1 método abstrato
@FunctionalInterface
public interface FormaGeometrica {
    // método abstrato -
    long calculaArea();

    // método default
    default void print() {
        System.out.println("Calculo da Area: " + calculaArea());
    }
}
