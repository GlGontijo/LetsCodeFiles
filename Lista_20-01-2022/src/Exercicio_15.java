import java.util.Scanner;

public class Exercicio_15 {
    // 15) Escreva um algoritmo que leia uma sequência de números do usuário e realize a
    // soma desses números. Encerre a execução quando um número negativo for digitado.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite um número positivo:");
        int numero = sc.nextInt();

        do {
            soma = soma + numero;
            System.out.printf("A soma até agora dos valores digitados é: %d%n", soma);
            System.out.println("Digite outro número positivo:");
            numero = sc.nextInt();
        } while (numero >= 0);

        System.out.printf("O número %d digitado é um número negativo. \n" +
                "A soma final dos valores positivos é igual a: %d", numero, soma);
    }
}
