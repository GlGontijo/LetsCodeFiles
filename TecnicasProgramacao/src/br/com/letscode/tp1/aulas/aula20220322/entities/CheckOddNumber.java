package br.com.letscode.tp1.aulas.aula20220322.entities;

import br.com.letscode.tp1.aulas.aula20220322.interfaces.ICheckNumber;

public class CheckOddNumber implements ICheckNumber {
    @Override
    public boolean check(Integer number) {return number %2 != 0;}
}
