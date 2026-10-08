//Das ist unser Paket
package mainprogramm;

//Die import-Anweisung
import java.util.Scanner;

//Die Klasse
public class importBeispiel
{
    //Die Main-Methode
    public static void main(String[] args)
    {
        //Erstellen eines Objekts der Klasse Scanner zur Benutzereingabe
        Scanner scannerObjekt = new Scanner(System.in);
        System.out.println("Gib bitte eine erste Fließkommazahl ein:");

        //Verwendung der Methode nextDouble(); des scannerObjekts
        double ersteZahl = scannerObjekt.nextDouble();

        System.out.println("Gib bitte eine zweite Fließkommazahl ein:");
        double zweiteZahl = scannerObjekt.nextDouble();

        System.out.println("\nDie summe = " + (ersteZahl + zweiteZahl)*2);

        //Den Scanner wieder schließen, um Ressourcen freizugeben
        scannerObjekt.close();
    }
}

/* Analog:
Klasse Auto, Objekt bmw
Auto bmw = new Auto();
bmw.fahren();   //bmw kann fahren() --> eine Methode der Klasse Auto
 */
