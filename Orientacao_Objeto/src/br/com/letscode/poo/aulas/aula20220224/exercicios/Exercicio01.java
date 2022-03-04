package br.com.letscode.poo.aulas.aula20220224.exercicios;

public class Exercicio01 {
    // 1. Refatore o código do método calcularSalario() na classe Empregado, utilizando constantes para os
    // fatores de cálculo do bônus e códigos do setor.
    //
    // Código do setor               Fator de cálculo do Bônus
    //      1                          5% sobre o salário base
    //      2                         10% sobre o salário base
    //      3                         20% sobre o salário base

    /* ALTERAÇÃO REALIZADA NA CLASSE 'Empregado.calcularSalario'

        // Implementação a pedido do exercicio 01 do dia 24-02-2022
        final double perSetor1 = 0.05d;
        final double perSetor2 = 0.10d;
        final double perSetor3 = 0.20d;
        switch (this.codigoSetor) {
            case 1: perAcresc = perSetor1; break;
            case 2: perAcresc = perSetor2; break;
            case 3: perAcresc = perSetor3; break;
            default:
                perAcresc = 0;
                System.out.printf("O setor %d não possui percentual de acréscimo salarial.", this.codigoSetor);
        }

     */
}
