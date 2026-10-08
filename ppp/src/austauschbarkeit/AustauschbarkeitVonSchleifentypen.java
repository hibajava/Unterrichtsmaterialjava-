package austauschbarkeit;

public class AustauschbarkeitVonSchleifentypen
{
    public static void main(String[] args)
    {
        int zaehler, max = 10;

        for(zaehler = 1; zaehler <= max; zaehler++)
        {
            System.out.println(zaehler);
        }

        System.out.println("-----------");

        zaehler = 1;

        while(zaehler <= max)
        {
            System.out.println(zaehler);
            zaehler++;
        }

        System.out.println("-----------");

        zaehler = 1;

        do
        {
            System.out.println(zaehler);
            zaehler++;
        }
        while (zaehler <= max);
    }
}
