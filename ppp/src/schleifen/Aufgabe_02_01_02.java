
/*
Das Programm fragt vom User zu Beginn eine „Neue Geheimnummer“ ab
(gefordert wird eine beliebige aber ganzzahlige Eingabe).
Anschließend wird der User gebeten, die soeben eingegebene Zahl zu bestätigen,
indem er diese erneut eingibt.
Falls die zweite Eingabe der ersten nicht entspricht,
so wird erneut eine „Neue Geheimnummer“ abgefragt, die ebenfalls bestätigt werden muss … und so weiter …

Falls der User jedoch (nach beliebig vielen Versuchen) die unmittelbar vorangegangene Eingabe bestätigt,
so wird die neue Geheimnummer zur Kontrolle auf der Konsole ausgegeben und das Programm endet.

 */
package schleifen;

import java.util.Scanner;

public class Aufgabe_02_01_02
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int geheimnummer, bestaetigung;

        do
        {
            System.out.println("Bitte eine neue (ganzzahlige) Geheimnummer eingeben:");
            geheimnummer = sc.nextInt();

            System.out.println("Bitte bestätigen Sie Ihre Geheimnummer:");
            bestaetigung = sc.nextInt();

        }
        while(bestaetigung != geheimnummer);

        System.out.println("Ihre neue Geheimnummer lautet: " + geheimnummer);

        sc.close();
    }
}