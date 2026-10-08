package do_while_schleifen;
import java.util.Scanner;
public class Aufgabe_02_01_03
{
    public static void main(String[] args)
    {
        int  flaeche, versuche=0;

        Scanner sc = new Scanner(System.in);

        System.out.println(" giben Sie bitte Eine Breite :");
        int Breite = sc.nextInt();

        System.out.println(" giben Sie bitte Länge ");
        int Länge = sc.nextInt();


        int eingabeUser;

        do {
            versuche++;
            System.out.println("Die größe fläche des Rechtecke? ");
            eingabeUser= sc.nextInt();
        }
        while (eingabeUser!= Breite*Länge);

        System.out.printf("Anzahl der Versuche = %d", versuche);

        sc.close();
    }
}
