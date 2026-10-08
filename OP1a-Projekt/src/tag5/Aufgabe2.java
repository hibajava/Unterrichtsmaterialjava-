package tag5;

import java.util.ArrayList;
import java.util.Collections;

/*Überlegen, warum ein Array nicht optimal für eine Liste von Kundennummern geeignet ist
(z.B. 123, 838, 98989, 76778; gelegentlich kommt eine neue Nummer dazu).*/
public class Aufgabe2 {
    static void main() {
        int[] nummern = { 123, 838, 98989, 76778};// Kurzschreibweise bei Initialisierung
        // neue Nummer 17273
        // wie in Array
        nummern = new int[] { 123, 838, 98989, 76778, 17273};// ausführliche syntax

        // Besser geeignet: Liste in der Länge variabel
        ArrayList<Integer> liste = new ArrayList<>();
        System.out.println("liste = " + liste);
        liste.add(123);
        liste.add(838);
        liste.add(98989);
        liste.add(76778);
        liste.add(17273);
        System.out.println("liste = " + liste);
        // Ü: Mit Utilityklasse Collections: sortieren
        Collections.sort(liste);
        System.out.println("liste = " + liste);

    }
}
