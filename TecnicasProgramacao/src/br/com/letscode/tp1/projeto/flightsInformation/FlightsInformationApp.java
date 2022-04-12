package br.com.letscode.tp1.projeto.flightsInformation;

import br.com.letscode.tp1.projeto.flightsInformation.entities.FilesManagerJavaNio2;
import br.com.letscode.tp1.projeto.flightsInformation.entities.Fly;
import br.com.letscode.tp1.projeto.flightsInformation.interfaces.IFilesManager;

import java.io.File;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class FlightsInformationApp {
    static IFilesManager filesManager = new FilesManagerJavaNio2();

    public static void main(String[] args) {
        String dirIN = "files/in";
        String dirOUT = "files/out";
        String fileCSVPathIN = dirIN + "/flights.csv";
        String flightsWithDurationPath = dirOUT + "/flightsWithDuration.csv";
        String filteredFlightsPath = dirOUT + "/filteredFlights.csv";

        // Cria os diretórios, caso não existam
        if (!new File(dirIN).isDirectory()){
            filesManager.mkDir(dirIN);
        }
        if (!new File(dirOUT).isDirectory()){
            filesManager.mkDir(dirOUT);
        }

        List<Fly> flightsInformation = new ArrayList<>();
        for (String[] flightLine : readFlyFile(fileCSVPathIN)) {
            flightsInformation.add(new Fly(
                    flightLine[0], // origin
                    flightLine[1], // destination
                    flightLine[2], // airline
                    flightLine[3], // departure
                    flightLine[4], // arrival
                    flightLine[5]) // price
            );
        }

        // Gera o arquivo "flights.csv" acrescido da coluna "duration"
        writeFlightsWhithDuration(flightsInformation, flightsWithDurationPath);

        // Gera o arquivo filteredFlights
        writeFilteredFlights(flightsInformation,filteredFlightsPath);
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

    public static void writeFlightsWhithDuration(List<Fly> flightsInformation, String flightsWithDurationPath){
        List<String> flightsInformationList = new ArrayList<>();
        // Cabeçalho do CSV
        flightsInformationList.add("origin;destination;airline;departure;arrival;price;duration");
        for (Fly fly : flightsInformation.stream()
                // ordenando
                .sorted(Comparator.comparing(Fly::getOrigin)
                        .thenComparing(Fly::getDestination)
                        .thenComparing(Fly::getDuration)
                        .thenComparing(Fly::getPrice)
                        .thenComparing(Fly::getAirline))
                .collect(Collectors.toList())){
            flightsInformationList.add(fly.getLineCSV());
        }

        filesManager.writeLines(flightsWithDurationPath,flightsInformationList,false);
    }

    public static void writeFilteredFlights(List<Fly> flightsInformation, String filteredFlightsPath){
        Set<String> filteredFlightsSet = new LinkedHashSet<>();
        // Cabeçalho do CSV
        filteredFlightsSet.add("origin;destination;shortest_flight(h);longest_fight(h);cheapest_flight;" +
                "most_expensive_flight;average_time;average_price");
        for (Fly fly : flightsInformation.stream()
                .sorted(Comparator.comparing(Fly::getOrigin)
                        .thenComparing(Fly::getDestination))
                .collect(Collectors.toList())){
            List<Fly> flyList = flightsInformation.parallelStream()
                    .filter(o -> o.getOrigin().equals(fly.getOrigin()))
                    .filter(d -> d.getDestination().equals(fly.getDestination()))
                    .collect(Collectors.toList());
            filteredFlightsSet.add(
                    fly.getOrigin() + ";" + fly.getDestination() + ";"
                            // shortest_flight
                            + flyList
                            .stream()
                            .map(Fly::getDuration)
                            .min(Comparator.naturalOrder()).get() + ";"
                            // longest_fight
                            + flyList
                            .stream()
                            .map(Fly::getDuration)
                            .max(Comparator.naturalOrder()).get() + ";"
                            // cheapest_flight
                            + flyList
                            .stream()
                            .map(Fly::getPrice)
                            .min(Comparator.naturalOrder()).get() + ";"
                            // most_expensive_flight
                            + flyList
                            .stream()
                            .map(Fly::getPrice)
                            .max(Comparator.naturalOrder()).get() + ";"
                            // average_time
                            + flyList
                            .stream()
                            .map(Fly::getDuration)
                            .collect(Collectors.averagingLong(Long::longValue)) + ";"
                            // average_price
                            + flyList
                            .stream()
                            .map(Fly::getPrice)
                            .collect(Collectors.averagingLong(BigDecimal::longValue))
            );
        }

        filesManager.writeLines(
                filteredFlightsPath,
                filteredFlightsSet.stream().collect(Collectors.toList()),
                false);
    }
}
