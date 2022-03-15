package br.com.letscode.poo.aulas.aula20220308.exercicios;

import br.com.letscode.poo.entity.Cliente;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> cadastros = new ArrayList<>();
        boolean hasContinue;
        boolean hasCadastro = true;
        int erroCPF = 0;
        String cpf;

        while (hasCadastro) {
            System.out.println();
            System.out.println("" +
                    "########################\n" +
                    "# Cadastro de Clientes #\n" +
                    "########################");
            System.out.println();
            System.out.printf("Total de cadastros no sistema: %d\n",cadastros.size());
            System.out.println();

            //Menu:
            System.out.println("Escolha a operação:\n" +
                    " 1 - Cadastrar um Cliente \n" +
                    " 2 - Alterar um Cliente \n" +
                    " 3 - Listar Clientes Cadastrados \n" +
                    " 4 - Remover um Cliente \n" +
                    " 0 - Encerrar e Sair");
            switch (sc.nextInt()){
                case 1 :
                    sc.nextLine();
                    hasContinue = true;
                    while (hasContinue) {
                        System.out.println("Cadastre o Cliente:");
                        System.out.print("CPF (somente números): ");
                        cpf = sc.nextLine();
                        try {
                            if (Cliente.isCPF(cpf)) {
                                System.out.print("Nome: ");
                                String nome = sc.nextLine().toUpperCase();
                                System.out.print("Endereço: ");
                                String endereco = sc.nextLine().toUpperCase();
                                System.out.print("Telefone: ");
                                String telefone = sc.nextLine();
                                System.out.print("Renda Mensal: ");
                                BigDecimal rendaMensal = sc.nextBigDecimal();
                                sc.nextLine();
                                // Realiza o cadastro com os dados informados
                                cadastros.add(new Cliente(nome, endereco, telefone, cpf, rendaMensal));
                                System.out.println("Cadastro realizado com sucesso.");
                                erroCPF = 0;
                                hasContinue = false;
                            }
                        } catch (Exception e) {
                            erroCPF++;
                            System.out.println(e.getMessage());
                            System.out.println("Tentativa "+erroCPF+" de 3.");
                        } finally {
                            if (erroCPF == 3){
                                System.out.println("Cadastro cancelado por limite de erros.");
                                hasContinue = false;
                            }
                        }
                    }
                    break;
                case 2 :
                    sc.nextLine();
                    hasContinue = true;
                    System.out.println("Alterar Clientes");
                    System.out.print("CPF (somente números): ");
                    cpf = sc.nextLine();
                    try {
                        if (Cliente.isCPF(cpf)) {
                            for (int i=0; i < cadastros.size(); i++){
                                Cliente alteraCliente = cadastros.get(i);
                                if (alteraCliente.hasCPF(cpf)){
                                    System.out.println("Cliente encontrado:");
                                    System.out.println(alteraCliente);
                                    System.out.println("Alterar o cadastro? S/N ");
                                    if (sc.next().equalsIgnoreCase("S")){
                                        while (hasContinue){
                                            System.out.println("Selecione o que deseja alterar:\n" +
                                                    " 1 - Nome\n" +
                                                    " 2 - Endereço\n" +
                                                    " 3 - Telefone\n" +
                                                    " 4 - CPF\n" +
                                                    " 5 - Renda Mensal\n" +
                                                    " 0 - Salvar / Sair");
                                            switch (sc.nextInt()){
                                                case 1 :
                                                    sc.nextLine();
                                                    System.out.print("Novo Nome: ");
                                                    alteraCliente.setNome(sc.nextLine().toUpperCase());
                                                    break;
                                                case 2 :
                                                    sc.nextLine();
                                                    System.out.print("Novo Endereço: ");
                                                    alteraCliente.setEndereco(sc.nextLine().toUpperCase());
                                                    break;
                                                case 3 :
                                                    sc.nextLine();
                                                    System.out.print("Novo Telefone: ");
                                                    alteraCliente.setTelefone(sc.nextLine());
                                                    break;
                                                case 4 :
                                                    sc.nextLine();
                                                    System.out.print("Novo CPF (somente números): ");
                                                    cpf = sc.nextLine();
                                                    try {
                                                        if (Cliente.isCPF(cpf)) {
                                                            alteraCliente.setCpf(cpf);
                                                        }
                                                    } catch (Exception e){
                                                        System.out.println(e.getMessage());
                                                    }
                                                    break;
                                                case 5 :
                                                    sc.nextLine();
                                                    System.out.print("Nova Renda Mensal: ");
                                                    alteraCliente.setRendaMensal(sc.nextBigDecimal());
                                                    break;
                                                case 0 :
                                                    sc.nextLine();
                                                    System.out.println("Salvar alterações? S/N");
                                                    if (sc.next().equalsIgnoreCase("N")) {
                                                        hasContinue = false;
                                                        System.out.println("Alterações excluídas");
                                                    } else {
                                                        cadastros.set(i, alteraCliente);
                                                        System.out.println("Alteração Finalizada");
                                                        hasContinue = false;
                                                    }
                                                    break;
                                                default :
                                                    sc.nextLine();
                                                    System.out.println("Opção inválida!");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("Não foram encontrados mais cadastros com o CPF: "+cpf);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3 :
                    sc.nextLine();
                    System.out.println("Lista de Clientes Cadastrados:");
                    for (int i=0; i < cadastros.size(); i++){
                        Cliente listaCliente = cadastros.get(i);
                        System.out.println((i+1)+" - "+listaCliente);
                    }
                    break;
                case 4 :
                    sc.nextLine();
                    System.out.println("Remover Clientes");
                    System.out.println("Informe o CPF do cliente:");
                    System.out.print("CPF (somente números): ");
                    cpf = sc.nextLine();
                    try {
                        if (Cliente.isCPF(cpf)) {
                            for (int i=0; i < cadastros.size(); i++){
                                Cliente removeCliente = cadastros.get(i);
                                if (removeCliente.hasCPF(cpf)){
                                    System.out.println("Cliente encontrado:");
                                    System.out.println(removeCliente);
                                    System.out.println("Remover o cadastro? S/N ");
                                    if (sc.next().equalsIgnoreCase("S")){
                                        cadastros.remove(i);
                                        System.out.println("Cadastro Removido com sucesso");
                                    }
                                }
                            }
                            System.out.println("Não foram encontrados mais cadastros com o CPF: "+cpf);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0 :
                    sc.nextLine();
                    System.out.println("Confirma a saída do sistema? S/N");
                    if (sc.next().equalsIgnoreCase("S")){
                        System.out.println("Encerrando o sistema de cadastros");
                        hasCadastro = false;
                    }
                    break;
                default :
                    sc.nextLine();
                    System.out.println("Opção inválida!");
            }
        }
    }
}
