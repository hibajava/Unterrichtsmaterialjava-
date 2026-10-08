package aufgabe4.lösung_4;


import aufgaben.lösung_4.Held;

class Ritter extends Held
{
    private int stärke;

    public Ritter(String name, Volk volk, int stärke)
    {
        super(name, volk);
        this.stärke = stärke;

    }

    public int getStärke()
    {
        return stärke;
    }

}
