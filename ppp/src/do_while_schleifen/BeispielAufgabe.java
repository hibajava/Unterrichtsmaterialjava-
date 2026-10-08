package do_while_schleifen;

import java.util.Scanner;

public class BeispielAufgabe
{
    public static void main(String[] args)
    {
        int x;
        Scanner sc= new Scanner(System.in);

        do
        {
            System.out.println("geben Sie bitte eine ganze Zahl x?");
             x= sc.nextInt();


        }
        while ( x >=10);

            System.out.println("Gluckwunsch");

sc.close();





}}
