package aufgaben.lösung_4;


class Magier extends Held
{
    private int wissen;

    public Magier(String name, Volk volk, int wissen)
    {
        super(name, volk);
        this.wissen = wissen;
    }

    public int getWissen()
    {
        return wissen;
    }
}
