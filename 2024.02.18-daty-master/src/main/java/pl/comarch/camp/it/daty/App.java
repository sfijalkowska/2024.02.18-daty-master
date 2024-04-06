package pl.comarch.camp.it.daty;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime myLocalTime = LocalTime.of(15, 35, 50);
        System.out.println(myLocalTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate myLocalDate = LocalDate.of(2023, Month.JANUARY, 20);
        LocalDate myLocalDate2 = LocalDate.of(2023, 1, 20);

        System.out.println(myLocalDate);
        System.out.println(myLocalDate2);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime myLocalDateTime =
                LocalDateTime.of(2024,7,14,15,33,50);
        System.out.println(myLocalDateTime);
        LocalDateTime myLocalDateTime2 = LocalDateTime.of(
                LocalDate.of(2020,10,15),
                LocalTime.of(15,30,50)
        );

        System.out.println(myLocalDateTime2);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime myZonedDateTime = ZonedDateTime.of(
                LocalDate.of(2012, 12,15),
                LocalTime.of(14,44,58),
                ZoneId.of("America/Phoenix")
        );

        System.out.println(myZonedDateTime);

        System.out.println(Long.MAX_VALUE);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(
                LocalDate.of(2300, 10,16),
                LocalTime.of(14,40,50),
                ZoneId.of("Europe/Warsaw")
        );

        System.out.println(zonedDateTime2);

        Instant instant1 = zonedDateTime2.toInstant();
        System.out.println(instant1);
        Instant instant2 = Instant.now();
        System.out.println(instant2);

        Duration duration = Duration.between(instant1, instant2);
        System.out.println(duration);
        System.out.println(duration.toSeconds());

        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2 = localDateTime1.minusDays(44);
        System.out.println(localDateTime2);


        String data = "07-07-2022 15:34:55";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime parsedLocalDateTime = LocalDateTime.parse(data, formatter);

        System.out.println(parsedLocalDateTime);

        String data2 = "12/10-2020 15/23:20";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd-yyyy HH/mm:ss");
        LocalDateTime localDateTime3 = LocalDateTime.parse(data2, formatter2);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = LocalDateTime.now();
        System.out.println(localDateTime4.format(formatter2));

    }
}
