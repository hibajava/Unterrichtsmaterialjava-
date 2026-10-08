package farzeugfabrik;

public class Main
{
    public static void main(String[] args) {

        Auto a1 = new Auto();

        System.out.println("Die aktuelle geschwindigkeit= "+a1.geschwindigkeit);
        a1.bescheunigen(10);
         a1. anzahlTüeren = 5;

        System.out.println("Die aktuelle Geschwindigkeit = "+ a1.geschwindigkeit);
        System.out.println("Anzahl der Türen= "+ a1.anzahlTüeren);

        a1.hupen();
    }
}
