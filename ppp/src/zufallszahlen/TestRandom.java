package zufallszahlen;

import java.util.Random;

public class TestRandom
{
    public static void main(String[] args)
    {
        Random rand= new Random();

        int zufallszahl1= rand.nextInt(10,30);
        double zufallszahl2=  rand.nextDouble(10.5, 30);

        boolean b = rand.nextBoolean();
        System.out.printf("%.2f", zufallszahl2);
    }
}
