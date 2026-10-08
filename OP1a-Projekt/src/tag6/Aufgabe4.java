package tag6;
import java.time.*;// möglich, aber nicht verbreitet " alles aus dem package"
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

/*Umfangreich und schwer, wird nicht im Unterricht behandelt:

Einen Jahreskalender, hierbei jeden Monat auf 6 Zeilen mit jeweils den 7 Wochentagen ausgeben,
so dass einige Tage davor und danach noch dabei sind.
Eigene Datenstrukturen oder java.time.LocalDate verwenden.

Erweiterungsmöglichkeit: Auch die Kalenderwoche am Anfang der Zeilen mit ausgeben
(KW 1 bis KW 52)

Als Anregung vorhandene Kalender wie den Google calendar anschauen.*/
public class Aufgabe4 {
    static void main(String[] args) {
        LocalDate date1  = LocalDate.now();
        System.out.println("date1 = " + date1);

        LocalDate date2 = date1.plusDays(10);
        System.out.println("date2 = " + date2);

        int jahr = date1. getYear();
        System.out.println("jahr = " + jahr);

        System.out.println(LocalDateTime.now());

        LocalTime time = LocalTime.of(17,0);
        System.out.println("time = " + time);
        System.out.println(time.minusMinutes(13));
    }
}
