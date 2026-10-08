package assoziationen.aufgaben.lösung_1;

class Klausur
{
    private int id;
    private double note;
    private Fach thema;

    public int getId()
    {
        return id;
    }

    public double getNote()
    {
        return note;
    }

    public Fach getThema()
    {
        return thema;
    }

    public Klausur(int id, double note, Fach thema)
    {
        this.id = id;
        this.note = note;
        this.thema = thema;
        thema.getKlausuren().add(this);
    }
}
