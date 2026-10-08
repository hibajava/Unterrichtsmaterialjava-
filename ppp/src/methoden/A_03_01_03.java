/*
Das Programm fragt zu Beginn einen ganzzahligen Wert zwischen (beiderseits einschließlich) 0 und 5 ab
und speichert diesen in der Variable x. Anschließend startet die folgende Funktion:

Name: ………….. bewertung
Übergabewert: … x
Funktionalität: …. (falls x=0) Ausgabe: “Kein Kommentar!“
                             (falls x>0) Ausgabe: “Java ist sehr … toll!“
				        (Anzahl des Wortes „sehr“: x)

Beispiel:
Für x=3 wäre die Ausgabe: „Java ist sehr sehr sehr toll!“

Hinweise:
-	Versuchen Sie bitte die Aufgabe mit Hilfe einer Schleife zu lösen.
-	Kontrolle von Eingabe- (und Übergabewerten) wird nicht verlangt

 */

package methoden;

import java.util.Scanner;

public class A_03_01_03 {
    public static void bewertung(int x)
    {
        if(x == 0)
        {
            System.out.println("Kein Kommentar");
            return;
        }

        //Variante 1
        System.out.print("Java ist ");

        for(int i = 0; i < x; i++)
        {
            System.out.print("sehr ");
        }

        System.out.print("toll!");

        //Variante 2
        //System.out.println("Java ist " + "sehr ".repeat(x) + "tol!!");
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte eine ganze Zahl zwischen (beiderseits einschließlich) 0 - 5 eingeben");
        int x = input.nextInt();

        //Aufruf der eigenen Methode
        bewertung(x);

        input.close();
    }
}


