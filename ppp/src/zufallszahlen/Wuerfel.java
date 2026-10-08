package zufallszahlen;

import java.util.Random;

public class Wuerfel
{
    public static void main(String[] args)
    {
        //Erstellen eines Objekts der Klasse Random
        Random rand = new Random();

        //Variante 1:
        int wurf = rand.nextInt(1, 7);
        System.out.println("Wurf: " + wurf);

        //Variante 2:
        int wurf2 = rand.nextInt(6) + 1;  //Erstmal von 0 - 5. Und dann um 1 verschieben. Also, von 1 - 6
        System.out.println("Wurf: " + wurf2);
    }
}
