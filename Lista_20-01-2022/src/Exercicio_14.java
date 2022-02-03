import java.util.Scanner;

public class Exercicio_14 {
    // 14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
    // 100, quantos estão entre 101 e 200 e quantos são maiores de 200.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 20;
        int qtdNumero1 = 0;
        int qtdNumero2 = 0;
        int qtdNumero3 = 0;

        for (int i = 1; i <= contador; i++){
            System.out.printf("Digite o %dº numero: %n", i);
            int numero = sc.nextInt();

            if (numero >= 0 && numero <= 100) {
                qtdNumero1++;
            } else if (numero > 100 && numero <= 200) {
                qtdNumero2++;
            } else if (numero > 200) {
                qtdNumero3++;
            }

        }

        System.out.printf("Entre os %d números digitados: %n", contador );
        System.out.printf("%d estão entre 0 e 100, %n", qtdNumero1);
        System.out.printf("%d estão entre 101 e 200 %n", qtdNumero2);
        System.out.printf("e %d são maiores do que 200", qtdNumero3);
    }
}
