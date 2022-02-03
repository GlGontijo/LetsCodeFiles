import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double x = sc.nextDouble();

        System.out.println("Informe o segundo número: ");
        double y = sc.nextDouble();

        int codOperacao = 0;
        while (codOperacao == 0 || codOperacao > 4){
            System.out.println("Selecione a operação:" +
                    "\nDigite 1 para soma " +
                    "\nDigite 2 para subtração " +
                    "\nDigite 3 para multiplicação " +
                    "\nDigite 4 para divisão");
            codOperacao = sc.nextInt();
            if (codOperacao == 0 || codOperacao > 4){
                System.out.println("Valor inválido! Escolha uma das opções listadas.");
            }
        }

        String tipo = "";
        double resultado = 0;
        if (codOperacao == 1){
            tipo = "Soma";
            resultado = Calculadora.soma(x, y);
        } else if (codOperacao == 2){
            tipo = "Subtração";
            resultado = Calculadora.diminui(x, y);
        } else if (codOperacao == 3){
            tipo = "Multiplicação";
            resultado = Calculadora.multiplica(x, y);
        } else if (codOperacao == 4){
            tipo = "Divisão";
            resultado = Calculadora.divide(x, y);
        }

        System.out.printf("O resultado da %s é %f", tipo, resultado);


    }

}
