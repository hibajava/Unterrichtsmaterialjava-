package uebungsaufgaben;

public class Summe2
{
    public static void main(String[] args)
    {
        int zaehler = 1;

        System.out.printf("Montag ist der %d. Tag", zaehler);

        //Zähler um 1 erhöhen
        zaehler++;  // entspricht: zaehler = zaehler + 1;  oder zaehler += 1;

        System.out.printf("%nDienstag ist der %d. Tag", zaehler);

        zaehler++;

        System.out.printf("%nMittwoch ist der %d. Tag", zaehler);

        System.out.println("\nUnd jetzt wird es langsam langweilig");
    }
}
