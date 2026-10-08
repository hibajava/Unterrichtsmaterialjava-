/*
Das Programm besteht aus einer Schleife.

Pro Schleifendurchlauf …
-	werden 2 Kommazahlen abgefragt.
-	wird das Produkt(Multiplikationsergebnis) dieser beiden Eingabe-Zahlen auf 2 Nachkommastellen genau ausgegeben
-	wird gefragt, ob der User einen weiteren Durchlauf wünscht.
o	Falls der User j eingibt, so werden erneut 2 Zahlen abgefragt, deren Produkt ermittelt und ausgegeben … u.s.w. …
o	Falls der User n eingibt, so endet die Schleife

Anschließend erscheint auf der Konsole die Ausgabe „Dann eben nicht mehr“
und das Programm endet.

 */
package schleifen;

import java.util.Scanner;

public class Aufgabe_01_05_03
{
    public static void main(String[] args)
    {
        //Scanner-Objekt
        Scanner input =  new Scanner(System.in);

        //Unsere Variablen
        double zahl1, zahl2;
        char antwort = 'j';

        while(antwort == 'j')
        {
            System.out.println("Bitte eine erste Fließkommazahl eingeben:");
            zahl1 = input.nextDouble();

            System.out.println("Bitte eine zweite Fließkommazahl eingeben");
            zahl2 = input.nextDouble();

            System.out.printf("Das Produkt beider Zahlen (auf 2 Nachkommastellen gerundet) = %.2f%n", zahl1*zahl2);

            System.out.println("Möchten Sie noch eine Runde spielen? (j/n)");
            antwort = input.next().charAt(0);

        }

        System.out.println("Dann eben nicht mehr");
    }
}
