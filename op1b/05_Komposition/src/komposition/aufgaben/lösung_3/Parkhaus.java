package komposition.aufgaben.lösung_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Parkhaus
{
    private static final Random random = new Random();

    private final List<Etage> etagen = new ArrayList<>();

    /**
     * Findet den ersten freien Parkplatz im Parkhaus und gibt die ID zurück.
     * IDs beginnen bei 101 für den ersten Parkplatz in der ersten Etage.
     * Wird kein freier Platz gefunden, wird -1 zurückgegeben.
     *
     * @return Die ID des Parkplatzes.
     */
    public int findeErstenFreienPlatz()
    {
        for (Etage e : etagen)
        {
            int id = e.findeErstenFreienPlatz();
            if (id != -1)
                return id;
        }
        return -1;
    }

    /**
     * Belegt den Parkplatz mit der angegebenen ID.
     *
     * @return False, wenn id < 0, sonst True.
     */
    public boolean belegePlatz(int id)
    {
        if (id < 0)
            return false;

        // Jede Etage und jeder Platz speichert zwar die ID, aber der Parkplätz lässt sich einfacher finden, wenn id / 100 - 1 und id % 100 - 1 gerechnet wird. Dies entspricht dann nämlich den Positionen in den jeweiligen Listen.
        Etage.Parkplatz p = etagen.get(id / 100 - 1).getParkplätze().get(id % 100 - 1);
        p.setFrei(false);
        return true;
    }

    /**
     * Gibt einen Parkplatz mit der angegebenen ID frei.
     *
     * @return False, wenn id < 0, sonst True.
     */
    public boolean gebePlatzFrei(int id)
    {
        if (id < 0)
            return false;

        Etage.Parkplatz p = etagen.get(id / 100 - 1).getParkplätze().get(id % 100 - 1);
        p.setFrei(true);
        return true;
    }

    /**
     * Gibt die Anzahl der freien Plätze zurück.
     */
    public int getAnzahlFreiePlätze()
    {
        int anzahl = 0;
        for (Etage e : etagen)
        {
            for (Etage.Parkplatz p : e.getParkplätze())
            {
                if (p.isFrei())
                    anzahl++;
            }
        }

        return anzahl;
    }

    /**
     * Fügt eine Etage mit der angegebenen Anzahl an Parkplätzen hinzu. Die Belegung wird dabei zufällig entschieden.
     */
    public void addEtage(int anzahlPlätze)
    {
        Etage e = new Etage(etagen.size() + 1);
        for (int i = 0; i < anzahlPlätze; i++)
        {
            e.addParkplatz(random.nextBoolean()); // In der Realität würde das natürlich nicht zufällig bestimmt werden.
        }
        etagen.add(e);
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Parkhaus\n");
        sb.append("Etagen:\n");
        for (Etage e : etagen)
            sb.append(e).append("\n");
        return sb.toString();
    }

    // Innere Klasse, weil Komposition.
    static class Etage
    {
        private final int id;
        private final List<Parkplatz> parkplätze = new ArrayList<>();

        public Etage(int id)
        {
            this.id = id;
        }

        public List<Parkplatz> getParkplätze()
        {
            return new ArrayList<>(parkplätze);
        }

        /**
         * Findet den ersten freien Platz auf dieser Etage und gibt die ID zurück.
         * Kann kein freier Platz gefunden werden, wird -1 zurückgegeben.
         */
        public int findeErstenFreienPlatz()
        {
            for (Parkplatz p : parkplätze)
                if (p.isFrei())
                    return p.getId();

            return -1;
        }

        @Override
        public String toString()
        {
            return "Etage " +
                "id=" + id +
                "\nParkplätze=" + parkplätze;
        }

        /**
         * Fügt dieser Etage einen Parkplatz mit angegebener Belegung hinzu.
         */
        public void addParkplatz(boolean frei)
        {
            parkplätze.add(new Parkplatz(this.id * 100 + parkplätze.size() + 1, frei));
        }

        // Innere Klasse, weil Komposition.
        static class Parkplatz
        {
            private final int id;
            private boolean frei;

            public Parkplatz(int id, boolean frei)
            {
                this.id = id;
                this.frei = frei;
            }

            public int getId()
            {
                return id;
            }

            public boolean isFrei()
            {
                return frei;
            }

            public void setFrei(boolean frei)
            {
                this.frei = frei;
            }

            @Override
            public String toString()
            {
                return "{" +
                    "id=" + id +
                    ", frei=" + frei +
                    '}';
            }
        }
    }
}
