import java.util.Scanner;

public class Exercicio_13 {
    // 13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 20;
        int qtdNumero = 0;

        for (int i = 1; i <= contador; i++){
            System.out.printf("Digite o %dº numero: %n", i);
            double numero = sc.nextFloat();

            if (numero >= 0 && numero <= 100){ qtdNumero++; }
        }

        System.out.printf("Entre os %d números digitados, %d estão entre 0 e 100", contador, qtdNumero);
    }
}
