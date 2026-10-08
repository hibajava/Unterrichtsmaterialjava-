/*
Das Programm startet mit einer Schleife, in der der User die fünf Elemente eines Character-Arrays
mit beliebigen Zeichen füllen kann. Anschließend soll ein zweites Character-Array,
das ebenfalls genau 5 Elemente besitzt, mit den selben Zeichen gefüllt werden, allerdings in umgekehrter Reihenfolge!

Beispiel:

Angenommen der User füllte das erste Array wie folgt:
arrayA[0]=‘a‘
arrayA[1]=‘b‘
arrayA[2]=‘c‘
arrayA[3]=‘d‘
arrayA[4]=‘e‘

Dann soll entsprechend das zweite Array wie folgt gefüllt werden:
arrayB[0]=‘e‘
arrayB[1]=‘d‘
arrayB[2]=‘c‘
arrayB[3]=‘b‘
arrayB[4]=‘a‘

 */
package arrays;

import java.util.Scanner;

public class Aufgabe_02_05_02
{
    public static void main(String[] args)
    {
        char[] arrayA = new char[5];
        char[] arrayB = new char[5];

        //Scanner-Objekt für die Benutzereingabe
        Scanner sc = new Scanner(System.in);

        //arrayA befüllen:
        for(int i = 0; i < 5; i++)  //Allgemeingültiger, wenn wir mit array.length arbeiten!!
        {
            System.out.printf("Bitte das %d. Zeichen eingeben: ", i + 1);  //Achtung: i + 1
            arrayA[i] = sc.next().charAt(0);
        }

        //arrayB befüllen (umgekehrt!)
        for(int i = 4 ; i >= 0; i--)  //Allgemeingültiger, wenn wir mit array.length - 1 arbeiten!!
        {
            arrayB[4 - i] = arrayA[i];
        }

        //Zur Kontrolle
        System.out.println("Das sind die Elemente von ArrayB:");

        //for-each-Schleife
        for(char c :  arrayB)
        {
            System.out.println(c);
        }

        sc.close();
    }
}
