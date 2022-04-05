package br.com.letscode.tp1.java_io;

import br.com.letscode.tp1.java_io.entities.GerenciadorDeArquivoJavaNio2;
import br.com.letscode.tp1.java_io.interfaces.IGerenciadorDeArquivo;

import java.util.List;

public class MainJavaNio2 {
    public static void main(String[] args) {
        IGerenciadorDeArquivo gerenciadorDeArquivo = new GerenciadorDeArquivoJavaNio2();
        gerenciadorDeArquivo.criaArquivo("arquivo-em-branco.txt");
        gerenciadorDeArquivo.apagaArquivo("arquivo-em-branco.txt");

        gerenciadorDeArquivo.criaDiretorio("diretorio2/subdiretorio");
        gerenciadorDeArquivo.apagaDiretorio("diretorio2");

        List<String> linhas = gerenciadorDeArquivo.leLinhas("arquivo.txt");
        gerenciadorDeArquivo.escreveLinhas("arquivo-novo.txt", linhas);
    }
}
