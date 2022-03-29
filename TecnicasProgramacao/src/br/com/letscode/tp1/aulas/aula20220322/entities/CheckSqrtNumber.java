package br.com.letscode.tp1.aulas.aula20220322.entities;

import br.com.letscode.tp1.aulas.aula20220322.interfaces.ICheckNumber;

public class CheckSqrtNumber implements ICheckNumber {
    @Override
    public boolean check(Integer number) {return (Math.sqrt(number) - Math.ceil(Math.sqrt(number))) == 0;}
}
