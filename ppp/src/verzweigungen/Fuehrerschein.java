package verzweigungen;

import java.util.Scanner;

public class Fuehrerschein
{
    public static void main(String[] args)
    {
        //Unsere Variablen
        int alter;
        boolean theorieBestanden;

        //Die Benutzereingabe
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte dein Alter eingeben:");
        alter = eingabe.nextInt();

        //Eine verschachtelte Verzweigung
        if(alter >= 18)
        {
            System.out.println("Hast du die Theorieprüfung bestanden? (true/false)");
            theorieBestanden = eingabe.nextBoolean();

            if(theorieBestanden)
            {
                System.out.println("Praktische Prüfung möglich");
            } else
            {
                System.out.println("Theorieprüfung wiederholen!");
            }
        }
        else
        {
            System.out.println("Zu jung");
        }

        eingabe.close();
    }
}
