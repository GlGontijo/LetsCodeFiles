package br.com.letscode.tp1.java_io.entities;

import br.com.letscode.tp1.java_io.interfaces.IGerenciadorDeArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GerenciadorDeArquivoJavaNio2 implements IGerenciadorDeArquivo {
    @Override
    public void apagaArquivo(String caminhoArquivo) {
        Path arquivo = Path.of(caminhoArquivo);
        try {
            Files.deleteIfExists(arquivo);
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    @Override
    public void apagaDiretorio(String caminhoDiretorio) {
        Path diretorio = Path.of(caminhoDiretorio);
        try {
            Files.deleteIfExists(diretorio);
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    @Override
    public void criaArquivo(String caminhoArquivo) {
        Path arquivo = Path.of(caminhoArquivo);
        try {
            Files.createFile(arquivo);
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    @Override
    public void criaDiretorio(String caminhoDiretorio) {
        Path diretorio = Path.of(caminhoDiretorio);
        try {
            Files.createDirectories(diretorio);
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }
    }

    @Override
    public List<String> leLinhas(String caminhoArquivo) {
        Path arquivo = Paths.get(caminhoArquivo);
        try {
            return Files.readAllLines(arquivo);
        } catch (IOException ioException) {
            return null;
        }
    }

    @Override
    public void escreveLinhas(String caminhoArquivo, List<String> conteudoArquivo) {

    }
}
