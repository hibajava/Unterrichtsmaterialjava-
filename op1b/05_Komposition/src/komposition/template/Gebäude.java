package komposition.template;

import java.util.ArrayList;
import java.util.Iterator;

public class Gebäude
{
    // Innere Klasse, privater Konstruktor: Kann nicht außerhalb des Gebäudes instanziiert werden.
    // Das Gebäude regelt den Zugriff auf die Klasse 'Raum'.
    private static class Raum
    {
        private int raumNummer;

        // Achtung: Die Räume speichern Referenzen auf das Gebäude. Sollte es ein Raum schaffen, dem Gebäude zu entkommen, kann das Gebäude-Objekt nicht gelöscht werden, solange der Raum noch existiert.
        private Gebäude gebäude;

        public int getRaumNummer()
        {
            return raumNummer;
        }

        public Gebäude getGebäude()
        {
            return gebäude;
        }

        private Raum(int raumNummer, Gebäude gebäude)
        {
            this.raumNummer = raumNummer;
            this.gebäude = gebäude;
        }

        // Finalizer: Soll eigentlich nicht verwendet werden und ist ab Java 9 deprecated (veraltet). Wir verwenden ihn hier aber zur Veranschaulichung des Konzeptes.
        // Der Finalizer wird automatisch vom Garbage Collector aufgerufen.
        protected void finalize()
        {
            System.out.println("Der Raum mit der Nummer " + raumNummer + " wurde gelöscht!");
        }

    }

    // Möchte ich eine Komposition umsetzen, muss ich darauf achten, dass die Teile nicht außerhalb des Ganzen existieren. Hier dürfen die Räume nur innerhalb der Klasse 'Gebäude' verfügbar sein, damit sie gelöscht werden, wenn das Gebäude gelöscht wird.
    private final ArrayList<Raum> raumListe = new ArrayList<>();

    private String name;

    /*public ArrayList<Raum> getRaumListe()
    {
        return raumListe;
    }*/

    // Die Getter-Methode der RaumListe würde es den Entwicklern erlauben, Raum-Referenzen außerhalb des Gebäudes zu speichern. Als Alternative können wir eine Methode erstellen, die die Informationen der Räume als String zurückgibt.
    public String getRäume()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Iterator<Raum> iterator = raumListe.iterator(); iterator.hasNext();)
        {
            Raum r = iterator.next();
            sb.append(r.raumNummer);
            if (iterator.hasNext())
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void addRaum(int raumNummer)
    {
        // Raum-Objekt erzeugen und der Liste hinzufügen. Das Objekt existiert damit nur innerhalb der Liste.
        raumListe.add(new Raum(raumNummer, this));
    }

    // Jedes Gebäude benötigt mindestens einen Raum. Über den Konstruktor können wir Raum-Nummern übergeben und daraus Räume erzeugen.
    public Gebäude(String name, int... raumNummer) // 'int...' steht für "variable arguments" (varargs) und erlaubt es uns, für einen Parameter beliebig viele Argumente zu übergeben.
    {
        this.name = name;
        for (int i : raumNummer)
            addRaum(i);
    }

    // Finalizer zur Demonstration. Der Finalizer sollte in richtigen Programmen nicht verwendet werden!
    // Ist in Versionen nach Java 8 als "Deprecated" markiert und nicht mehr verwendbar.
    // Der Finalizer wird vom Garbage Collector automatisch aufgerufen, wenn das Objekt gelöscht wird.
    protected void finalize()
    {
        System.out.println("Das Gebäude mit dem Namen " + name + " wurde gelöscht!");
    }
}
