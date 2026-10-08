package tag10.aufgabe3;

public class Rechteck {// package private: Klasse ist im ganzen package bekannt

    // Instanzvariable, Instanzattribute, (fields)
    private int breite;
    private int höhe;

    // Konstruktor
    public Rechteck(int b, int h) {
        breite = b;
        höhe = h;
    }

    // Instanzmethoden
    public void ausgabe() {
        System.out.printf("Rechteck Breite: %d Höhe: %d %n", breite, höhe);
    }

    // Kürzel: Alt+Einfügen, Code generieren, Getter

    public int getBreite() {
        return breite;
    }

    public int getHöhe() {
        return höhe;
    }
}


