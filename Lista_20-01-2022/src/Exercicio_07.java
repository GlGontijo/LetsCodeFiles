import java.util.Scanner;

public class Exercicio_07 {
    // 7) Leia a idade de 20 pessoas e exiba a média das idades.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadetotal = 0;
        int contador = 20;

        for (int x = 1; x <= contador; x++){
            System.out.printf("Digite a idade do %dº cliente: %n", x);
            int idade = sc.nextInt();
            idadetotal = (idadetotal + idade);
        }

        double media = (idadetotal / contador);

        System.out.printf("A média das idades dos clientes é: %.0f", media);
    }
}
