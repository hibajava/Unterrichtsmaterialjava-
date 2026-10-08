package assoziationen.aufgaben.lösung_4;

import java.util.ArrayList;
import java.util.List;

class Pferd
{
    public static final List<Pferd> listePferd = new ArrayList<Pferd>();
    private String name;
    private Ritter besitzer;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Ritter getBesitzer()
    {
        return besitzer;
    }

    public void setBesitzer(Ritter besitzer)
    {
        this.besitzer = besitzer;
    }
}
