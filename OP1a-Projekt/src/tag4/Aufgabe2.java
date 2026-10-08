package tag4;
/*Recherchieren, welche mitgelieferten Packages in Java besonders oft gebraucht werden.
Welche Klassen sind im selben package wie String?
Die package Struktur in einem Open Source Java Projekt recherchieren*/
public class Aufgabe2 {
    static void main(String[] args) {
// Klasse Math im package java.lang
        // kein import nötig

        // Ü: Maximum berechnen von E und PI
        double max = Math.max(Math.E, Math.PI);
        System.out.println("max = " + max);

        testMethode();
    }

    public static void testMethode() {
        String s = "München";
        System.out.println("s = " + s);
        s = s.toUpperCase();
        System.out.println("s = " + s);
    }
}



