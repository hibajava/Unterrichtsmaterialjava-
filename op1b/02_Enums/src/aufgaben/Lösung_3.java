package aufgaben;

/* Level 2
 *  Erstellen Sie ein Java-Programm, in dem Sie
 *  - den enum Kyu { Braun = 1, Blau, Grün, OrangeGrün, Orange, GelbOrange, Gelb, WeißGelb, Weiß } einführen
 *  - dem Benutzer in einer Schleife eine Auswahl präsentieren
 *      - Kyu-Grad (1)
 *      - Gürtel-Farbe (2)
 *      - Nächste Prüfung (3)
 *  - Bei der ersten Auswahl gibt der Benutzer seinen Kyu-Grad (zwischen 1 und 9) ein und bekommt die Gürtelfarbe ausgegeben
 *  - Bei der zweiten Auswahl sollen dem Benutzer die möglichen Gürtelfarben ausgegeben werden.
 *      - Anschließend gibt der Benutzer eine Farbe ein und bekommt den Kyu-Grad als Ausgabe.
 *  - Bei der dritten Auswahl sollen dem Benutzer wieder die möglichen Gürtelfarben ausgegeben werden.
 *      - Der Benutzer gibt seine aktuelle Gürtelfarbe ein und bekommt als Ausgabe die Farbe des nächsten Gürtels.
 *
 *  Hinweis: Kyu sind die Ränge in japanischen Kampfkünsten, hier speziell die Ränge des deutschen Judo-Bundes.
 *  Der höchste Rang ist der braune Gürtel (also der 1. Kyu) der niedrigste der weiße (der 9. Kyu).
 */

import java.util.Scanner;

public class Lösung_3
{
    static int eingabeZahl;

    public enum Kyu
    {
        Braun(1), Blau(2), Grün(3), OrangeGrün(4), Orange(5), GelbOrange(6), Gelb(7), WeißGelb(8), Weiß(9);

        private final int KyuGrad;

        Kyu(int kyuGrad)
        {
            this.KyuGrad = kyuGrad;
        }
    }

    public static boolean parsenInteger(String value)
    {
        try
        {
            eingabeZahl = Integer.parseInt(value);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String eingabeText;
        boolean parseOk;
        boolean auswahlOk;
        boolean treffer;
        String gürtelFarbe;

        while (true)
        {
            do
            {
                System.out.println("Kyu-Grad        (1)\nGürtel-Farbe    (2)\nNächste Prüfung (3)\nIhre Auswahl:    ");
                eingabeText = sc.nextLine();
                parseOk = parsenInteger(eingabeText);
                auswahlOk = true;
                if (parseOk)
                    if (eingabeZahl < 1 || eingabeZahl > 3)
                        auswahlOk = false;
            }
            while (!parseOk || !auswahlOk);

            switch (eingabeZahl)
            {
                case 1:
                    do
                    {

                        System.out.print("Kyu-Grad: ");
                        eingabeText = sc.nextLine();
                        parseOk = parsenInteger(eingabeText);
                        auswahlOk = true;
                        if (parseOk)
                            if (eingabeZahl < 1 || eingabeZahl > 9)
                                auswahlOk = false;
                    } while (!parseOk || !auswahlOk);

                    for (Kyu k : Kyu.values())
                    {
                        if (k.KyuGrad == eingabeZahl)
                        {
                            System.out.println("Der Kyu-Grad " + k.KyuGrad + " entspricht der Gürtelfarbe " + k);
                        }
                    }

                    sc.nextLine();  // Nach der Enter-Taste geht es weiter.
                    break;
                case 2:
                    do
                    {
                        for (Kyu k : Kyu.values())
                        {
                            System.out.println(k);
                        }
                        System.out.println("Ihre Auswahl: ");
                        eingabeText = sc.nextLine();
                        treffer = false;
                        for (Kyu k : Kyu.values())
                        {
                            if (eingabeText.equalsIgnoreCase(k.name()))
                            {
                                System.out.println("Ihre Auswahl entspricht dem Kyu-Grad: " + k.KyuGrad);
                                treffer = true;
                            }
                        }
                    } while (!treffer);

                    sc.nextLine(); // Nach der Enter-Taste geht es weiter.
                    break;
                case 3:
                    do
                    {
                        for (Kyu k : Kyu.values())
                        {
                            System.out.print(k + " ");
                        }

                        System.out.println("Geben Sie bitte Ihre aktuelle Gürtelfarbe ein: ");
                        eingabeText = sc.nextLine();
                        if (eingabeText.equalsIgnoreCase("Braun"))
                        {
                            System.out.println("Sie haben bereits den höchsten Kyu-Grad");
                            break;
                        }
                        else
                        {
                            treffer = false; // Für die Schleifenbedingung
                            gürtelFarbe = "Braun"; // Wir setzen eine Merk-Variable auf den höchstmöglichen Wert
                            for (Kyu k : Kyu.values())
                            {
                                if (eingabeText.equals(k.name()))
                                {
                                    System.out.println("Bei der nächsten Prüfung geht es um die Gürtelfarbe: " + gürtelFarbe);
                                    treffer = true;
                                    break;
                                }
                                else gürtelFarbe = k.name(); // War 'k' nicht meine Eingabe, wird die Merk-Variable auf 'k' gesetzt.
                            }
                        }
                    } while (!treffer);
                    break;
            }
        }
    }
}







