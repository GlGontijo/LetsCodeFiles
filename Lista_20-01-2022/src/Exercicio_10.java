import java.util.Scanner;

public class Exercicio_10 {
    // 10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de multiplicação.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número para o qual deseja a taboada de multiplicação:");
        int numero = sc.nextInt();

        System.out.printf("Taboada do %d: %n", numero);

        for (int x = 0; x < 10; x++){
            int y = (numero * x);
            System.out.println(numero + " * " + x + " = " + y);
        }
    }
}
