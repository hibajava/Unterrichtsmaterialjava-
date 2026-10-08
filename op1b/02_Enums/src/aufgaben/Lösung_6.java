package aufgaben;
/* Level 1
Implementiere ein Enum „Muenzen“, das verschiedene Münzwerte repräsentiert.
Das Enum soll folgende Münzen enthalten: ZWEI_EURO, EIN_EURO, FUENFZIG_CENT, ZWANZIG_CENT, ZEHN_CENT, FUENF_CENT, ZWEI_CENT und EIN_CENT.

Jede Münze soll einen Wert haben. Der Wert einer 2-Euro-Münze ist 200 Cent, der Wert einer 1-Euro-Münze ist 100 Cent usw.

Implementiere im Enum eine Methode „getWert()“, die den Wert einer bestimmten Münze zurückgibt.

Erweitern Sie die bestehende Enumklasse um eine statische Methode, welche das Wechselgeld in Cent entgegennimmt
und dann in passenden Münzen umrechnet und das Wechselgeld dann als eine ArrayList von Muenzen zurückgibt.
*/

import java.util.ArrayList;

enum Muenzen
{
    ZWEI_EURO(200), EIN_EURO(100), FUENFZIG_CENT(50), ZWANZIG_CENT(20), ZEHN_CENT(10), FUENF_CENT(5), ZWEI_CENT(2),
    EIN_CENT(1);
    
    private int wert;
    private Muenzen(int wert)
    {
        this.wert = wert;
    }
    
    public int getWert()
    {
        return this.wert;
    }
    
   // Implementieren Sie den Algorithmus aus, um das Wechselgeld in passenden Muenzen zurückzugeben:
    public static ArrayList<Muenzen> berechneWechselgeldAlsMuenzen(int wertInCent)
    {
       ArrayList<Muenzen> wechselgeld = new ArrayList<>();
       
       for(int i = 0; i < Muenzen.values().length; i++)
       {
           Muenzen aktuelleMuenze = values()[i];
           
           if(aktuelleMuenze.getWert() <= wertInCent)
           {
               wechselgeld.add(aktuelleMuenze);
               wertInCent = wertInCent - aktuelleMuenze.getWert();
               i--;
           }
       }
        return wechselgeld;
    }
}

public class Lösung_6
{
    public static void main(String[] args)
    {

        ArrayList<Muenzen> berechnetesWechselgeld = Muenzen.berechneWechselgeldAlsMuenzen(322);

        for(Muenzen wechselgeldMuenze : berechnetesWechselgeld)
        {
            System.out.println(wechselgeldMuenze);
        }
    }
}
