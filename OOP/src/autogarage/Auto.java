package autogarage;

public class Auto
{
    //Attribute
    String marke;
    String modell;
    int baujahr;
    String farbe;

    //Methoden
    public void zeigeInfo()//
    {
        System.out.println("Automarke: "+ marke);
        System.out.println("Modell: "+ modell);
        System.out.println("Baujahr: "+baujahr);
        System.out.println("Farbe: "+farbe);
    }
}
