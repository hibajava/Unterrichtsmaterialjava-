package assoziationen.aufgaben.lösung_5;

class Tier
{
    private final String art;
    private String name;

    public Tier(String art, String name)
    {
        this.art = art;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getArt()
    {
        return art;
    }
}
