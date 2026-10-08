package for_schleife;
import java.util.Scanner;
public class Aufgabe_02_02_02
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie bitte die Anzahl der Räume ein:");
        int anzahlRaeume = sc.nextInt();

        double breite, laenge, flaeche, gesamtflaeche = 0;

        for(int i=1; i<= anzahlRaeume; i++)
        {
            System.out.println("Raum-nr." +i);
            System.out.println("Bitte Breite eingeben:");
            breite = sc.nextDouble();

            System.out.println("Bitte länger eingeben:");
            laenge= sc.nextDouble();

            flaeche= breite*laenge;
            gesamtflaeche += flaeche;
        }
        System.out.printf("Die Gesamtfläche der Wohnung = %.2f qm", gesamtflaeche);
        sc.close();
    }
}
