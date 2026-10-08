
package methoden;

public class Quadrat
{
    public static int quadrat(int zahl)
    {
        return zahl * zahl;
    }

    public static void main(String[] args)
    {
        int ergebnis = quadrat(4);

        System.out.println("Das Quadrat ist: " + ergebnis);
    }
}
