package assoziationen.aufgaben.lösung_3;

import java.util.ArrayList;
import java.util.List;

class Buch
{
    private String titel;
    private List<Autor> autoren = new ArrayList<Autor>(); // Assoziation über Abhängigkeit

    public Buch(String titel)
    {
        setTitel(titel);
    }

    public String getTitel()
    {
        return titel;
    }

    private void setTitel(String titel)
    {
        this.titel = titel;
    }

    public List<Autor> getAutoren()
    {
        return autoren;
    }
}
