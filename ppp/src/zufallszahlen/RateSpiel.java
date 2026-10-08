package zufallszahlen;

import java.util.Random;
import java.util.Scanner;

public class RateSpiel //Zahlen von 1 bis 10
    {
        public static void main(String[] args)
        {
            Random rand = new Random();
            int zufallszahl = rand.nextInt(1 , 11);  //also, von 1 bis 10

            Scanner input = new Scanner(System.in);
            System.out.println("Rate mal die erzeugte ganze Zufallszahl zwischen 1 - 10:");
            int geraten = input.nextInt();

            if(geraten == zufallszahl)
            {
                System.out.println("Richtig");
            }
            else
            {
                System.out.println("Leider falsch! Die Zufallszahl war = " +  zufallszahl);
            }

            input.close();
        }
    }

