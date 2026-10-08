package aufgaben.lösung_5;


import java.util.ArrayList;
import java.util.List;

class Computer
{
    public static final List<Computer> computerListe = new ArrayList<Computer>();

    protected String hersteller;
    protected boolean istEingeschaltet;

    // Durch den protected Konstruktor können außerhalb dieses Paketes keine Objekte der Klasse erzeugt werden,
    // aber innerhalb der Vererbungsstruktur kann der Konstruktor trotzdem zur Konstruktor-Verkettung mit 'super' verwendet werden.
    protected Computer(String hersteller)
    {
        istEingeschaltet = false;
        this.hersteller = hersteller;
        computerListe.add(this);
    }

    public void einAusschalten()
    {
        istEingeschaltet = !istEingeschaltet; // Mit ! (Negation) kann der Boolesche Wert umgekehrt werden
    }
}
