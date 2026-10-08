package aufgaben.lösung_1;

class Android extends Robot
{
    private boolean isHuman;

    public boolean isHuman()
    {
        return isHuman;
    }

    public Android(String name, boolean isHostile, boolean isHuman)
    {
        super(name, isHostile);
        this.isHuman = isHuman;
    }
}
