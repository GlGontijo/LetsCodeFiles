package br.com.letscode.tp1.aulas.aula20220329.exercicios;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercicio01 {
    public static void main(String[] args) {
        // Dada uma lista de inteiros:
        List<Integer> numeros = IntStream.rangeClosed(-10,10).boxed().collect(Collectors.toList());
        System.out.println("Lista de números: \n" + numeros);

        // 1. Filtrar apenas números pares e exibir como string, separado por ','.
        System.out.println("Valores pares: \n" +
                numeros.stream()
                        .filter(n -> n % 2 == 0)
                        .map(Object::toString)
                        .collect(Collectors.joining(","))
                );

        // 2. Filtrar apenas números impares e exibir como string, separado por ','.
        System.out.println("Valores impares: \n" +
                numeros.stream()
                        .filter(n -> n % 2 != 0)
                        .map(Object::toString)
                        .collect(Collectors.joining(","))
                );

        // 3. Filtrar apenas números positivos e agrupar em números pares e ímpares.
        System.out.println("Valores positivos: \n" +
                numeros.stream()
                        .filter(n -> n >= 0)
                        .collect(Collectors.groupingBy(n -> n % 2 == 0))
                );
    }
}
