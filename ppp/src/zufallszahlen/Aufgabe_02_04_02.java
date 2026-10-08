package zufallszahlen;
import java.util.Random;
public class Aufgabe_02_04_02 {
    public static void main(String[] args) {

        Random rand = new Random();

        int wurfA, wurfB, doppelteZaehler = 0;

        for (int i = 1; i <= 6000; i++) {
            wurfA = rand.nextInt(1, 7);
            //System.out.println("Erster wurf: " + wurfA);

            wurfB = rand.nextInt(1, 7);
            // System.out.println("Zweiter Wurf: "+ wurfB);

            if (wurfA == wurfB) {
                doppelteZaehler++;
            }
        }

        System.out.println("Anzahl der Durchläufe mit identischen wüfellergebnissen: " + doppelteZaehler);
    }
}