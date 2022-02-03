import java.util.Scanner;

public class Exercicio_04 {
    // 4) Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo:");
        String nome = sc.nextLine();
        System.out.println("Informe o número de repetições:");

        int repetir = sc.nextInt();

        for (int i = 1; i <= repetir; i++){
            System.out.printf("Seu nome é: %s - %d \n", nome, i);
        }
    }
}
