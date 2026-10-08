package verzweigungen;

import java.util.Scanner;

public class Rabattbetrag
{
    public static void main(String[] args)
    {
        //Unsere Variablen
        double einkaufsWert;
        double rabattBetrag;

        //Die Benutzereingabe
        Scanner input = new Scanner(System.in);
        System.out.println("Der Einkaufswert?");
        einkaufsWert = input.nextDouble();

        //Ternary Operator oder Short Hand if-else
        rabattBetrag = (einkaufsWert >= 100) ? einkaufsWert * 0.1 : 0;

        System.out.printf("Der Rabattbetrag = %.2f €", rabattBetrag);

        input.close();
    }
}

