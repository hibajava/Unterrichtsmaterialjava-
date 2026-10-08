package verzweigungen;

import java.util.Scanner;

public class PositivNegativ
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte eine ganze Zahl eingeben");
        int zahl = input.nextInt();

        if(zahl > 0)
        {
            System.out.println("Zahl ist positiv");
        }
        else if(zahl < 0)
        {
            System.out.println("Zahl ist negativ");
        }
        else
        {
            System.out.println("Das ist eine null");
        }
    }
}


