package br.com.letscode.tp1.projeto.flightsInformation.entities;


import br.com.letscode.tp1.projeto.flightsInformation.interfaces.IFilesManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FilesManagerJavaIO implements IFilesManager {

    @Override
    public void delFile(String pathFile) {
        File file = new File(pathFile);
        System.out.println("Removendo arquivo " + file + "...");
        try {
            if (file.delete()) {
                System.out.println("Arquivo " + file + " removido com sucesso!");
            } else {
                System.out.println("Não foi possível remover aquivo " + file);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void delDir(String dirPath) {
        File dir = new File(dirPath);
        System.out.println("Removendo diretorio " + dir + "...");
        try {
            if (dir.delete()) {
                System.out.println("Diretorio " + dir + " removido com sucesso!");
            } else {
                System.out.println("Tentando remoção recursiva do diretorio " + dir);
                for (File file : Objects.requireNonNull(dir.listFiles())) {
                    if (file.delete()) {
                        System.out.println("Removido " + file);
                    } else {
                        System.out.println("Não foi possível remover " + file);
                        break;
                    }
                }
                if (!dir.delete()) {
                    System.out.println("Não foi possível remover diretorio " + dir);
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void mkFile(String filePath) {
        File file = new File(filePath);
        System.out.println("Criando arquivo " + file);
        try {
            if(file.createNewFile()) {
                System.out.println("Arquivo " + file + " criado com sucesso!");
            } else {
                System.out.println("Não foi possível criar o arquivo " + file);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public void mkDir(String dirPath) {
        File dir = new File(dirPath);
        System.out.println("Criando diretorio " + dir);
        try {
            if (dir.mkdirs()) {
                System.out.println("diretorio " + dir + " criado com sucesso!");
            } else {
                System.out.println("Não foi possível criar o diretorio " + dir);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Override
    public List<String> readLines(String filePath) {
        try(
                FileReader fileReader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line = bufferedReader.readLine();
            List<String> linesList = new ArrayList<>();

            while(line != null) {
                linesList.add(line);
                line = bufferedReader.readLine();
            }
            return linesList;

        } catch(FileNotFoundException exception) {
            System.out.println("Arquivo nao existe");
            return null;
        } catch (IOException exception) {
            System.out.println("IOException");
            return null;
        }
    }

    @Override
    public void writeLines(String filePath, List<String> fileLine,boolean append) {
        try (
                FileWriter fileWriter = new FileWriter(filePath, append);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            for (String line : fileLine) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (FileNotFoundException exception) {
            System.out.println("Arquivo nao existe");
        } catch (IOException exception) {
            System.out.println("IOException");
        }
    }
}
