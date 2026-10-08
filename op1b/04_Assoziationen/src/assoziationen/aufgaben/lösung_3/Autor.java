package assoziationen.aufgaben.lösung_3;

import java.util.ArrayList;
import java.util.List;

class Autor
{
    private String name;
    private List<Buch> bücher = new ArrayList<Buch>();// Assoziation über Abhängigkeit

    public String getName()
    {
        return name;
    }

    private void setName(String name)
    {
        this.name = name;
    }

    public List<Buch> getBücher()
    {
        return bücher;
    }

    public Autor(String name)
    {
        setName(name);
    }
}
