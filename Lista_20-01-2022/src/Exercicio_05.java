import java.util.Scanner;

public class Exercicio_05 {
    // 5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 números aleatórios:");

        double soma = 0;

        for (int x = 0; x < 10; x++){
            double numero = sc.nextDouble();
            soma = (soma + numero);
            System.out.println(soma);
        }

        System.out.printf("O somatório dos números digitados é: %.2f ", soma);
    }
}
