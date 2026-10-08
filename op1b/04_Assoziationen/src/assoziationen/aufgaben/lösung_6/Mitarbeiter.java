package assoziationen.aufgaben.lösung_6;

import java.util.ArrayList;
import java.util.List;

class Mitarbeiter
{
    public static final List<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();
    private String name;
    private Firma firma;

    public Mitarbeiter(String name, Firma firma)
    {
        this.name = name;
        this.firma = firma;
        mitarbeiter.add(this);
    }

    public String getName()
    {
        return name;
    }

    public Firma getFirma()
    {
        return firma;
    }
}
