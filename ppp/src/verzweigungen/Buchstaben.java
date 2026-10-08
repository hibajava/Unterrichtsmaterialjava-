
package verzweigungen;
import java.util.Scanner;

public class Buchstaben
{
    public static void main(String[] args)
    {
        //Unsere Variablen
        char buchstab1;
        char buchstab2;
        int auswahl;

        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie bitte einen ersten Buchstaben ein:");
        buchstab1 = input.next().charAt(0);  //ermittelt nur den ersten Buchstaben (also mit Index 0)

        System.out.println("Geben Sie bitte einen zweiten Buchstaben ein:");
        buchstab2 = input.next().charAt(0);

        System.out.println("Wählen Sie bitte aus...");
        System.out.println("(1) für Ausgabe nebeneinander");
        System.out.println("(2) für Ausgabe übereinander");

        System.out.println("Ihre Auswahl:");
        auswahl = input.nextInt();

        System.out.println("Ausgabe");

        //Wir gehen (mit unseren bisherigen Java-Kenntnissen) davon aus, dass der Benutzer 1 oder 2 eingibt!
        //Mehrseitige Verzweigungen folgen aber noch!
        if(auswahl == 1)
        {
            //nebeneinander
            System.out.printf("%c%c", buchstab1, buchstab2);
        }
        else
        {
            //übereinander
            System.out.printf("%c%n%c", buchstab1, buchstab2);
        }

        //Den Scanner wieder schließen
        input.close();
    }
}