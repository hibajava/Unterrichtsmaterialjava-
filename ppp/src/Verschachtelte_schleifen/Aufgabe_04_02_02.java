package Verschachtelte_schleifen;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Aufgabe_04_02_02
    
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int x, y, produkt;

        //Die äußere Schleife
        for(int i = 1; i <= 5; i++)
        {
            x = ThreadLocalRandom.current().nextInt(1, 11);
            y = ThreadLocalRandom.current().nextInt(1, 11);
            System.out.println("Zwei zufällige Zahlen x & y wurden ausgelost:");
            System.out.printf("x = %d, y = %d\n", x, y);

            //Die innere Schleife
            do
            {
                System.out.println("Geben Sie bitte das Produkt von der beiden zufälligen Zahlen X & Y:");
                produkt = sc.nextInt();
            }
            while(produkt != x*y);

            System.out.println("Richtig");
        }

        sc.close();
    }
}
