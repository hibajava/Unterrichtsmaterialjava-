package assoziationen.aufgaben.lösung_2;

import java.util.ArrayList;

class Gehege
{
    private final int maxAnzahlTiere;
    private final ArrayList<Tier> tiere = new ArrayList<Tier>();
    private final ArrayList<Tierart> erlaubteTierarten = new ArrayList<Tierart>();

    public int getMaxAnzahlTiere()
    {
        return maxAnzahlTiere;
    }

    public ArrayList<Tier> getTiere()
    {
        return tiere;
    }

    public ArrayList<Tierart> getErlaubteTierarten()
    {
        return erlaubteTierarten;
    }

    public Gehege(int max)
    {
        maxAnzahlTiere = max;
    }

    public boolean addTier(Tier t)
    {
        if (erlaubteTierarten.contains(t.getArt()) && tiere.size() < maxAnzahlTiere)
        {
            tiere.add(t);
            return true;
        }
        return false;
    }

    public void zeigeTierListe()
    {
        for (Tier t : tiere)
            System.out.printf("%s ( %s )%n", t.getName(), t.getArt().getBezeichnung());
        System.out.println(getFuttermengeGesamt());
    }

    public double getFuttermengeGesamt()
    {
        double gesamt = 0;
        for (Tier t : tiere)
            gesamt += t.getArt().getFuttermenge();
        return gesamt;
    }
}
