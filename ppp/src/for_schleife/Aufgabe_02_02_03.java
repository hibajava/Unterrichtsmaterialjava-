package for_schleife;

import java.util.Scanner;

public class Aufgabe_02_02_03
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Ausschlusszahl: ");
        int nn= sc.nextInt();

        for(int i=1;i<=100; i++)
        {
            if(i == nn)
                continue;
            System.out.println(i);

        }

    }
}
