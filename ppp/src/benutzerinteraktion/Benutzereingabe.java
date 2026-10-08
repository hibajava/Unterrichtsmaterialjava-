
package benutzerinteraktion;
import java.util.Scanner;

public class Benutzereingabe
{
    public static void main(String[] args)
    {
        //Erstellen eines Objekts der Klasse Scanner zur Benutzereingabe
        Scanner sc = new Scanner(System.in);

        //Dem Benutzer sagen, was er tun/eingeben soll
        System.out.println("Wie alt bist du?");

        //Verwendung der Methode nextLine(); des ScannerObjekts (sc)
        String eingabeAlter =  sc.nextLine();

        //Die String-Eingabe in eine ganze Zahl umwandeln
        int alter = Integer.parseInt(eingabeAlter);

        System.out.println("Naja. Und wie heißt du?");
        String name = sc.nextLine();

        System.out.println("Dein bisch " + (alter + 2) + " Jahre alt");
        System.out.println("Dein Name ist " + name);

        //Den Scanner wieder schließen, um Ressourcen freizugeben
        sc.close();
    }
}
