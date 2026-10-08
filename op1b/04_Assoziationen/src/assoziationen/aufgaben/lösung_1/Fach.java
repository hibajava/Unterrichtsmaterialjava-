package assoziationen.aufgaben.lösung_1;

import java.util.ArrayList;
import java.util.List;

class Fach
{
    private int id;
    private String bezeichnung;

    private ArrayList<Klausur> klausuren = new ArrayList<Klausur>();

    public int getId()
    {
        return id;
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public List<Klausur> getKlausuren()
    {
        return klausuren;
    }

    public Fach(int id, String bezeichnung)
    {
        this.id = id;
        this.bezeichnung = bezeichnung;
    }
}
