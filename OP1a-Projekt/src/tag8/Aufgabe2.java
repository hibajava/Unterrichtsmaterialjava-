package tag8;
/*
Methode soll Quersumme einer ganzen Zahl berechnen,
bei negativer Zahl passende Exception auslösen.
Die main-Methode erzeugt einige Zufallszahlen (auch negativ),
 ruft die andere Methode auf, und
fängt die Exceptions ab.


 */
import java.util.Random;

public class Aufgabe2 {
    static void main() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int zahl = random.nextInt(-10, 20);
            try {
                int quersumme = quersumme(zahl); // potentiell gefährlich
                System.out.printf("zahl %d hat Quersumme %d %n ", zahl, quersumme);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    private static int quersumme(int zahl ) {
        if (zahl < 0 ){
            throw new IllegalArgumentException("Zahl muss positiv sein: " + zahl);
        }
        int erg = 0;
        int current = zahl;
        while (current > 0){
            erg += current% 10;
            current /= 10;
        }
        return erg;
    }
}
