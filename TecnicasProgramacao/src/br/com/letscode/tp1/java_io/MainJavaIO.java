package br.com.letscode.tp1.java_io;

import br.com.letscode.tp1.java_io.entities.GerenciadorDeArquivoJavaIO;
import br.com.letscode.tp1.java_io.interfaces.IGerenciadorDeArquivo;

import java.util.List;

public class MainJavaIO {
    public static void main(String[] args) {
        IGerenciadorDeArquivo gerenciadorDeArquivo = new GerenciadorDeArquivoJavaIO();
        gerenciadorDeArquivo.criaArquivo("arquivo-em-branco.txt");
        gerenciadorDeArquivo.apagaArquivo("arquivo-em-branco.txt");

        gerenciadorDeArquivo.criaDiretorio("diretorio2/subdiretorio");
        gerenciadorDeArquivo.apagaDiretorio("diretorio2");

        List<String> linhas = gerenciadorDeArquivo.leLinhas("arquivo.txt");
        gerenciadorDeArquivo.escreveLinhas("arquivo-novo.txt", linhas);
    }
}
