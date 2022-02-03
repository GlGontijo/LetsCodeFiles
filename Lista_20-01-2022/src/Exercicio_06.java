import java.util.Scanner;

public class Exercicio_06 {
    // 6) Leia a idade de 20 pessoas e exiba a soma das idades.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadetotal = 0;

        for (int x = 1; x <= 20; x++){
            System.out.printf("Digite a idade do %dº cliente: %n", x);
            int idade = sc.nextInt();
            idadetotal = (idadetotal + idade);
        }

        System.out.println("O somatório das idades dos clientes é: " + idadetotal);
    }
}
