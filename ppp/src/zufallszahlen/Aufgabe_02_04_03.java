package zufallszahlen;
import java.util.Random;
public class Aufgabe_02_04_03
{
    public static void main(String[] args)
    {
      Random rand = new Random();

      int i, zahl, max =1;

      for(i=1 ; i<= 10; i++)
      {
          zahl= rand.nextInt(1,101);
          System.out.println("Die aktuelle Zufallszahl = "+ zahl);

          if(zahl> max)
          {
              max = zahl;
          }
      }
        System.out.println("Das Maximum= "+ max);
    }
}
