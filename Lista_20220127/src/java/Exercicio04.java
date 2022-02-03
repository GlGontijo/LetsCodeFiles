package java;

import java.util.Scanner;

public class Exercicio04 {
    // 4. Faça um Programa que leia um  vetor de 10  caracteres, e diga quantas  consoantes foram lidas. Imprima as consoantes.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] consoantes;
        consoantes = new char[10];
        char caracter;
        int qtdConsoantes = 0;

        for (int i = 0; i < consoantes.length; i++){
            System.out.printf("Digite a %dª letra: %n",1+i);
            caracter = sc.next().charAt(0);
            while ((caracter < 65) || (caracter > 90 && caracter < 97 )|| (caracter > 122)){
                System.out.println("#ERRO# O caractere deve ser uma letra. Tente novamente.");
                System.out.printf("Digite a %dª letra: %n",1+i);
                caracter = sc.next().charAt(0);
            }
            switch (caracter){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        consoantes[i] = 0;
                        break;
                    default:
                        consoantes[i] = caracter;
                        qtdConsoantes++;
            }
        }

        System.out.printf("A quantidade de Consoantes digitadas foi: %d%n",qtdConsoantes);

        for (char consoante : consoantes){
            if (consoante != 0){
                System.out.printf("%s ",consoante);
            }
        }
    }
}
