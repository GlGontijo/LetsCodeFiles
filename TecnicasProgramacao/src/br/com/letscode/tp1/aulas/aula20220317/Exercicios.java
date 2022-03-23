package br.com.letscode.tp1.aulas.aula20220317;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercicios {
    public static class Exercicio01 {
        public static void main(String[] args) {
            // 1. Qual sua idade em segundos até o presente momento.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe a data/hora do seu nascimento (formato: yyyy-mm-ddTHH:MM");
            LocalDateTime dateTimeNasc = LocalDateTime.parse(scanner.next());
            System.out.println();
            System.out.printf("Você tem %,3d segundos e contando...\n",
                    dateTimeNasc.until(LocalDateTime.now(), ChronoUnit.SECONDS));
            System.out.println();
        }
    }

    public static class Exercicio02 {
        public static void main(String[] args) {
            // 2. Qual a data/hora neste instante no fuso de "Portugal"
            System.out.println("Em Portugal são: " + ZonedDateTime.now(ZoneId.of("Portugal")));
        }
    }

    public static class Exercicio03 {
        public static void main(String[] args) {
            // 3. Qual a data/hora neste instante no fuso -02:00
            System.out.println("Em GMT-02:00 são: " + OffsetDateTime.now(ZoneOffset.of("-02:00")));
        }
    }

    public static class Exercicio04 {
        public static void main(String[] args) {
            // 4. Formatar uma data no seguinte padrão: "19:00:00, 17 de março de 2022 (fuso: -03:00)"
            OffsetDateTime offsetDateTime = OffsetDateTime.of(2022, 3, 17, 19, 0, 0, 0, ZoneOffset.of("-3"));
            System.out.println(offsetDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss', 'd 'de 'LLLL 'de 'yyyy '(fuso: 'xxx')'")));
        }
    }
}
