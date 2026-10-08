package methoden;

public class GeradeZahl {
    //Unsere eigene Methode
    public static boolean istGerade(int zahl)
    {
        //Kurze Variante
        return zahl%2 == 0;  // zahl%2 == 0 ist ein boolescher Ausdruck  (s. Handout)

        //Lange Variante
//        if(zahl%2 == 0)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }

    }

    //Main-Methode
    public static void main(String[] args)
    {
        int testzahl = 25;

        boolean ergebnis = istGerade(testzahl);

        System.out.println(ergebnis);
    }
}


