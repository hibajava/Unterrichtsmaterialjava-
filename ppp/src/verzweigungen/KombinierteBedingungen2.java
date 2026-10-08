
package verzweigungen;

import java.util.Scanner;

public class KombinierteBedingungen2
{
    public static void main(String[] args)
    {
        //Unsere Variablen/3 Zahlen
        int a, b, c;

        int groesste;

        //Die Benutzereingaben
        Scanner input = new Scanner(System.in);

        System.out.println("Erste Zahl?");
        a = input.nextInt();

        System.out.println("Zweite Zahl?");
        b = input.nextInt();

        System.out.println("Dritte Zahl?");
        c = input.nextInt();

        //Kombinierte/Komplexe Bedingungen
        if(a > b && a > c)
        {
            groesste = a;
        }
        else if (b > a && b > c)
        {
            groesste = b;
        }
        else if (a==b && b==c )
        {
            System.out.println(" Die drei Zahlen sind gleich");
            return;
        }
        else
        {
            groesste = c;
        }

        System.out.println("Groesste Zahl = " + groesste);

        input.close();
    }
}
