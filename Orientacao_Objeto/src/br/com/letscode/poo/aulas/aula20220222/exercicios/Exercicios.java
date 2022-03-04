package br.com.letscode.poo.aulas.aula20220222.exercicios;

import br.com.letscode.poo.enums.TipoJornadaEmpregadoEnum;
import br.com.letscode.poo.entity.Empregado;
import br.com.letscode.poo.entity.Fornecedor;

public class Exercicios {

    public static void main(String[] args) {
        // 1. Para cada subclasse da superclasse Pessoa, crie um construtor referenciando a superclasse e utilizando seus
        // atributos particulares.
        //
        //Instancie ao menos um objeto de cada uma das subclasses já atribuindo valores para cada um de seus atributos.
        Fornecedor fornecedor = new Fornecedor(
                "Jose","rua R, 0", "9090990990",5500,500);
        Empregado empregado = new Empregado(
                "Tiao","rua 10, 20","995925932",3,4332,
                11, TipoJornadaEmpregadoEnum.PERIODO_COMPLETO.getDescricao());

        /* ****************************** */

        // 2. Reescreva o método toString() de cada uma das subclasses, para imprimir em tela todos os seus atributos.
        // A partir da sua implementação, coloque um comentário no código explicando qual categoria de polimorfismo
        // foi utilizada e porquê.
        System.out.println("Fornecedor: "+fornecedor);
        System.out.println("Empregado: "+empregado);
        // Polimorfismo de Sobreposição: Sobrescrevendo o método toString()
        // Usado para 'imprimir' os parametros da classe.

        /* ****************************** */

        // 3. Crie uma implementação do método calcularSalario na classe Empregado, considerando um valor de bônus de
        // acordo com o setor o qual o empregado pertence.
        //
        // Código do setor       Fator de cálculo do Bônus
        //      1                 5% sobre o salário base
        //      2                 10% sobre o salário base
        //      3                 20% sobre o salário base
        //
        // Caso o código do setor não seja informado ou não existir na relação acima, imprimir uma mensagem de erro no
        // console e calcular o salário sem considerar este bônus.
        // A partir da sua implementação, coloque um comentário no código explicando qual categoria de polimorfismo
        // foi utilizada e porquê.

        int diasTrabalhados = 28;
        double descontos = 350d;
        double salarioFinalMes = empregado.calcularSalario(diasTrabalhados, descontos);
        System.out.printf("\nO salario do mês do empregado %s é: " +
                "\n  Salário Base: R$%.2f" + "\n  Dias: %d" + "\n  Descontos: R$%.2f" + "\n  Total: R$%.2f",
                empregado.getNome(),empregado.getSalarioBase(),diasTrabalhados,descontos,salarioFinalMes);
        // Não encontrei necessidade de polimorfismo (seria o de Sobrecarga).
        // Por entender que o código comportaria a alteração sem representar falha no seu uso.

    }
}
