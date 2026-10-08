package Verschachtelte_schleifen;

import static java.lang.Thread.sleep;

public class Einmaleins
{
    public static void main(String[] args) throws InterruptedException
    {
        for(int i=1; i<= 10; i++)
        {
            for(int j=1; j<=10; j++)
            {
                System.out.printf("%4d" ,  i*j);
                sleep(500);
            }
            System.out.println();
            sleep(500);
        }

    }
}
