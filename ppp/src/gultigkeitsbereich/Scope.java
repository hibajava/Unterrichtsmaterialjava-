
package gultigkeitsbereich;
import java.util.Scanner;

public class Scope
{
    //Das ist ine globale Variable (gehört zur Klasse selbst)
    static int x = 500;

    //Die Main-Methode
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Abfrage des Alters
        System.out.println("Wie alt bist du?");
        int alter = sc.nextInt();


        //Die Verzweigung
        if(alter >= 18)
        {
            //Das sind lokale Variablen
            int x = 100;
            String ausgabe1 = "Du bist volljährig";

            System.out.println(ausgabe1);
            System.out.println(x);
        }
        else
        {
            //Das sind auch lokale Variablen
            int y = 0;
            String ausgabe2 = "Du bist minderjährig";

            System.out.println(ausgabe2);
            System.out.println(y);
        }

        //Diese x gehört zur Main-Methode (ab hier)
        int x = 60;

        //Die lokalen Variablen können hier nicht aufgerufen
        //System.out.println(ausgabe1);   //Fehler
        //System.out.println(ausgabe2);   //Fehler

        //Test:
        System.out.println(x);
        System.out.println(Scope.x);

    }
}
