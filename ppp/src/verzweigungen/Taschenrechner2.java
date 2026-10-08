package verzweigungen;

import java.util.Scanner;

public class Taschenrechner2
{
    public static void main(String[] args)
    {
        //Für die Benutzereingabe
        Scanner input = new Scanner(System.in);

        //Eingabe der ersten Zahl
        System.out.println("Bitte eine erste Zahl eingeben:");
        double zahl1 = input.nextDouble();

        //Eingabe der Rechenoperation
        System.out.println("Welche Rechenoperation möchtest du durchführen (+, -, *, /)");
        char operation = input.next().charAt(0);

        //Eingabe der zweiten Zahl
        System.out.println("Bitte eine zweite Zahl eingeben:");
        double zahl2 = input.nextDouble();

        double ergebnis;

        //Die Switch-Anweisung
        switch(operation)
        {
            case '+':
                ergebnis = zahl1 + zahl2;
                break;

            case '-':
                ergebnis =  zahl1 - zahl2;
                break;

            case '*':
                ergebnis =  zahl1 * zahl2;
                break;

            case '/':
                if(zahl2 != 0)
                {
                    ergebnis = zahl1 / zahl2;
                }
                else
                {
                    System.out.println("Division durch null!!. Fehler");
                    return;  //beendet (in dem Fall) die (Main-)Methode, und somit das ganze Programm.
                }
                break;

            default:
                System.out.println("Ungültige Operation!");
                return;

        }

        System.out.printf("Ergebnis: %.2f",  ergebnis);

        input.close();

    }
}

