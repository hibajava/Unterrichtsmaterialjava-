package aufgabe4.lösung_4;


import java.util.ArrayList;
import java.util.List;

class Held
{
    public static final List<Held> heldListe = new ArrayList<Held>();

    protected Volk volk;
    protected String name;

    public Volk getVolk()
    {
        return volk;
    }

    public String getName()
    {
        return name;
    }

    public Held(String name, Volk volk)
    {
        this.name = name;
        this.volk = volk;

        heldListe.add(this);
    }
}
