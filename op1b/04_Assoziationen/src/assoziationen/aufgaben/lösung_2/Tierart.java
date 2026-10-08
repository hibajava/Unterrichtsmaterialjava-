package assoziationen.aufgaben.lösung_2;

import java.util.ArrayList;
import java.util.List;

class Tierart
{
    public static final List<Tierart> tierarten = new ArrayList<Tierart>();

    private String bezeichnung;
    private double futtermenge;

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public double getFuttermenge()
    {
        return futtermenge;
    }

    public Tierart(String bezeichnung, double futtermenge)
    {
        this.bezeichnung = bezeichnung;
        this.futtermenge = futtermenge;
        tierarten.add(this);
    }
}
