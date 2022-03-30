package br.com.letscode.tp1.projeto.flightsInformation;

import br.com.letscode.tp1.projeto.flightsInformation.entities.Fly;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightsInformationApp {
    public static void main(String[] args) {
        List<String> fileLine = new LinkedList<>();
        List<Fly> fligthsInformation = new LinkedList<>();

        // usar Array de String pra representar o arquivo
        fileLine.add("origin;destination;airline;departure;arrival;price"); // cabeçalho
        fileLine.add("MEL-Austrália;GRU-Brasil;Gol Airlines;21/04/2022 06:00:00 (+01:00);22/04/2022 02:00:00 (+04:00);3758.00");
        fileLine.add("KIN-Jamaica;PEK-China;Lufthansa;10/04/2022 12:00:00 (+10:00);10/04/2022 04:00:00 (-02:00);4842.00");

        List<String[]> flightsStr = fileLine.stream()
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
            fligthsInformation.add(line);
        }

        System.out.println(fligthsInformation);
    }
}
