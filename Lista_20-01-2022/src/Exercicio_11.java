import java.util.Scanner;

public class Exercicio_11 {
    // 11) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 20;
        int qtdNumero = 0;

        for (int i = 1; i <= contador; i++){
            System.out.printf("Digite o %dº numero: %n", i);
            double numero = sc.nextFloat();

            if (numero > 8.0){ qtdNumero++; }
        }

        System.out.printf("Entre os %d números digitados, %d são maiores que 8,0", contador, qtdNumero);
    }
}
