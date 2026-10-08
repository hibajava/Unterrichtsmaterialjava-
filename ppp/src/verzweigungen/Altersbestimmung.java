package verzweigungen;
import java.util.Scanner;

public class Altersbestimmung
{
    //Die Main-Methode
    public static void main(String[] args)
    {
        //Unser Scanner-Objekt
        Scanner sc = new Scanner(System.in);

        //Unsere Variablen
        int alter;
        int aktJahr;
        int gebJahr;
        boolean schonGeburtstagGehabt;

        //Die Benutzereingaben abfragen und speichern
        System.out.println("Wie ist das aktuelle Jahr?");
        aktJahr = sc.nextInt();

        System.out.println("Dein Geburtsjahr?");
        gebJahr = sc.nextInt();

        System.out.println("Schon dieses Jahr Geburtstag gehabt?: true oder false");
        schonGeburtstagGehabt = sc.nextBoolean();

        //Eine Verzweigung (if-else) - ist eine Kontrollstruktur
        if(schonGeburtstagGehabt == true)  //einfacher: if(schonGeburtstagGehabt), weil schonGeburtstagGehabt nur true oder false sein kann
        {
            //So wird das Alter in diesem Fall berechnet
            alter = aktJahr - gebJahr;
        }
        else
        {
            //Ansonsten wird das Alter so berechnet
            alter = aktJahr - gebJahr - 1;
        }

        System.out.printf("Du bist %d Jahre alt.",  alter);

        //Den Scanner wieder schließen
        sc.close();

    }
}
