package aufgaben.lösung_5;

import java.util.ArrayList;
import java.util.List;

class Büro
{
    public static final List<Büro> büroListe = new ArrayList<Büro>();
    private List<Computer> computerListe = new ArrayList<Computer>();
    private int nummer;

    public Büro(int nummer)
    {
        this.nummer = nummer;
        büroListe.add(this);
    }

    public List<Computer> getComputerListe()
    {
        return computerListe;
    }

    public void setComputerListe(Computer k)
    {
        computerListe.add(k);
    }

    public int getNummer()
    {
        return nummer;
    }

    public void setNummer(int nummer)
    {
        this.nummer = nummer;
    }
}
