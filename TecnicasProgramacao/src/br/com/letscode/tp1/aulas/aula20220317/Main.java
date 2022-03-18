package br.com.letscode.tp1.aulas.aula20220317;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        /* API java.time */

        // LocalDate
        System.out.println("Localdate.now: "+ LocalDate.now()); // data corrente
        System.out.println("Localdate.of: "+ LocalDate.of(2022,3,1)); // data especifica

        // LocalTime
        System.out.println("LocalTime.now: "+ LocalTime.now()); // hora corrente
        System.out.println("LocalTime.of: "+ LocalTime.of(20,30,15)); // hora especifica

        // LocalDateTime
        System.out.println("LocalDateTime.now: "+ LocalDateTime.now()); // data e hora corrente
        System.out.println("LocalDateTime.of: "+ LocalDateTime.of(2022,2,11,20,30,15)); // data e hora especifica

        // ZonedDateTime
        System.out.println("ZonedDateTime.now: "+ ZonedDateTime.now());
        System.out.println("ZonedDateTime.of: "+ ZonedDateTime.of(2022,3,1,22,22,22,0, ZoneId.of("America/Sao_Paulo")));

        // OffsetDateTime
        System.out.println("OffsetDateTime.now: "+ OffsetDateTime.now());
        System.out.println("OffsetDateTime.of: "+ OffsetDateTime.of(2022,3,1,22,22,22,0, ZoneOffset.of("-3")));

        /* Conversões */

        // LocalDateTime
        System.out.println("LocalDateTime to LocalDate: " + LocalDateTime.now().toLocalDate());
        System.out.println("LocalDateTime to LocalTime: " + LocalDateTime.now().toLocalTime());
        // ZonedDateTime
        System.out.println("ZonedDateTime to LocalDate: " + ZonedDateTime.now().toLocalDate());
        System.out.println("ZonedDateTime to LocalTime: " + ZonedDateTime.now().toLocalTime());
        System.out.println("ZonedDateTime to LocalDateTime: " + ZonedDateTime.now().toLocalDateTime());
        System.out.println("ZonedDateTime to OffsetDateTime: " + ZonedDateTime.now().toOffsetDateTime());
        System.out.println("ZonedDateTime to ZoneId: " + ZonedDateTime.now().getZone());
        System.out.println("OffsetDateTime to ZonedDateTime: " + OffsetDateTime.now().toZonedDateTime());

        /* Operações com API java.time */

        // Plus/Minus(Days, Hours...)
        System.out.println("Plus10Days: " + LocalDate.now().plusDays(10));
        System.out.println("Minus10Days: " + LocalDate.now().minusDays(10));
        // CronoUnit: Enum utilizado como unidade de tempo (DAYS, HOURS, YEARS, CENTURIES...)
        System.out.println("Plus10Hours: " + LocalTime.now().plus(10,ChronoUnit.HOURS));
        System.out.println("Minus10Hours: " + LocalTime.now().minus(10,ChronoUnit.HOURS));

        // get(Year, Month, Day, Hour..)
        System.out.println("getYear: " + LocalDate.now().getYear());
        System.out.println("getMonth: " + LocalDate.now().getMonth());
        System.out.println("getDayOfMonth: " + LocalDate.now().getDayOfMonth());
        System.out.println("getDayOfWeek: " + LocalDate.now().getDayOfWeek());
        System.out.println("getHour: " + LocalTime.now().getHour());

        // Until (diferença entre medidas de tempo)
        System.out.println("Until dias: " + LocalDate.of(2022,3,1).until(LocalDate.now(),ChronoUnit.DAYS));
        System.out.println("Until horas: " + LocalTime.of(20,30,0).until(LocalTime.now(),ChronoUnit.HOURS));

    }
}
