package Verschachtelte_schleifen;

public class Sternchen
{
    public static void main(String[] args)
    {
        //Äußere Schleife (für die Zeilen)
        for(int i = 1; i <= 7; i++)
        {
            //Innere Schleife (für die Spalten)
            for(int j = 1; j <= 5; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
