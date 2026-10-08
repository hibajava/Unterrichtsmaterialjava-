package assoziationen.aufgaben.lösung_6;

import java.util.ArrayList;
import java.util.List;

class Land
{
    public static final List<Land> länder = new ArrayList<Land>();
    private final List<Firma> firmen = new ArrayList<Firma>();
    private String name;

    public List<Firma> getFirmen()
    {
        return firmen;
    }

    public Land(String name)
    {
        this.name = name;
        länder.add(this);
    }

    public String getName()
    {
        return name;
    }

    public void zeigeAlleFirmen()
    {
        System.out.printf("Alle Firmen in %s:", name);
        for (Firma f : firmen)
        {
            System.out.println(f.getName());
        }
    }
}
