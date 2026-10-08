/*
Gib die Zahlen von 1 bis 100 aus:
Ist eine Zahl durch 3 teilbar, gib statt der Zahl "Fizz" aus.
Ist eine Zahl durch 5 teilbar, gib statt der Zahl "Buzz" aus.
Ist eine Zahl durch 3 und 5 teilbar, gib "FizzBuzz" aus.
 */
package for_schleifen;

public class FizzBuzz
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 100; i++)
        {
            //Es ist wichtig, auf FizzBuzz erstmal zu überprüfen (Beispiel: 15 !)
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}