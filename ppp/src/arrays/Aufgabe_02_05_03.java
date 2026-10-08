/*
Das Programm soll ein Double-Array der Länge 30 wie folgt füllen:

Das erste Element soll mit 1,5 gefüllt werden, das zweite Element mit 2,5 und das dritte Element mit 3,5.

Danach wiederholt sich dies für die nächsten drei Elemente, denn das 4. Element soll dann wieder mit 1,5 gefüllt werden, das 5. Element wieder mit 2,5 und das 6. Element entsprechend mit 3,5.

… u.s.w. … .

Am Ende wird dann also auch das 28. Element mit 1,5, das 29. Element mit 2,5 und das 30. Element mit 3,5 gefüllt.

 */
package arrays;

public class Aufgabe_02_05_03
{
    public static void main(String[] args)
    {
        double[] array = new double[30];

        double wert1 = 1.5;
        double wert2 = 2.5;
        double wert3 = 3.5;

        //Variante 1:
        for(int i = 0; i < array.length; i += 3)
        {
            array[i] = wert1;
        }

        for(int i = 1; i < array.length; i += 3)
        {
            array[i] = wert2;
        }

        for(int i = 2; i < array.length; i += 3)
        {
            array[i] = wert3;
        }

        int zaehler = 0;
        for(double x : array)
        {
            System.out.println(x);
            zaehler++;
        }

        System.out.println(zaehler + " Elemente");

        //Variante 2:
        //ToDo
    }
}

