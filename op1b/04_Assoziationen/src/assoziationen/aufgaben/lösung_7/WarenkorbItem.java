package assoziationen.aufgaben.lösung_7;

class WarenkorbItem
{
    private Artikel item;

    /**
     * Der sich im Warenkorb befindende Artikel.
     */
    public Artikel getItem()
    {
        return item;
    }

    private int anzahl;

    /**
     * Die Anzahl, wie oft der Artikel im Warenkorb liegt. Anzahl muss größer 0 sein.
     */
    public int getAnzahl()
    {
        return anzahl;
    }

    public void setAnzahl(int anzahl)
    {
        if (anzahl > 0)
            this.anzahl = anzahl;
    }

    /**
     * Gibt den Gesamtpreis des Artikels zurück. Berechnet durch Verkaufspreis * Anzahl.
     */
    public double getItemPreis()
    {
        return item.getVerkaufspreis() * anzahl;
    }

    /**
     * Gibt einen String mit Informationen über den Artikel im Warenkorb zurück.
     * @return Einen String aus Id, Bezeichnung, Verkaufspreis, Anzahl und Gesamtpreis.
     */
    public String getWarenkorbItemString()
    {
        return String.format(item.getArtikelString() + " - Anzahl: %d - Gesamtpreis: %.2f", anzahl, getItemPreis());
    }

    /**
     * Instanziiert ein neues Warenkorb-Item.
     * @param item Der Artikel im Warenkorb.
     * @param anzahl Die Anzahl, wie oft sich der Artikel im Warenkorb befindet.
     */
    public WarenkorbItem(Artikel item, int anzahl)
    {
        this.item = item;
        setAnzahl(anzahl);
    }
}