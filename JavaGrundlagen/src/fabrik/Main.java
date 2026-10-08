package fabrik;

public class Main
{
    public static void main(String[] args)
    {
        Fahrzeug[] fahrzeuge = { new Auto(), new Moorrad(), new Fahrrad()};

         for(Fahrzeug f : fahrzeuge)
         {
            f.fahren(); //polymorpher Aufruf
         }

         Fahrzeug f1 = new Auto();
         //Trotzdem die eigene Methode hupen()aufrufen:

        ((Auto)f1).hupen();
    }}

