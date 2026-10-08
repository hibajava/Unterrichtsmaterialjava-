package template;

import java.util.ArrayList;

// Eine Klasse muss abstrakt sein, wenn sie mindestens eine abstrakte Methode hat.
public abstract class Krokodil
{
    // Abstrakte Klassen werden häufig als Generalisierungs-Klasse betrachtet, die in der Regel dazu da sind, Subklassen in einer gemeinsamen Superklasse zusammenzufassen.
    // Von diesen Klassen sollen aber keine Instanzen gebildet werden können.

    // Diese Klassen können dann, zum Beispiel, zur Bildung von Listen verwendet werden, in die dann Subklassen-Objekte zur Iteration gespeichert werden können.
    public static final ArrayList<Krokodil> krokodilListe = new ArrayList<>(); // statische Liste, für alle Krokodile gleich und wird über den Klassenbezeichner aufgerufen.

    private String farbe; // Nicht-statisches Attribut (privates Feld), wird über die Objektinstanz aufgerufen.


    public String getFarbe() // nicht-abstrakte Methode.
    {
        return farbe;
    }

    public void schwimmen() // nicht-abstrakte Methode.
    {
        System.out.println("Ich schwimme im Wasser.");
    }

    // Abstrakte Methode:
    /**
     * Diese Methode gibt Informationen zum Lebensraum des Krokodils auf der Konsole aus.
     */
    public abstract void zeigeInfoZumLebensraum(); // Abstrakte Methoden haben keinen Funktionskörper, sondern nur: Rückgabetyp / Name / Parameterliste

    //private abstract void methode(); // Fehler -> private abstrakte Methoden sind nicht erlaubt!

    // Abstrakte Klassen haben normalerweise einen 'protected' Konstruktor.
    // Da von abstrakten Klassen keine Objekte erzeugt werden können, wird dies über 'protected' Konstruktoren verdeutlicht.
    protected Krokodil(String farbe)
    {
        this.farbe = farbe;// 'this' referenziert das Objekt, von dem diese Methode aufgerufen wird.

        krokodilListe.add(this); // das gerade erstellte Objekt (this created object) der Liste hinzufügen.
    }
}
