package verzweigungen;

public class Einmaleins
{
    public static void main(String[] args)
    {
        // Äußere schleife
        for(int i=1; i<= 10; i++)
        {
            //Innere Schleife
            for (int j =1; j<= 10; j++)
            {
                int produkt= i*j;
                System.out.printf("%4d ", produkt);
            }
            System.out.println();
        }


    }
}
