package Aula03_20220222.Exercicios;

import Enums.TipoJornadaEmpregadoEnum;
import Metodos.Empregado;
import Metodos.Fornecedor;

public class Exercicio01 {
    // 1. Para cada subclasse da superclasse Pessoa, crie um construtor referenciando a superclasse e utilizando seus
    // atributos particulares.
    //
    //Instancie ao menos um objeto de cada uma das subclasses já atribuindo valores para cada um de seus atributos.

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor(
                "Jose","rua R, 0", "9090990990",5500,500);
        Empregado empregado = new Empregado(
                "Tiao","rua 10, 20","995925932",3,4332,
                11, TipoJornadaEmpregadoEnum.PERIODO_COMPLETO.getDescricao());

        System.out.println("Fornecedor: "+fornecedor);
        System.out.println("Empregado: "+empregado);
    }
}
