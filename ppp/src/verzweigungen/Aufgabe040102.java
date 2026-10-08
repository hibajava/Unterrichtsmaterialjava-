package verzweigungen;

import java.util.Scanner;

public class Aufgabe040102
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte Zeichen1 eingeben");
        char zeichen1 = input.next().charAt(0);
        //char zeichen1 = Character.toUpperCase(input.next().charAt(0));  //Wenn man groß und klein ignorieren möchte

        System.out.println("Bitte Zeichen2 eingeben");
        char zeichen2 = input.next().charAt(0);
        //char zeichen2 = Character.toUpperCase(input.next().charAt(0));

        if(zeichen1 == 'Q' &&  zeichen2 != 'Q')
        {
            System.out.println("Fall1");
        }
        //Falls umgekehrt zeichen1 KEIN ‘Q‘ ist UND zeichen2 ein ‘Q‘ ist,
        // dann soll „Fall 2“ erscheinen und das Programm enden.
        else if(zeichen1 != 'Q' &&  zeichen2 == 'Q')
        {
            System.out.println("Fall2");
        }
        else
        {
            System.out.println("Fall 3");
        }

        //Den Scanner wieder schließen
        input.close();
    }
}
