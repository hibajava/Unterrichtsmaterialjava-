package assoziationen.aufgaben.lösung_6;

import java.util.ArrayList;

class Firma
{
    public static final ArrayList<Firma> firmen = new ArrayList<Firma>();
    private final ArrayList<Land> länder = new ArrayList<Land>();

    private final ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();
    private String name;

    public Firma(String name)
    {
        this.name = name;
        firmen.add(this);
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Land> getLänder()
    {
        return länder;
    }

    public ArrayList<Mitarbeiter> getMitarbeiter()
    {
        return mitarbeiter;
    }

    public void zeigeAlleLänder()
    {
        System.out.printf("Alle Länder in denen die Firma %s vertreten ist.", name);
        for (Land l : länder)
        {
            System.out.println(l.getName());
        }
    }

    public void zeigeAlleMitarbeiter()
    {
        System.out.printf("Alle Mitarbeiter die in Firma %s arbeiten.", name);
        for (Mitarbeiter m : mitarbeiter)
        {
            System.out.println(m.getName());
        }
    }
}
