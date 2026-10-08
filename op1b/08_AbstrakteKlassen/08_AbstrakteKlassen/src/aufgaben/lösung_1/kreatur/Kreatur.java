package aufgaben.lösung_1.kreatur;

abstract class Kreatur
{
    protected String name;

    public abstract void angreifen();

    protected Kreatur(String name)
    {
        this.name = name;
    }

}
