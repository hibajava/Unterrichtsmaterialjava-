/*
Das Programm fragt zu Beginn zwei Floatzahlen (Einzelpreis und Prozentsatz des Rabatts)
sowie eine Integerzahl (Stückzahl) ab. Anschließend wird die folgende Funktion gestartet:

Name: …………… gesamtpreis
Übergabewerte: … Einzelpreis, Rabatt, Stückzahl
Funktionalität: …… Ausgabe: „Der Gesamtpreis beläuft sich auf …“
(Der Platzhalter “…“ wird natürlich mit dem entsprechenden Rechenergebnis gefüllt)

Mit dem Ende der Funktion endet auch das Programm.

 */
package methoden;

import java.util.Scanner;

public class A_03_01_04 {
    //Die Main-Methode
    public static void main(String[] args)
    {
        double einzelpreis, rabatt;
        int stueckzahl;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Einzelpreis ein:");
        einzelpreis =  sc.nextDouble();

        System.out.println( "Bitte geben Sie den Rabatt ein:");
        rabatt = sc.nextDouble();

        System.out.println("Bitte geben Sie die Stückzahl ein:");
        stueckzahl = sc.nextInt();

        gesamtpreis(einzelpreis, rabatt, stueckzahl);

    }

    //Unsere eigene Methode
    public static void gesamtpreis(double einzelpreis, double rabatt, int stueckzahl)
    {
        double gesamtpreis = stueckzahl *  einzelpreis * (1 - rabatt/100);
        System.out.printf("Der Gesamtpreis beläuft sich auf %.2f €",  gesamtpreis);
    }

}

