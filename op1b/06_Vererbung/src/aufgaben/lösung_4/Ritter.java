package aufgaben.lösung_4;


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
