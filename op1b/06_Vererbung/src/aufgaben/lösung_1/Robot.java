package aufgaben.lösung_1;

class Robot
{
    private String name;
    private boolean isHostile;

    public String getName()
    {
        return name;
    }

    public boolean isHostile()
    {
        return isHostile;
    }

    public Robot(String name, boolean isHostile)
    {
        this.name = name;
        this.isHostile = isHostile;
    }
}
