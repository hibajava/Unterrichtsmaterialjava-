package autohaus;

public class Auto
{
    String farbe;
    int geschwindigkeit;
    static int attribut;

    // Methoden
    public void beschleunigen()
    {
        geschwindigkeit +=10;
    }

    public void bremsen(int b)
    {
        geschwindigkeit -=b;
    }
    public static void zaehlen()
    {
        attribut++;
    }
}
