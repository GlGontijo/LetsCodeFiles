package br.com.letscode.poo.aulas.aula20220224.exercicios;

import br.com.letscode.poo.entity.LampadaFluorescente;
import br.com.letscode.poo.entity.LampadaIncandescente;

import java.util.Scanner;

public class Exercicio03 {
    // 3. Crie uma interface chamada ILampada com os métodos liga() e desliga(), cujo objetivo é somente imprimir uma
    // mensagem avisando que a lâmpada foi ligada ou desligada.
    //
    // Crie duas classes: LampadaFluorescente e LampadaIncandescente que implementam a interface ILampada com os
    // comportamentos descritos no parágrafo anterior.
    //
    // Os objetos devem ser instanciados em um Criador de Lâmpada Fluorescente e Incandescente, respectivamente.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LampadaFluorescente lampadaFluorescente = new LampadaFluorescente();
        LampadaIncandescente lampadaIncandescente = new LampadaIncandescente();

        boolean continuar = true;
        while (continuar){
            System.out.println("\nStatus das lâmpadas:");
            System.out.print("A Lâmpada Fluorescente está ");
            if (lampadaFluorescente.isOn()){
                System.out.println("'ligada'!");
            } else {
                System.out.println("'desligada'!");
            }
            System.out.print("A Lâmpada Incandescente está ");
            if (lampadaIncandescente.isOn()){
                System.out.println("'ligada'!");
            } else {
                System.out.println("'desligada'!");
            }

            System.out.println("\nDeseja tomar alguma ação?" +
                    "\n  1 - Ligar a Lâmpada Fluorescente" +
                    "\n  2 - Desligar a Lâmpada Fluorescente" +
                    "\n  3 - Ligar a Lâmpada Incandescente" +
                    "\n  4 - Desligar a Lâmpada Incandescente" +
                    "\n  0 - Não fazer nada e sair");
            int opt = scanner.nextInt();
            scanner.nextLine();
            switch (opt){
                case 1: lampadaFluorescente.liga(); break;
                case 2: lampadaFluorescente.desliga(); break;
                case 3: lampadaIncandescente.liga(); break;
                case 4: lampadaIncandescente.desliga(); break;
                case 0: continuar = false; break;
                default:
                    System.out.println("Opção '"+opt+"' inválida! Tente novamente.");
            }
        }
    }
}
