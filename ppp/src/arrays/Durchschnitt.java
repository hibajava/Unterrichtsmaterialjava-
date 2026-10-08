package arrays;

public class Durchschnitt
{
    public static void main(String[] args)
    {
        int[] zahlen = {2 , 9, 15, 17, 33};

        int summe = 0;
        double durchschnitt;  //Weil der Durchschnitt von ganzen Zahlen eine Fließkommazahl sein könnte!

        //Erstmal die Summe bilden
        for(int i : zahlen)
        {
            summe += i;
        }

        //Dann der Durchschnitt
        durchschnitt = (double)summe/zahlen.length;   //Type-Casting (double), sonst ganzzahlige Division!

        System.out.println(durchschnitt);
    }
}
