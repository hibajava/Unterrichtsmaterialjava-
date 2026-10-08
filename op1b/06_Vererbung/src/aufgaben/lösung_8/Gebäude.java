package aufgaben.lösung_8;

import java.util.ArrayList;
import java.util.List;

class Gebäude
{
    private static List<Gebäude> gebäudeListe = new ArrayList<Gebäude>();

    public static void zeigeGebäudeListe()
    {
        System.out.println("\nListe aller Gebäude:");
        for (Gebäude g : gebäudeListe)
            System.out.println("  " + g.adresse);
    }

    public Gebäude()
    {
        this("Keine Angabe");
    }

    public Gebäude(String adresse)
    {
        this.adresse = adresse;
        gebäudeListe.add(this);
    }

    private String adresse;

    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }
}
