package aufgaben;

/* Level 1
 * Erstellen Sie eine Klasse 'Fahrzeug' zur Verwaltung Ihres Fuhrparks.
 * Ein Fahrzeug wird gespeichert mit den Attributen 'kennzeichen', 'lackierung', 'marke' und 'fahrzeugTyp'. Mögliche Fahrzeug-Typen sind 'MOTORRAD', 'PKW' und 'LKW'. Diese werden als Enum erstellt.
 * Alle Fahrzeuge werden in einer statischen Liste gespeichert. Ein Konstruktor initialisiert alle Eigenschaften und fügt das gerade erstellte Fahrzeug-Objekt der Liste hinzu.
 * In der Main erstellen Sie drei Fahrzeuge, für jeden Typ eins, und geben alle Eigenschaften in einer Schleife aus.
 */

import java.util.ArrayList;

enum FahrzeugTyp {
    MOTORRAD, PKW, LKW
}

public class Lösung_4
{
    public static void main(String[] args) {
        new Fahrzeug("SLS-1234", "Schwarz", "BMW", FahrzeugTyp.LKW);
        new Fahrzeug("GE-2345", "Blau", "Audi", FahrzeugTyp.PKW);
        new Fahrzeug("B-9876", "Rot", "Honda", FahrzeugTyp.MOTORRAD);

        for (Fahrzeug f : Fahrzeug.fahrzeugliste) {
            System.out.printf("%s %s %s %s%n", f.getKennzeichen(), f.getLackierung(), f.getMarke(), f.getFahrzeugTyp());
        }
    }
}

class Fahrzeug {
    public static final ArrayList<Fahrzeug> fahrzeugliste = new ArrayList<Fahrzeug>();

    private String kennzeichen;
    private String lackierung;
    private final String marke;
    private FahrzeugTyp fahrzeugTyp;

    public FahrzeugTyp getFahrzeugTyp()
    {
        return fahrzeugTyp;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    private void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getLackierung() {
        return lackierung;
    }

    private void setLackierung(String lackierung) {
        this.lackierung = lackierung;
    }

    public String getMarke() {
        return marke;
    }

    public Fahrzeug(String kennzeichen, String lackierung, String marke, FahrzeugTyp fahrzeugTyp) {
        setKennzeichen(kennzeichen);
        setLackierung(lackierung);
        this.marke = marke;
        this.fahrzeugTyp = fahrzeugTyp;

        fahrzeugliste.add(this); // 'this' verweist auf das aktuell erzeugte Objekt (die Speicheradresse des Objektes).
    }

}




