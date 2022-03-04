package br.com.letscode.poo.aulas.aula20220215;

import br.com.letscode.poo.aulas.aula20220215.entity.ContaBanco;
import br.com.letscode.poo.aulas.aula20220215.entity.Pessoa;

public class Aula01 {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        ContaBanco conta01 = new ContaBanco();

        pessoa01.nome = "Guilherme";
        pessoa01.sobrenome = "Gontijo";
        pessoa01.idade = 40;

        conta01.titular = pessoa01.nome+" "+pessoa01.sobrenome;
        conta01.banco = "Itau";
        conta01.agencia = "778-3";
        conta01.numeroConta = "15834-3";
        conta01.saldo = 1000;
        conta01.limite = 2500;

        System.out.println();
        System.out.println("Titular: "+conta01.titular);
        System.out.println("Banco: "+conta01.banco);
        System.out.println("Ag: "+conta01.agencia);
        System.out.println("CC: "+conta01.numeroConta);
    }

}
