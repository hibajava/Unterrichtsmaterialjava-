import java.util.ArrayList;

// Eine Klasse MUSS abstrakt sein, wenn sie mindestens eine abstrakte Methode hat...
public abstract class Krokodil {
    // Abstrakte Klassen sind oft Generalisierungs-Klassen
    // Sie sind nicht dazu da Instanzen zu bilden
    // Von dieser Klasse kann KEIN Objekt erzeugt werden
    // Sie sind dazu da Subklassen in einer Superklasse zusammenzufassen

    // Static-Attribute
    public static final ArrayList<Krokodil> krokodilListe = new ArrayList<>();

    // Attribute
    private String farbe; // nicht-statisch, privates Feld, wird über die Objektinstanz aufgerufen

    // Abstrakte Klassen haben normalerweise einen 'protected' Konstruktor.
    // Da von abstrakten Klassen keine Objekte erzeugt werden können,
    // aber die Kind-Klassen schon, können wir so die Attribute der
    // abstrakten Klasse für alle Subklassen füllen
    protected Krokodil(String farbe) {
        this.farbe = farbe;

        krokodilListe.add(this);
    }

    // Getter/ Setter
    // Nicht-abstrakte Methode
    public String getFarbe() {
        return farbe;
    }

    // ALLE Krokodile können schwimmen
    public void schwimmen(){
        System.out.println("~~ Ich schwimme im Wasser ~~");
    }

    // Abstrakte Methode:
    // Abstrakte Methoden haben keinen Funktionskörper { ANWEISUNGEN }
    // sondern nur: Rückgabewerte, Name, Parameterliste
    // NICHT ALLE Krokodile haben den gleichen Lebensraum
    public abstract void zeigeInfoZumLebensraum();
}
