import java.util.Scanner;

public class Exercicio_08 {
    // 8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadetotal = 0;
        int contador = 20;

        for (int x = 1; x <= contador; x++){
            System.out.printf("Digite a idade do %dº cliente: %n", x);
            int idade = sc.nextInt();
            if (idade >= 18){
                idadetotal = (idadetotal + idade);
            }
        }

        System.out.printf("A soma das idades dos clientes maiores de idade é: %d", idadetotal);

    }
}
