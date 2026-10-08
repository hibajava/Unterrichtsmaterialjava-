package methoden;

public class Addition {
    //Eigene Methode mit Rückgabewert
    public static int addition(int a, int b)
    {
        int summe = a + b;

        return summe;  //kürzer wäre direkt: return a + b;  ohne die Variable summe!
    }

    public static void main(String[] args)
    {
        //Den Rückgabewert der Methode in einer Variable speichern
        int ergebnis = addition(5, 3);

        //Und diese Variable weiterverwenden
        System.out.println(ergebnis);
    }
}

