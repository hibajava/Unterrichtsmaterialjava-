package assoziationen.aufgaben.aufgabe_8.lösung;

import java.util.Collections;
import java.util.Comparator;
public class Umsatz {
    public static void EinkaeufeAnzeigen() {
        for(Person p : Person.Kundschaft) {
            System.out.println("\n" + p.getClass().getSimpleName());
            System.out.println("════════════");
            for(Artikel a : p.Einkaufsliste) {
                System.out.println(a.name);
            }
        }
    }
    public static void Umsaetze() {
        double umskunde = 0;
        double umsma = 0;
        double umsdieb = 0;
        double umsatzTotal = 0;
        double umsatzEffektiv;

        for(Person p : Person.Kundschaft) {
            switch (p.getClass().getSimpleName()) {
                case "Kunde":
                    for(Artikel a : p.Einkaufsliste) {
                    umskunde += a.preis;
                    umsatzTotal += umskunde;
                }
                break;
                case "Angestellter":
                    for(Artikel a : p.Einkaufsliste) {
                    umsma += a.preis;
                    umsatzTotal += umsma;
                }
                break;
                case "Dieb":
                    for(Artikel a : p.Einkaufsliste) {
                    umsdieb += a.preis;
                    umsatzTotal += umsdieb;
                }
                break;
            }
        }
        umsatzTotal = umskunde + umsma + umsdieb;
        umsatzEffektiv = umskunde + (umsma * Konstanten.MARABATT) + (umsdieb * Konstanten.DIEBRABATT);

        System.out.printf("Umsatz Kunden : %8.2f\n", umskunde);
        System.out.printf("Umsatz MA     : %8.2f | Effektiv: %8.2f\n", umsma, (umsma * Konstanten.MARABATT));
        System.out.printf("Umsatz Dieb   : %8.2f | Effektiv: %8.2f\n", umsdieb, (umsdieb * Konstanten.DIEBRABATT));
        System.out.println("═════════════════════════════════════════════");
        System.out.printf("Gesamtumsatz  : %8.2f | Effektiv: %8.2f\n", umsatzTotal, umsatzEffektiv);
    }

    public static void TopFlop() {
        Artikel a1;
        for(Person p : Person.Kundschaft){
            for(Artikel a : p.Einkaufsliste){
                a1 = Artikel.waren.get(a.nummer - 1);
                a1.verkauft += 1;
            }
        }
        Collections.sort(Artikel.waren, Comparator.comparing(Artikel::getVerkauft));
        for(Artikel a : Artikel.waren){
            System.out.println(a.name + "   " + a.verkauft);
        }

        int anz = 0;
        System.out.println("\nTOP 10");
        System.out.println("══════");
        for(int index = Konstanten.DIEOBERGRENZE-1; index > (Konstanten.DIEOBERGRENZE - Konstanten.FLOP - 1); index--) {
            a1 = Artikel.waren.get(index);
            System.out.println(a1.name + " wurde " + a1.verkauft + " mal verkauft.");
        }
        System.out.println("\nFLOP 10");
        System.out.println("═══════");
        for(int index = 0; index < Konstanten.TOP; index++) {
            a1 = Artikel.waren.get(index);
            System.out.println(a1.name + " wurde " + a1.verkauft + " mal verkauft.");
        }
    }
    public static void BesucherZahlen() {
        int kunde = 0;
        int ma = 0;
        int dieb = 0;

        for(Person p : Person.Kundschaft) {
            switch (p.getClass().getSimpleName()) {
                case "Kunde":
                    kunde += 1;
                    break;
                case "Angestellter":
                    ma += 1;
                    break;
                case "Dieb":
                    dieb += 1;
                    break;
            }
        }
        System.out.println("Die heutigen Besucher des Supermarkts");
        System.out.println("-------------------------------------");
        System.out.println("Kunden insgesamt: " + (kunde + ma + dieb) + " davon");
        System.out.println("  Normale Kunden: " + kunde);
        System.out.println("     Mitarbeiter: " + ma);
        System.out.println("           Diebe: " + dieb + "\n");
    }
}
