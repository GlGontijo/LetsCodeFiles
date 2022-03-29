package br.com.letscode.tp1.aulas.aula20220322.entities;

import br.com.letscode.tp1.aulas.aula20220322.interfaces.ICheckNumber;

public class CheckPrimeNumber implements ICheckNumber {
    @Override
    public boolean check(Integer number) {
        boolean isPrime = true;
        int count = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (count > 1) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
