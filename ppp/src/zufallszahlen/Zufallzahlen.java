package zufallszahlen;

import java.util.concurrent.ThreadLocalRandom;

import java.util.concurrent.ThreadLocalRandom;

public class Zufallzahlen
{
    public static void main(String[] args)
    {
        int zahl = ThreadLocalRandom.current().nextInt(1, 11);  //11 ist exklusiv!!

        System.out.println("Zahl: " + zahl);

    }
}

