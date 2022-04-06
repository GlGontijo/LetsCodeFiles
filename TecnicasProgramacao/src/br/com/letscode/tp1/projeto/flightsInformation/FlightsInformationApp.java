package br.com.letscode.tp1.projeto.flightsInformation;

import br.com.letscode.tp1.projeto.flightsInformation.entities.FilesManagerJavaNio2;
import br.com.letscode.tp1.projeto.flightsInformation.entities.Fly;
import br.com.letscode.tp1.projeto.flightsInformation.interfaces.IFilesManager;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class FlightsInformationApp {
    static IFilesManager filesManager = new FilesManagerJavaNio2();

    public static void main(String[] args) {
        String dirIN = "./files/in";
        String dirOUT = "./files/out";
        String fileCSVPathIN = dirIN + "/flights.csv";
        String fligthsWithDurationPath = dirOUT + "/fligthsWithDuration.csv";

        // Cria os diretórios, caso não existam
        if (!new File(dirIN).isDirectory()){
            filesManager.mkDir(dirIN);
        }
        if (!new File(dirOUT).isDirectory()){
            filesManager.mkDir(dirOUT);
        }

        List<Fly> fligthsInformation = new ArrayList<>();
        for (String[] flightLine : readFlyFile(fileCSVPathIN)) {
            fligthsInformation.add(new Fly(
                    flightLine[0], // origin
                    flightLine[1], // destination
                    flightLine[2], // airline
                    flightLine[3], // departure
                    flightLine[4], // arrival
                    flightLine[5]) // price
            );
        }

        // Gera o arquivo "flights.csv" acrescido da coluna "duration"
        writeFligthsWhithDuration(fligthsInformation, fligthsWithDurationPath);
    }

    public static List<String[]> readFlyFile(String fileCSVPathIN){
        List<String> fileLines;

        if (!new File(fileCSVPathIN).exists()) {
            // Solicita o arquivo csv com os dados
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o caminho completo do arquivo csv:");
            // Converte '\' para '/'
            fileLines = filesManager.readLines(scanner.next().replace('\\', '/'));
            filesManager.writeLines(fileCSVPathIN,fileLines,false);
        } else {
            // leitura do arquivo
            fileLines = filesManager.readLines(fileCSVPathIN);
        }

        return fileLines.stream()
                .skip(1)
                .map(line -> line.split(";"))
                .collect(Collectors.toList());
    }

    public static void writeFligthsWhithDuration(List<Fly> fligthsInformation, String fligthsWithDurationPath){
        List<String> flightsInformationList = new ArrayList<>();
        // Cabeçalho do CSV
        flightsInformationList.add("origin;destination;airline;departure;arrival;price;duration");
        for (Fly fly : fligthsInformation) {
            flightsInformationList.add(Fly.getLineCSV(fly));
        }

        filesManager.writeLines(fligthsWithDurationPath,flightsInformationList,false);
    }
}
