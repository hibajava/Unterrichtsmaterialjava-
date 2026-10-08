package methoden;
import java.util.Scanner;

public class Lieblingsbuchstabe
{
    //Eigene Methode mit zwei Parameter
    static void meinLiebling(char b, int x)
    {
        for (int i = 0; i < x; i++)
        {
            System.out.print(b);
        }
    }

    //Die Main-Methode
    public static void main(String[] args)
    {
        //Unsere Variablen
        char b;
        int anzahl;

        //Scanner-Objekt
        Scanner scanner = new Scanner(System.in);

        //Die Benutzereingaben
        System.out.println("Geben Sie bitte Ihren Lieblingsbuchstaben ein: ");
        b = scanner.next().charAt(0);

        System.out.println("Wie oft sollte das auf der Konsole ausgegeben werden?");
        anzahl = scanner.nextInt();

        //Die eigene Methode mit zwei Argumenten aufrufen
        meinLiebling(b, 3);

        System.out.println("\nFeierabend!");
        scanner.close();
    }}
