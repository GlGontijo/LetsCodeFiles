package br.com.letscode.poo.aulas.aula20220308.exercicios;

import br.com.letscode.poo.entity.Calculadora;
import br.com.letscode.poo.entity.Senhas;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        Senhas senha = new Senhas();
        Calculadora calculadora = new Calculadora();
        boolean hasContinua = true;

        // Cadastra a senha
        while (hasContinua) {
            System.out.println("Cadastre uma senha:");
            String senhaNova = scanner.next();
            System.out.println("Confirme a senha:");
            String senhaConfirma = scanner.next();

            if (senhaNova.equals(senhaConfirma)) {
                System.out.println("Senha cadastrada com sucesso!");
                senha.setSenhaSHA2hex(senhaNova);
                hasContinua = false;
                System.out.println();
            } else {
                System.out.println("As senhas digitadas não são iguais.\n" +
                        "Repita o processo!\n");
            }
        }

        hasContinua = true;
        while (hasContinua){
            // Teste de senha
            System.out.println("Digite um número:");
            float dividendo = scanner.nextFloat(); scanner.nextLine();
            System.out.println("Digite outro número (diferente de zero):");
            float divisor = scanner.nextFloat(); scanner.nextLine();
            try {
                calculadora.setResultado(dividendo);
                float resultado = calculadora.divide(divisor);
                System.out.println("Digite sua senha:");
                if (senha.isSenha(scanner.next())) {
                    System.out.println("Senha validada com sucesso!");
                    System.out.printf("O resultado da divisão é: %.2f",resultado);
                    hasContinua = false;
                } else {
                    System.out.println("Senha incorreta! Processo não autorizado.");
                }
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }
}
