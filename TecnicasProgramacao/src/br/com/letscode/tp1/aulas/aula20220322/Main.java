package br.com.letscode.tp1.aulas.aula20220322;

import br.com.letscode.tp1.aulas.aula20220322.entities.Quadrado;
import br.com.letscode.tp1.aulas.aula20220322.entities.Triangulo;
import br.com.letscode.tp1.aulas.aula20220322.interfaces.IFormaGeometrica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<IFormaGeometrica> formaGeometricaList = List.of(
                new Quadrado(2),
                new Triangulo(2, 3),
                new IFormaGeometrica() {  // Classe anonima
                    @Override
                    public long calculaArea() {
                        return 100;
                    }
                },
                () -> 0 // expressao lambda -> Mesma utilização da classe anonima
        );

        for (IFormaGeometrica forma : formaGeometricaList) {
            forma.print();
        }

    }
}
