package aufgaben.lösung_8;

import java.util.ArrayList;
import java.util.List;

class Villa extends Gebäude
{
    private static List<Villa> villaListe = new ArrayList<Villa>();

    public static void zeigeVillenListe()
    {
        System.out.println("\nListe aller Villen:");
        for (Villa v : villaListe)
            System.out.println("  " + v.getAdresse() + " (" + v.getPreis() + " Euro)");
    }

    public Villa()
    {
        this("Keine Angabe");
    }

    public Villa(String a)
    {
        this(a, 0);
    }

    public Villa(String a, int p)
    {
        super(a);
        villaListe.add(this);
        preis = p;
    }

    private int preis;

    public int getPreis()
    {
        return preis;
    }

    public void setPreis(int preis)
    {
        this.preis = preis;
    }
}
