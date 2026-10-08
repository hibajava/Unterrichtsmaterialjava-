package aufgabe4.lösung_4;


import aufgaben.lösung_4.Held;

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
