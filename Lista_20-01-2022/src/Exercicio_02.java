public class Exercicio_02 {
    // 2) Escreva um algoritmo que calcule a soma dos números de 1 a 15.

    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        int repeticao = 15;

        while (x <= repeticao){
            y = (y + ++x);
        }

        System.out.println("O valor de " + repeticao + "! = " + y);
    }
}
