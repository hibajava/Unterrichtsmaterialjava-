package aufgaben.lösung_7;

class Stadt
{
    private int einwohnerzahl;

    private String name;

    public String istGroßstadt()
    {
        if (einwohnerzahl >= 100000)
            return "Stimmt!";
        else
            return "Nein!";

        // Alternative mit Ternary Operator
        //return istGroßstadt == true ? "Stimmt!" : "Nein!";
    }

    public Stadt(int e, String n)
    {
        setEinwohnerzahl(e);
        name = n;
    }

    public int getEinwohnerzahl()
    {
        return einwohnerzahl;
    }

    public void setEinwohnerzahl(int einwohnerzahl)
    {
        this.einwohnerzahl = einwohnerzahl;
    }

    public String getName()
    {
        return name;
    }
}
