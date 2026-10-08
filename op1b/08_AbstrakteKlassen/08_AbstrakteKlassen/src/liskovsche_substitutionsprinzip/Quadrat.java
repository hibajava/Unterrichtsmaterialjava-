package liskovsche_substitutionsprinzip;

/**
 * Bezogen auf einzelne Methoden bedeutet das
 * Liskovsche Substitutionsprinzip, dass beim
 * Überschreiben einer Methode durch eine abgeleitete Klasse
 * die Vorbedingungen nur abgeschwächt
 * und die Nachbedingungen nur verstärkt werden
 * dürfen (siehe Design by Contract).
 */
// Diese Klasse VERLETZT das Liskovsche Substitutionsprinzip
public class Quadrat extends Rechteck {
    // ---------
    // |       |
    // |       | a
    // ---------
    // b

    public Quadrat(int seite){
        super(seite, seite);
        // super(10, 10);
    }

    // Spezielle Methoden, die nicht @Override benutzen
    // gehören nicht zum Prinzip

    @Override
    public void setBreite(int breite){
        // Verschärfen die Vorbedingung: Wir erlauben nur noch positive UND GERADE Zahlen
        // Ohne breite % 2 == 0 - diese Verschärfung
        // Hätten wir uns an das Prinzip gehalten :)
        if(breite >= 0 && breite % 2 == 0){
            // Nachbedingungen beziehen sich auf den Zustand NACH der Methodenausführung
            // Wenn diese geschwächt sind, geht das auch gegen das Liskovsche Substitutionsprinzip
            // Beispiel, wenn diese hier auskommentiert wären:
            this.breite = breite;
            this.laenge = breite;
        }
    }

    @Override
    public void setLaenge(int laenge){
        // Verschärfen die Vorbedingung: Wir erlauben nur noch positive UND GERADE Zahlen
        if(laenge >= 0 && laenge % 2 == 0){
            this.breite = laenge;
            this.laenge = laenge;
        }
    }
}
