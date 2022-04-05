package br.com.letscode.tp1.projeto.flightsInformation;

import br.com.letscode.tp1.projeto.flightsInformation.entities.FilesManagerJavaIO;
import br.com.letscode.tp1.projeto.flightsInformation.entities.Fly;
import br.com.letscode.tp1.projeto.flightsInformation.interfaces.IFilesManager;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class FlightsInformationApp {
    static IFilesManager filesManager = new FilesManagerJavaIO();

    public static void main(String[] args) {
        List<String[]> fligthsInformation = new LinkedList<>();
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

        for (String[] flightLine : readFlyFile(fileCSVPathIN)) {
            Fly line = new Fly(
                    flightLine[0],
                    flightLine[1],
                    flightLine[2],
                    flightLine[3],
                    flightLine[4],
                    flightLine[5]);

            fligthsInformation.add(new String[]{
                    line.getOrigin(),
                    line.getDestination(),
                    line.getAirline(),
                    String.valueOf(line.getDeparture()),
                    String.valueOf(line.getArrival()),
                    String.valueOf(line.getPrice()),
                    String.valueOf(line.getDuration())});
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
        }
        // leitura do arquivo
        fileLines = filesManager.readLines(fileCSVPathIN);

        return fileLines.stream()
                .skip(1)
                .map(line -> line.split(";"))
                .collect(Collectors.toList());
    }

    public static void writeFligthsWhithDuration(List<String[]> fligthsInformation, String fligthsWithDurationPath){
        List<String> flightsInformationList = new ArrayList<>();
        // Cabeçalho do CSV
        flightsInformationList.add("origin;destination;airline;departure;arrival;price;duration");
        for (String[] strings : new ArrayList<>(fligthsInformation)) {
            flightsInformationList.add(String.join(";", strings));
        }

        filesManager.writeLines(fligthsWithDurationPath,flightsInformationList,false);
    }
}
