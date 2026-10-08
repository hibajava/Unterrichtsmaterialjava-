package methoden;

public class RueckgabeWert
{
    //Eingene Methode mit Rückgabewert
    public static int addition(int a, int b)
    {

        int summe = a + b ;

        return summe;
    }
    public static void main(String[] args)
    {
    int ergebnis = addition(5, 3);
        System.out.println(ergebnis);
    }
}
