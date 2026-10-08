package verzweigungen;
import java.util.Scanner;

public class AutoKauf
{
    public static void main(String[] args)
    {

        int preis, sitze;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie bitte den Einkaufspreis des Autos ein: ");
        preis = scanner.nextInt();

        System.out.print("Geben Sie bitte die Anzahl der Sitze ein: ");
        sitze = scanner.nextInt();

        //Verzweigungen mit komplexen/kombinierten Bedingungen
        //Das logische UND
        if (preis < 10000 && sitze > 4)
        {
            System.out.println("Gekauft!");
        }
        else
        {
            //Das logische ODER
            if (preis < 10000 || sitze > 4) {
                System.out.println("Probefahrt");
            } else
            {
                System.out.println("Kein Interesse");
            }
        }

        scanner.close();
    }
}