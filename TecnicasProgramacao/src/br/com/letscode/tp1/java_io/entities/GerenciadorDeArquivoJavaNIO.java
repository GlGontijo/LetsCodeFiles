package br.com.letscode.tp1.java_io.entities;

import br.com.letscode.tp1.java_io.interfaces.IGerenciadorDeArquivo;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class GerenciadorDeArquivoJavaNIO implements IGerenciadorDeArquivo {

    @Override
    public void apagaArquivo(String caminhoArquivo) {
        File arquivo = new File(caminhoArquivo);

        if (arquivo.delete()) {
            // sucesso
        } else {
            // falha
        }
    }

    @Override
    public void apagaDiretorio(String caminhoDiretorio) {
        File diretorio = new File(caminhoDiretorio);

        if (diretorio.delete()) {
            // sucesso
        } else {
//            System.out.printf("Falhou");
            for (File arquivoFilho : Objects.requireNonNull(diretorio.listFiles())) {
                arquivoFilho.delete();
            }

            diretorio.delete();
        }
    }

    @Override
    public void criaArquivo(String caminhoArquivo) {
        File arquivo = new File(caminhoArquivo);

        try {
            arquivo.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void criaDiretorio(String caminhoDiretorio) {
        File diretorio = new File(caminhoDiretorio);
//        diretorio.mkdir();
        diretorio.mkdirs();
    }

    @Override
    public List<String> leLinhas(String caminhoArquivo) {
        // Para ler qualquer categoria de arquivo:
        try(
            FileInputStream entrada = new FileInputStream(caminhoArquivo);
            FileChannel canalEntrada = entrada.getChannel()
        ) {

            ByteBuffer bytesLidos = ByteBuffer.allocate(10);

            int quantidadeDeBytesLidos = canalEntrada.read(bytesLidos);
            StringBuilder texto = new StringBuilder();

            while(quantidadeDeBytesLidos != -1) {
                texto.append((new String(bytesLidos.array())).substring(0, quantidadeDeBytesLidos));
                bytesLidos.clear(); // zerar o buffer
                quantidadeDeBytesLidos = canalEntrada.read(bytesLidos);
            }

            return Arrays.stream(texto.toString().split("\n")).collect(Collectors.toList());

        } catch(FileNotFoundException excecao) {
            System.out.println("Arquivo nao existe");
            return null;
        } catch (IOException excecao) {
            System.out.println("IOException");
            return null;
        }

    }

    @Override
    public void escreveLinhas(String caminhoArquivo, List<String> conteudoArquivo) {
        // Para escrever em qualquer categoria de arquivo:
        try (
            FileOutputStream saida = new FileOutputStream(caminhoArquivo);
            FileChannel canalSaida = saida.getChannel()
        ) {
            ByteBuffer bytesEscrita = ByteBuffer.allocate(100);
            for (String linha : conteudoArquivo) {
                bytesEscrita.put(linha.getBytes());
                bytesEscrita.put("\n".getBytes());

                bytesEscrita.flip(); // armazena o conteudo do buffer
                canalSaida.write(bytesEscrita); // escreve os dados
                bytesEscrita.clear(); // limpa o buffer
            }

        } catch(FileNotFoundException excecao) {
            System.out.println("Arquivo nao existe");
        } catch (IOException excecao) {
            System.out.println("IOException");
        }

    }
}
