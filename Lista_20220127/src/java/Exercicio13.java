package java;

import lib.Meses;

import java.util.Scanner;

public class Exercicio13 {
    // 13. Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista.
    // Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual,
    // e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . )

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Meses[] meses = Meses.values();
        float[] tempMes = new float[meses.length];
        float somaTemp = 0;
        float mediaAno;

        for (int i=0; i < meses.length; i++){
            System.out.println("Digite a temperatura média registrada no mês de "+meses[i]);
            tempMes[i] = sc.nextFloat();
            somaTemp += tempMes[i];
        }

        mediaAno = somaTemp / tempMes.length;
        System.out.printf("Os meses com temperatura acima da média deste ano de %.2fºC, foram:%n",mediaAno);
        for (int i=0; i < meses.length; i++){
            if (tempMes[i] > mediaAno){
                System.out.printf("%d - %s: %.2fºC.%n",1+i,meses[i],tempMes[i]);
            }
        }
    }
}
