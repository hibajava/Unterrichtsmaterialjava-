package zufallszahlen;

import java.util.Random;

public class ÜbungsaufgabeTag_4_1
{
    public static void main(String[] args)
    {
        Random rand= new Random();
        int zufallszahlen= rand.nextInt(10,20);
        System.out.println(zufallszahlen);

    }
}
