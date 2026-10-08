package labyrinth;

// Superklasse für unsere Schätze im Labyrinth
// Sie bestimmt, dass ALLE Schätze eine Position im Labyrinth bekommen
// Außerdem haben ALLE Schätze später einen Namen
public class Schatz {
    // Attribute
    protected int x;
    protected int y;
    protected String name;

    // Konstruktor
    // Subklassen rufen diesen Konstruktor mit super(x, y, name) auf
    // TODO: Was passiert, wenn der Konstruktor protected ist?
    public Schatz(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    // Methoden
    // Code Fachsprache
    // Diese Methode gibt nichts zurück, nimmt aber zwei Parameter entgegen
    public void anwenden(Abenteurer abenteurer, Labyrinth labyrinth) {
        System.out.println("Ein Schatz " + this.name + " wird angewendet von " +
                abenteurer.getName() + " in einem Labyrinth...");
        // Aktuell nicht benötigt für Schatz-Vererbung
        // Kann später wieder reingenommen werden
        // labyrinth.druckeLabyrinth();
    }

    public int getPositionX(){
        return x;
    }

    public int getPositionY(){
        return y;
    }

    public String getName(){
        return name;
    }
}


// UML zu "anwenden"
// Schatz hat eine Beziehung zu Abenteurer und Labyrinth
// Assoziation "anwenden"
// Die Pfeilrichtung beschreibt die Navigierbarkeit im Code
// Wir können von Schatz jetzt auf Abenteurer (oder auf Labyrinth) zugreifen,
// aber nicht andersrum :)
// Schatz --> Abenteurer
// Schatz --> Labyrinth
// Ein Schatz kann mehrere Abenteurer entgegennehmen über "anwenden"
// Ein Schatz kann mehrere Labyrinthe entgegennehmen über "anwenden"
// Mehrere Abenteurer können von Schatz angewendet werden
// Mehrere Labyrinthe können von Schatz angewendet werden
// Multiplizität: Schatz *-->1 Abenteurer
// Multiplizität: Schatz *-->1 Labyrinth
