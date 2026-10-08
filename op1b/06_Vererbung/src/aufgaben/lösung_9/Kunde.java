package aufgaben.lösung_9;

import java.util.ArrayList;
import java.util.List;

class Kunde
{
    public static final List<Kunde> kundeListe = new ArrayList<Kunde>();

    private final String name;

    public Kunde(String name)
    {
        this.name = name;
        kundeListe.add(this);
    }

    @Override
    public String toString()
    {
        return name;
    }
}
