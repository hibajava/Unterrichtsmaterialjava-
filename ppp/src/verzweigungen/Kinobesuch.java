
package verzweigungen;

import java.util.Scanner;

public class Kinobesuch
{
    public static void main(String[] args)
    {
        //Unsere Variablen
        double einzelpreis;
        int anzahlPersonen;
        double gesamtpreis;

        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie bitte den Einzelpreis pro Ticket ein (in Euro):");
        einzelpreis = input.nextDouble();

        System.out.println("Geben Sie bitte die Anzahl der Personen ein:");
        anzahlPersonen = input.nextInt();

        gesamtpreis = anzahlPersonen * einzelpreis;

        if(anzahlPersonen <= 4)
        {
            //Ohne Rabatt
            System.out.printf("Gesamtpreis = %.2f €", gesamtpreis);
        }
        else
        {
            //Mit Rabatt
            System.out.printf("Gesamtpreis = %.2f €", gesamtpreis*0.9);
        }

        //Den Scanner wieder schließen
        input.close();
    }
}