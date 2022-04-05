package br.com.letscode.tp1.projeto.flightsInformation;

import br.com.letscode.tp1.projeto.flightsInformation.entities.FilesManagerJavaIO;
import br.com.letscode.tp1.projeto.flightsInformation.entities.Fly;
import br.com.letscode.tp1.projeto.flightsInformation.interfaces.IFilesManager;

import java.io.File;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class FlightsInformationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fileLines = new LinkedList<>();
        List<String[]> fligthsInformation = new LinkedList<>();
        IFilesManager filesManager = new FilesManagerJavaIO();
        String dirIN = "./files/in";
        String dirOUT = "./files/out";

        // Cria os diretórios, caso não existam
        if (!new File(dirIN).isDirectory()){
            filesManager.mkDir(dirIN);
        }
        if (!new File(dirOUT).isDirectory()){
            filesManager.mkDir(dirOUT);
        }

//        // Solicita o arquivo .csv com os dados
//        System.out.println("Informe o caminho completo do arquivo csv:");
//        String fileCSVPathIN = scanner.next().replace('\\','/');

        // arquivo lido diretamente do repositorio
        String fileCSVPathIN = dirIN + "/flights.csv";

        // leitura do arquivo
        fileLines = filesManager.readLines(fileCSVPathIN);
        List<String[]> flightsStr = fileLines.stream()
                .skip(1)
                .map(line -> line.split(";"))
                .collect(Collectors.toList());
        for (String[] flightLine : flightsStr) {
            Fly line = new Fly(
                    flightLine[0],
                    flightLine[1],
                    flightLine[2],
                    flightLine[3],
                    flightLine[4],
                    flightLine[5]
                );
            fligthsInformation.add(new String[]{
                    flightLine[0],
                    flightLine[1],
                    flightLine[2],
                    flightLine[3],
                    flightLine[4],
                    flightLine[5],
                    String.valueOf(line.getDuration())}
            );
        }

        String fligthsWithDurationPath = dirOUT + "/fligthsWithDuration.csv";

        List<String> flightsInformationList = new ArrayList<>();
        // Cabeçalho do CSV
        flightsInformationList.add("origin;destination;airline;departure;arrival;price;duration");
        for (String[] strings : new ArrayList<>(fligthsInformation)) {
            flightsInformationList.add(String.join(";", strings));
        }

        filesManager.writeLines(fligthsWithDurationPath,flightsInformationList,false);
    }
}
