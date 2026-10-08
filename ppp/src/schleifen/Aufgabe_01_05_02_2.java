
/*
Das Programm fragt vom User zu Beginn ein Zeichen c und eine positive ganze Zahl i ab. Außerdem soll der User die folgende Auswahl vornehmen:

(1)	Die Ausgabe wird NEBENEINANDER ausgeführt
(2)	Die Ausgabe wird ÜBEREINANDER ausgeführt

Bei der Auswahl (1) erscheint das ausgewählte Zeichen c entsprechend i-mal NEBENEINANDER.

Falls sich der User für (2) entschieden hat, so wird das Zeichen c insgesamt i-mal ÜBEREINANDER auf der Konsole ausgegeben.

Nach dieser Ausgabe endet das Programm.

 */
package schleifen;

import java.util.Scanner;

public class Aufgabe_01_05_02_2
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte ein Zeichen eingeben");
        char c = sc.next().charAt(0);

        System.out.println("Bitte eine Anzahl eingeben");
        int i = sc.nextInt();

        System.out.println("(1)Die Ausgabe wird NEBENEINANDER ausgeführt\n(2)Die Ausgabe wird ÜBEREINANDER ausgeführt");
        System.out.println("Ihre Auswahl");
        int auswahl = sc.nextInt();

        int zaehler = 0;

        //Kurze Version
        while(zaehler < i)
        {
            System.out.print(c);
            if(auswahl == 2)
            {
                System.out.print("\n");
                //Oder einfach System.out.println(); !!
            }
            zaehler++;
        }
    }
}





