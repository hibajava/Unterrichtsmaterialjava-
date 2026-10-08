package do_while_schleifen;

import java.util.Scanner;

public class Aufgabe_02_01_02
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int geheimnummer, bestaetigung;

        do
        {
            System.out.println("Bitte eine neue Geheimnummer eingeben:");
            geheimnummer= sc.nextInt();

            System.out.println("Bitte bestätigen sie Ihre  neue Geheimnummer:");
            bestaetigung = sc.nextInt();

        }
        while(geheimnummer!= bestaetigung);

        System.out.println("Ihre neue Geheimnummer Lautet: "+ geheimnummer);
        sc.close();


    }

}

