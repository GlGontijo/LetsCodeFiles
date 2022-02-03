import java.util.Scanner;

public class Exercicio_12 {
    // 12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 20;
        int qtdNumero = 0;

        for (int i = 1; i <= contador; i++){
            System.out.printf("Digite o %dº numero inteiro: %n", i);
            int numero = sc.nextInt();

            if (numero % 2 == 0){ qtdNumero++; }
        }

        System.out.printf("Entre os %d números digitados, %d são pares", contador, qtdNumero);
    }
}
