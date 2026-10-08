package assoziationen.aufgaben.lösung_5;

import java.util.ArrayList;
import java.util.List;

class Fütterung
{
    public static final List<Fütterung> fütterungListe = new ArrayList<Fütterung>();

    private final double mengeInKg;

    private final Tier tier;
    private final Futter futter;

    public Fütterung(double m, Tier t, Futter f)
    {
        mengeInKg = m;
        tier = t;
        futter = f;
        fütterungListe.add(this);
    }

    public static List<Fütterung> getFütterungListe()
    {
        return fütterungListe;
    }

    public double getMengeInKg()
    {
        return mengeInKg;
    }

    public Tier getTier()
    {
        return tier;
    }

    public Futter getFutter()
    {
        return futter;
    }
}
