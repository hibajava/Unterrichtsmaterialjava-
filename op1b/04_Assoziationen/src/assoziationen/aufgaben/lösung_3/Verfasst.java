package assoziationen.aufgaben.lösung_3;

import java.util.ArrayList;
import java.util.List;

// Variante mit Assoziationsklasse
class Verfasst
{
    public static final List<Verfasst> verfasstListe = new ArrayList<Verfasst>();
    private Autor autor;
    private Buch buch;

    public Autor getAutor()
    {
        return autor;
    }

    public Buch getBuch()
    {
        return buch;
    }

    public Verfasst(Autor autor, Buch buch)
    {
        this.autor = autor;
        this.buch = buch;
        verfasstListe.add(this);
    }

}
