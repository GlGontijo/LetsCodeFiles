import java.util.Scanner;

public class Exercicio_03 {
    // 3) Leia o nome do usuário e escreva o nome dele na tela 10 vezes.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo:");
        String nome = sc.nextLine();

        for (int i = 1; i <= 10; i++){
            System.out.printf("Seu nome é: %s - %d \n", nome, i);
        }
    }
}
