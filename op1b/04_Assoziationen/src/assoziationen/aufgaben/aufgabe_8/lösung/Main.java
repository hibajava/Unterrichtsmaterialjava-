package assoziationen.aufgaben.aufgabe_8.lösung;

import java.util.Random;

public class Main {
    public static Random zufall = new Random();
    static void GeneriereKundschaft() {
        int anz = zufall.nextInt(Konstanten.KUNDENMIN, Konstanten.KUNDENMAX + 1);
        for (int index = 0; index < anz; index++) {
            int werkauft = zufall.nextInt(100)+1;
            if (werkauft <= 85) {
                new Kunde(zufall);
            }
            if (werkauft > 85 && werkauft <= 95) {
                new Angestellter(zufall);
            }
            if (werkauft > 95) {
                new Dieb(zufall);
            }
        }
    }

    public static void main(String[] args) {
        Artikel.artikelBestand();
        GeneriereKundschaft();

        //Umsatz.EinkaeufeAnzeigen();

        Umsatz.BesucherZahlen();
        Umsatz.Umsaetze();
        Umsatz.TopFlop();

        System.out.println("\nProgramm-Ende");
    }
}