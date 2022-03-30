package br.com.letscode.tp1.aulas.aula20220322;

import br.com.letscode.tp1.aulas.aula20220322.entities.CheckEvenNumber;
import br.com.letscode.tp1.aulas.aula20220322.entities.CheckOddNumber;
import br.com.letscode.tp1.aulas.aula20220322.entities.CheckPrimeNumber;
import br.com.letscode.tp1.aulas.aula20220322.entities.CheckSqrtNumber;
import br.com.letscode.tp1.aulas.aula20220322.interfaces.ICheckNumber;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Exercicios {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integerNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> primeNumbers = new ArrayList<>();
        List<Integer> sqrtNumbers = new ArrayList<>();
        int qtNumbers = 20;
        LocalTime initialTime;
        LocalTime finalTime;

        for (int i = 0; i < qtNumbers; i++){
            integerNumbers.add(random.nextInt(100));
        }
        // Ordena e imprime a lista
        Collections.sort(integerNumbers);
        System.out.println("Lista: ");
        System.out.println(integerNumbers);
        System.out.println();

        System.out.println("\nMétodo 1 - Usando laços de comparação (for/if):");
        initialTime = LocalTime.now();

        // 1. Dada uma lista de números inteiros, imprima somente os pares.
        System.out.println("São números pares:");
        for (int number : integerNumbers){
            if (number %2 == 0){
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);
        System.out.println();

        // 2. Dada uma lista de números inteiros, imprima somente os impares.
        System.out.println("São números impares:");
        for (int number : integerNumbers){
            if (number %2 != 0){
                oddNumbers.add(number);
            }
        }
        System.out.println(oddNumbers);
        System.out.println();

        // 3. Dada uma lista de números inteiros, imprima somente os primos.
        System.out.println("São números primos:");
        for (int number : integerNumbers) {
            int count = 0;
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 1 || number == 1) {
                primeNumbers.add(number);
            }
        }
        System.out.println(primeNumbers);
        System.out.println();

        // 4. Dada uma lista de números inteiros, imprima somente os que possuem raiz exata.
        System.out.println("São números com raiz quadrada exata:");
        for (int number : integerNumbers) {
            if ((Math.sqrt(number) - Math.ceil(Math.sqrt(number))) == 0){
                sqrtNumbers.add(number);
            }
        }
        System.out.println(sqrtNumbers);
        System.out.println();

        finalTime = LocalTime.now();
        System.out.printf("Tempo total: %d milissegundos.\n",initialTime.until(finalTime, ChronoUnit.MILLIS));

        // ------

        System.out.println("\nMétodo 2 - Usando Classes que implementam Interface Funcional:");
        initialTime = LocalTime.now();

        // 1. Dada uma lista de números inteiros, imprima somente os pares.
        System.out.println("São números pares:");
        printNumberByCheck(integerNumbers, new CheckEvenNumber());
        System.out.println();

        // 2. Dada uma lista de números inteiros, imprima somente os impares.
        System.out.println("São números impares:");
        printNumberByCheck(integerNumbers, new CheckOddNumber());
        System.out.println();

        // 3. Dada uma lista de números inteiros, imprima somente os primos.
        System.out.println("São números primos:");
        printNumberByCheck(integerNumbers, new CheckPrimeNumber());
        System.out.println();

        // 4. Dada uma lista de números inteiros, imprima somente os que possuem raiz exata.
        System.out.println("São números com raiz quadrada exata:");
        printNumberByCheck(integerNumbers, new CheckSqrtNumber());
        System.out.println();

        finalTime = LocalTime.now();
        System.out.printf("Tempo total: %d milissegundos.\n",initialTime.until(finalTime, ChronoUnit.MILLIS));
        // ------

        System.out.println("\nMétodo 3 - Usando Expresões Lambda");
        initialTime = LocalTime.now();

        // 1. Dada uma lista de números inteiros, imprima somente os pares.
        System.out.println("São números pares:");
        printNumberByCheck(integerNumbers, (number) -> number % 2 ==0); // Sem necessidade de classe
        System.out.println();

        // 2. Dada uma lista de números inteiros, imprima somente os impares.
        System.out.println("São números impares:");
        printNumberByCheck(integerNumbers, (number) -> number % 2 !=0); // Sem necessidade de classe
        System.out.println();

        // 3. Dada uma lista de números inteiros, imprima somente os primos.
        System.out.println("São números primos:");
        printNumberByCheck(integerNumbers, new CheckPrimeNumber()); // Melhor utilizar a classe (menos código)
        System.out.println();

        // 4. Dada uma lista de números inteiros, imprima somente os que possuem raiz exata.
        System.out.println("São números com raiz quadrada exata:");
        printNumberByCheck(integerNumbers, (number) -> (Math.sqrt(number) - Math.ceil(Math.sqrt(number))) == 0);
        System.out.println();

        finalTime = LocalTime.now();
        System.out.printf("Tempo total: %d milissegundos.\n",initialTime.until(finalTime, ChronoUnit.MILLIS));
        // ------

        System.out.println("\nMétodo 4 - Usando Stream");
        initialTime = LocalTime.now();

        // 1. Dada uma lista de números inteiros, imprima somente os pares.
        System.out.println("São números pares:\n" +
                integerNumbers.stream()
                        .filter(number -> number % 2 == 0)
                        .collect(Collectors.toList()));
        System.out.println();

        // 2. Dada uma lista de números inteiros, imprima somente os impares.
        System.out.println("São números impares:\n" +
                integerNumbers.stream()
                        .filter(number -> number % 2 != 0)
                        .collect(Collectors.toList()));
        System.out.println();

        // 3. Dada uma lista de números inteiros, imprima somente os primos.
        System.out.println("São números primos:\n" +
                integerNumbers.stream()
                        .filter(number -> new CheckPrimeNumber().check(number))
                        .collect(Collectors.toList()));
        System.out.println();

        // 4. Dada uma lista de números inteiros, imprima somente os que possuem raiz exata.
        System.out.println("São números com raiz quadrada exata:\n" +
                integerNumbers.stream()
                        .filter(number -> (Math.sqrt(number) - Math.ceil(Math.sqrt(number))) == 0)
                        .collect(Collectors.toList()));
        System.out.println();

        finalTime = LocalTime.now();
        System.out.printf("Tempo total: %d milissegundos.\n",initialTime.until(finalTime, ChronoUnit.MILLIS));

    }

    public static void printNumberByCheck(List<Integer> numbers, ICheckNumber checkNumber) {
        List<Integer> filteredNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (checkNumber.check(number)) {
                filteredNumbers.add(number);
            }
        }
        System.out.println(filteredNumbers);
    }
}

// Teste de performance Framework / Benchmark JNH
