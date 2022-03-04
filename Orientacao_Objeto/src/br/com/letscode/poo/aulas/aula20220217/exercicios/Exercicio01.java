package br.com.letscode.poo.aulas.aula20220217.exercicios;

import br.com.letscode.poo.entity.Pessoa;

public class Exercicio01 {
    /*
    1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e
    modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme
    sua percepção.

    Atributos:
    String nome;
    String endereco;
    String telefone;
    */
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Jose","Rua 10, 10");
        pessoa1.setTelefone("099999999999");

        Pessoa pessoa2 = new Pessoa("Maria", pessoa1.getEndereco(),"099888888888");

        System.out.println("A pessoa1 é:" +
                "\nNome: "+ pessoa1.getNome() +
                "\nEndereço: "+ pessoa1.getEndereco() +
                "\nTelefone: "+ pessoa1.getTelefone());

        System.out.println();
        System.out.println("A pessoa2 é:" +
                "\nNome: "+ pessoa2.getNome() +
                "\nEndereço: "+ pessoa2.getEndereco() +
                "\nTelefone: "+ pessoa2.getTelefone());
    }
}
