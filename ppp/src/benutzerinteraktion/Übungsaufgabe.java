package benutzerinteraktion;

import java.util.Scanner;

public class Übungsaufgabe
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("geben sie bitte Vorname?");
        String Vorname= input.nextLine();

        System.out.println("geben sie bitte nachname?");
        String nachname= input.nextLine();

        System.out.println(" Geben Sie bitte Alter?");
        int alter= input.nextInt();

        System.out.println("geben Sie bitte Größe? ");
        double größe = input.nextDouble();

        input.close();

    }
}
