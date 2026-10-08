package verzweigungen;

import java.util.Scanner;

public class Switch
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Bitte eine Zahl zwischen 1 - 7 eingeben:");
        int wochentag = input.nextInt();

        //Switch-Anweisung
        switch (wochentag)
        {
            case 1:
                System.out.println("Montag");
                break;  //Sprunganweisung (unterbricht den weiteren Verlauf der Switch-Anweisung)
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Ungültiger Tag");
        }
    }
}
