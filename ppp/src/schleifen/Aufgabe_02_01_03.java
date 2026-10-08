/*
Das Programm fragt zu Beginn einmalig zwei ganze Zahlen ab, die für die Breite und Länge eines Rechteckes stehen.

Anschließend startet eine Schleife, in der pro Durchlauf das Produkt der beiden Zahlen (also die Fläche des Rechteckes) abgefragt wird.

Die Schleife wird solange wiederholt, solange die Eingabe nicht der Fläche entspricht.

Nach der Schleife wird ausgegeben, wie viele Versuche der User benötigte, bis er die korrekte Fläche eingab.

 */
package schleifen;

import java.util.Scanner;

public class Aufgabe_02_01_03
{
    public static void main(String[] args)
    {
        int flaeche, versuche = 0;

        Scanner sc = new  Scanner(System.in);

        System.out.println("Bitte eine (ganzzahlige) Breite eingeben:");
        int breite = sc.nextInt();

        System.out.println("Bitte eine (ganzzahlige) Länge eingeben:");
        int laenge = sc.nextInt();

        do
        {
            System.out.println("Wie groß ist die Fläche?");
            flaeche = sc.nextInt();

            versuche++;
        }
        while(flaeche != breite*laenge);

        System.out.println("Anzahl der Versuche = " +  versuche);

        sc.close();
    }
}
