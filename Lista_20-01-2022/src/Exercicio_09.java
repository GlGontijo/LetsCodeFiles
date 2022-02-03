import java.util.Scanner;

public class Exercicio_09 {
    // 9) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 10;
        int[] idade;
        idade = new int[contador];
        String[] nome;
        nome = new String[contador];
        int menorIdade = 0;

        for (int x = 0; x < idade.length; x++){
            System.out.printf("Digite o nome do %dº Cliente: %n", x+1);
            nome[x] = sc.next();
            System.out.printf("Digite a idade do %dº Cliente: %n", x+1);
            idade[x] = sc.nextInt();
            if ((x == 0) || (idade[x] <= menorIdade)){
                menorIdade = idade[x];
            }
        }

        System.out.println("O(s) Cliente(s) de menor idade é(são):");

        for (int i = 0; i < contador ; i++) {
            if (idade[i] == menorIdade){
                System.out.println(nome[i]+ " com " +idade[i]+ " anos.");
            }
        }
    }
}
