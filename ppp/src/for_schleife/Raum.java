package for_schleife;
import java.util.Scanner;
public class Raum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie bitte Anzahlräume?");
       int  Anzahl= sc.nextInt();

        double breite , laenge, flaeche, gesamtflaeche=0;

            for( int i= 1; i<= Anzahl; i++)
            {
                System.out.println("Bitte breite eingeben: ");
                breite= sc.nextDouble();

                System.out.println("Bitte länger eingeben: ");
                laenge= sc.nextDouble();

                flaeche=breite*laenge;
                gesamtflaeche += flaeche;

            }
        System.out.printf("Die Gesamtfläche der wohnung= %.2f", gesamtflaeche);
            sc.close();
                        }
}
