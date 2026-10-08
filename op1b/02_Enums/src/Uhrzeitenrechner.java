import java.util.Arrays;

public class Uhrzeitenrechner {
    public static void main(String... args){
        Uhrzeit aktuell = Uhrzeit.ZEHN;
        Uhrzeit beginnUnterricht = Uhrzeit.ACHT;

        System.out.println(aktuell + " : " + aktuell.getUhrzeit());
        System.out.println(beginnUnterricht + " : " + beginnUnterricht.getUhrzeit());

        int differenz = aktuell.getZahlenwert() - beginnUnterricht.getZahlenwert();
        System.out.println("Wir arbeiten schon... " + differenz + " Stunden...");

        System.out.println(aktuell.ordinal());
        System.out.println(aktuell.getZahlenwert());

        System.out.println(Arrays.toString(Uhrzeit.values()));

        System.out.println(Uhrzeit.istUhrzeit(8));

        System.out.println(Uhrzeit.istUhrzeit("zehn"));
    }
}
