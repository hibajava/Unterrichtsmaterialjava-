package assoziationen.aufgaben.lösung_4;

import java.util.ArrayList;

class Ritter
{
    public static final ArrayList<Ritter> listeRitter = new ArrayList<Ritter>();
    private String name;
    private Pferd pferd;

    public Ritter()
    {
        Pferd p = new Pferd();
        p.setBesitzer(this);
        this.pferd = p;
        Pferd.listePferd.add(pferd);
        listeRitter.add(this);
    }

    public Ritter(String ritterName, String pferdName)
    {
        this();
        name = ritterName;
        pferd.setName(pferdName);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Pferd getPferd()
    {
        return pferd;
    }

    public void setPferd(Pferd pferd)
    {
        this.pferd = pferd;
    }
}
