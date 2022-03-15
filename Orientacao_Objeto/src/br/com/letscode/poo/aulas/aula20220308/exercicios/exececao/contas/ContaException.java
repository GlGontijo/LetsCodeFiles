package br.com.letscode.poo.aulas.aula20220308.exercicios.exececao.contas;

public class ContaException extends Exception {
    // Construtor padrão da classe.
    public ContaException (String _mensagem) {
        // Deve chamar o construtor da superclasse.
        super(_mensagem);
    }
}