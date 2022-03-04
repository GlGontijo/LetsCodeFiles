package br.com.letscode.poo.aulas.aula20220224.exercicios;

import br.com.letscode.poo.entity.Empregado;

public class Exercicio02 {
    // 2. Crie um Enum para representar chamado TipoJornadaEmpregado, que será usado na classe Empregado para representar se ele trabalha PERIODO_COMPLETO ou em MEIO_PERIODO.
    //
    // A exibição destes valores em console deve ser “Período Completo” e “Meio Período”, respectivamente.

    public static void main(String[] args) {

        Empregado empregadoMeioPeriodo = new Empregado(
                "Jose Silva",
                "Rua 22, 150",
                "011987654321",
                4,
                3500.15d,
                11f,
                "Meio Período"
        );
        Empregado empregadoPeriodoCompleto = new Empregado(
                "Maria Silva",
                "Rua 22, 150",
                "011987656789",
                3,
                2500.65d,
                11f,
                "Período Completo"
        );

        System.out.println(empregadoMeioPeriodo);
        System.out.println();
        System.out.println(empregadoPeriodoCompleto);
    }
}
