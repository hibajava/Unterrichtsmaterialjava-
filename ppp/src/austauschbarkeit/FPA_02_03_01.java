package austauschbarkeit;

import java.util.Scanner;

public class FPA_02_03_01
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int i, max;

        System.out.println("Bitte ein Maximum eingeben:");
        max = sc.nextInt();

        //for-Schleife
        for(i = 1; i <= max; i++)
        {
            System.out.printf("%d ", i);
        }

        System.out.println();

        //while-Schliefe
        i = 1;
        while(i <= max)
        {
            System.out.printf("%d ", i);
            i++;
        }

        System.out.println();

        //do-while-Schleife
        i = 1;
        if(max > 0)
        {
            do
            {
                System.out.printf("%d ", i);
                i++;
            }
            while(i <= max);
        }
    }
}


