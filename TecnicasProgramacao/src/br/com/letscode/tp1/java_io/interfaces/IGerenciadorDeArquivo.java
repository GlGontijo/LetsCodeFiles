package br.com.letscode.tp1.java_io.interfaces;

import java.util.List;

public interface IGerenciadorDeArquivo {

    void apagaArquivo(String caminhoArquivo);

    void apagaDiretorio(String caminhoDiretorio);

    void criaArquivo(String caminhoArquivo);

    void criaDiretorio(String caminhoDiretorio);

    List<String> leLinhas(String caminhoArquivo);

    void escreveLinhas(String caminhoArquivo, List<String> conteudoArquivo);
}
