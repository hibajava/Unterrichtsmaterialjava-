package arrays;

import java.util.Arrays;

public class GrößteZahl
{
    public static void main(String[] args)
    {
        int[] zahlen = {-35, -25, -56, -100, -44}; //Achtung: Nur negative Zahlen in dem Fall!!

        int max = zahlen[0];  //Dies ist allgemeingültig: Das Maximum anfangs mit dem Wert des ersten Array-Elements zu setzen.

        //Die größte Zahl durchs Vergleichen ermitteln
        for(int i = 0; i < zahlen.length; i++)
        {
            if(zahlen[i] > max)
            {
                max = zahlen[i];
            }
        }

        System.out.println("Die größte Zahl = " + max);

        //Alternative:
        Arrays.sort(zahlen);  //Aufsteigend!

        //Die größte Zahl wäre dann die Letzte im Array (mit dem Index zahlen.length -1)
        System.out.println("Die größte Zahl = " + zahlen[zahlen.length-1]);
    }
}
