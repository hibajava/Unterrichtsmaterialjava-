package aufgaben.lösung_9v2;

import java.util.ArrayList;

class Kunde
{
    public static final ArrayList<Kunde> kundeListe = new ArrayList<>();

    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Kunde(String name)
    {
        this.name = name;

        kundeListe.add(this);
    }

    @Override
    public String toString()
    {
        return "Kunde{" +
            "name='" + name + '\'' +
            '}';
    }
}
