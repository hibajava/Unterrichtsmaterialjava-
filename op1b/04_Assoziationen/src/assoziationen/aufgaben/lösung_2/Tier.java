package assoziationen.aufgaben.lösung_2;

import java.util.ArrayList;
import java.util.List;

class Tier
{
    public static final List<Tier> tiere = new ArrayList<Tier>();

    private final int id;
    private String name;
    private Tierart art;

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public Tierart getArt()
    {
        return art;
    }

    public Tier(int id, String name, Tierart art)
    {
        this.id = id;
        this.name = name;
        this.art = art;
        tiere.add(this);
    }

}
