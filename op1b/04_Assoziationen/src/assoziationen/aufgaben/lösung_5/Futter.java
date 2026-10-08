package assoziationen.aufgaben.lösung_5;

class Futter
{
    private String bezeichnung;
    private int kalorien;

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public int getKalorien()
    {
        return kalorien;
    }
    public Futter(String bezeichnung, int kalorien)
    {
        this.bezeichnung = bezeichnung;
        this.kalorien = kalorien;
    }
}
