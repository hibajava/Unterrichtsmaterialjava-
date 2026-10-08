/*

Der Kunde beschreibt Ihnen die gewünschte Funktionsweise des zu erstellenden Programmes,
 indem er Ihnen die folgenden Beispiele für die Konsolen-Ausgabe zur Verfügung stellt:

 */
package zufallszahlen;
import java.util.Random;
public class FPA_02_04_03 {
    public static void main(String[] args) {
        // Objekt der Random-Klasse
        Random rand = new Random();

        int zufallszahl1, zufallszahl2, unten = 1, oben = 100;

        System.out.printf(" Unterer Startwert: %d\nOberer Startwert: %d%n", unten, oben);
        System.out.println(" Es werden neue werte zwischen 1 und 100 ausgelost ");

        do {
            zufallszahl1 = rand.nextInt(unten, oben + 1);
            zufallszahl2 = rand.nextInt(unten, oben + 1);

            if (zufallszahl1 < zufallszahl2) {
                unten = zufallszahl1;
                oben = zufallszahl2;
            } else {
                unten = zufallszahl2;
                oben = zufallszahl1;
            }
            System.out.printf("%nNeuerer unterer wert: %d\nNeuerer oberer Wert: %d%n ", unten, oben);
            if (unten != oben) {
                System.out.printf("es werden neue Werte zwischen %d und %d ausgelost%n", unten, oben);
            }}

            while (unten != oben) ;

            System.out.println("Untere und obere Grenze sind identisch.\n Auf Wiedersehen!");

            }}

