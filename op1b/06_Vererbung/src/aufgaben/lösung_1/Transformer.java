package aufgaben.lösung_1;

class Transformer extends Robot
{
    private String faction;

    public String getFaction()
    {
        return faction;
    }

    public Transformer(String name, boolean isHostile, String faction)
    {
        super(name, isHostile);
        this.faction = faction;
    }

}
