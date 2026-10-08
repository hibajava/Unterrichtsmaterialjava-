/*
Aufgabenstellung:
Vor der Schleife wird vom User eine ganze Zahl x abgefragt.
Daraufhin soll eine Schleife starten, die solange durchlaufen wird, solange x größer 1 ist.
	Hinweis: Falls die User-Eingabe bereits von Beginn an kleiner oder gleich 1 ist, so soll die Schleife also kein einziges mal 	durchlaufen werden!
Pro Schleifendurchlauf soll …
	- x durch 2 (ohne Rest) geteilt werden
	- der aktuelle Wert von x ausgegeben werden.
Nach der Schleife soll auf der Konsole „Schleife wurde abgearbeitet“ erscheinen und das Programm enden.

Quelle: WBS
 */
package schleifen;
import java.util.Scanner;

public class Beispielaufgabe
{
    public static void main(String[] args)
    {
        Scanner eingabe = new Scanner(System.in);

        System.out.println("Bitte eine ganze Zahl x eingeben:");
        int x = eingabe.nextInt();

        while(x > 1)
        {
            x = x/2;
            System.out.println("Aktueller Wert von x = " + x);
        }

        System.out.println("Schleife wurde abgearbeitet");

        eingabe.close();
    }
}
