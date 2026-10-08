package autogarage;

public class Main
{
    public static void main(String[] args)
    {
        Auto auto1= new Auto();
        // Attribute setzen

        auto1.marke = "VW";
        auto1.modell = "Golf";
        auto1.baujahr = 2025;
        auto1.farbe = "blau";

        auto1.zeigeInfo();
        System.out.println();

        //Objekt suto2 erstellen
        Auto auto2= new Auto();
        //Attribute setzen
        auto2.marke= "VW";
        auto2.modell= "X3";
        auto2.baujahr= 2026;
        auto2.farbe= "schwarz";
        auto2.zeigeInfo();


    }
}
