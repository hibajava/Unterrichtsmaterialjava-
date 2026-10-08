package verzweigungen;

import java.util.Scanner;

public class Zahl
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Gib ein zahl");
        int zahl = sc.nextInt();


        if(zahl%2==0)

            {
                System.out.println(" zahl ist: " + "gerada");
            }
        else

            {
                System.out.println("zahl ist: " + "nichtgerada");
            }
        sc.close();
        }
}
