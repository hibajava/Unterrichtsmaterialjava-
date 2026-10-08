package zufallszahlen;

import java.util.Random;

public class Münzwurf
{
    public static void main(String[] args)
    {
        //Erstellen ein Objekt der Klasse Random
        Random rand = new Random();

        boolean wurf = rand.nextBoolean();  //true or false

        if(wurf)  //Das entspricht: if(wurf == true)
        {
            System.out.println("Kopf");
        }
        else
        {
            System.out.println("Zahl");
        }
    }
}
