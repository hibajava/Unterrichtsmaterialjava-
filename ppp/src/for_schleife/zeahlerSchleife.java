/*
Aufgabenstellung:
Vor der Schleife werden vom User drei ganze Zahlen abgefragt:
Die erste Zahl soll in start abgespeichert werden. Sie bestimmt, von wo aus die anschließende Zähler-Schleife starten soll.
Die zweite Zahl soll größer als start sein, in ziel abgespeichert werden und bestimmen, bis zu welcher Zahl (höchstens) hochgezählt werden soll.
Die dritte Zahl soll in sprung abgespeichert werden. Sie bestimmt, um welchen Wert der Schleifenzähler pro Durchlauf hochgezählt werden soll.

Daraufhin soll eine Schleife starten, die mit dem Zählerwert = start beginnt.
Pro Schleifendurchlauf soll …
	- (zuerst) der aktuelle Wert des Zählers ausgegeben werden
	- (anschließend) der Zähler um den Wert von sprung erhöht werden (zaehler=zaehler+sprung)

Die Schleife wird solange laufen, solange der Wert des Zählers kleiner (oder gleich) ziel ist.
Die Schleife wird abgebrochen, falls zaehler > ziel

Nach der Schleife soll die Ausgabe: "Die Schleife endete, denn der Zähler hat den Wert:" zaehler erscheinen. Anschließend soll das Programm beendet werden.

Hinweis:
Aus didaktischen Gründen wurde diese Aufgabe möglichst allgemein gehalten.
Sie verzichtet daher zunächst auf eine Anwendung von Inkrement oder Dekrement.
Dies holen wir aber bei den folgenden Beispielen nach.

Quelle: WBS
 */
package for_schleife;

import java.util.Scanner;

public class zeahlerSchleife
{
    public static void main(String[] args)
    {
        int start, ziel, sprung, zaehler;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie bitte den Startwert ein: ");
        start = scanner.nextInt();

        System.out.println("Geben Sie bitte den Zielwert ein: ");
        ziel = scanner.nextInt();

        System.out.println("Geben Sie bitte den Sprungwert ein: ");
        sprung = scanner.nextInt();

        for (zaehler = start; zaehler <= ziel; zaehler = zaehler + sprung)
        {
            System.out.println("Aktueller Zähler-Wert: " + zaehler);
        }

        System.out.println("Die Schleife endete, denn der Zähler hat den Wert " + zaehler);

        scanner.close();
    }
}
