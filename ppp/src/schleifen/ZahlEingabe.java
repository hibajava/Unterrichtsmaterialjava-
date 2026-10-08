
package schleifen;

import java.util.Scanner;

public class ZahlEingabe
{
    public static void main(String[] args)
    {
        int zahl;

        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.print("Geben Sie bitte eine ganze Zahl kleiner 10 ein: ");
            zahl = sc.nextInt();
        }
        while (zahl >= 10);

        System.out.println("Glückwunsch!");

        sc.close();
    }
}