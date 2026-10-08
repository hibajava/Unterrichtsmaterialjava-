package autohaus;

public class Main
{
    public static void main(String[] args)
    {
        Auto auto1 = new Auto();
        auto1.farbe = "rot";
        auto1.geschwindigkeit = 20;
        auto1.attribut = 5;

        System.out.println("----Auto 1----");
        System.out.println("Farbe: "+ auto1.farbe );
        System.out.println("Geschwindigkeit: " +auto1.geschwindigkeit);

        auto1.beschleunigen();
        System.out.println("Geschwindigkeit: "+ auto1.geschwindigkeit);

        auto1.bremsen(50);
        System.out.println("Geschwindigkeit: "+ auto1.geschwindigkeit);

        Auto auto2 = new Auto();
        auto2.farbe = "blau";
        auto2.geschwindigkeit= 100;
        Auto.attribut = 7;

        System.out.println("----Auto 2----");
        System.out.println("Farbe: "+ auto2.farbe);
        System.out.println("Geschwindigkeit: "+auto2.geschwindigkeit);




    }
}
