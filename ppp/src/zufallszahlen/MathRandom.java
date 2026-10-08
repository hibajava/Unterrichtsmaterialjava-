package zufallszahlen;

public class MathRandom
{
    public static void main(String[] args)
    {
        //Jetzt möchten wir eine zufällige Fließkommazahl zwischen 10 und 20 (exklusiv)
        double rand = Math.random()*10 + 10;
        //Statt 0.0 bis 1.0  ,  0.0 bis 10.0,
        // Dann um 10 verschieben. Also, 10.0 bis 20.0
        System.out.println(rand);

        //Jetzt möchten wir eine zufällige (ganze) Zahl zwischen 1 und 10 (inklusiv)
        int zahl = (int)(Math.random()*10) + 1;  //1 - 11 (exklusiv) (ganze Zahlen)

        System.out.println(zahl);

    }
}