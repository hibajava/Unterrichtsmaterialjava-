package Verschachtelte_schleifen;

public class Nestedloop
{
    public static void main(String[] args)
    {
        //Die äußere Schleife
        for (int i = 1; i <= 3; i++)
        {
            System.out.println("Äußere Schleife: Runde " + i);

            //Die innere Schleife
            for (int j = 1; j <= 3; j++)
            {
                System.out.println("\tInnere Schleife: Runde" + j);
            }

            System.out.println("---------------------------");
        }
    }
}


