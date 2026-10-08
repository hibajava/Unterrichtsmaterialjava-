package labyrinth;

// Englischer Begriff für Vererbung: Inheritance
// Goldschatz ist die Subklasse von Schatz
// Goldschatz IST EIN Schatz
// Syntax ist IMMER: class Subclass extends Superclass
public class Goldschatz extends Schatz{

    // NEUE Attribute für die Subklasse
    protected int goldwert;

    // Konstrutor der Subklasse
    public Goldschatz(int x, int y, String name, int goldwert){
        super(x, y, name);
        this.goldwert = goldwert;
    }

    // Methoden
    public int getGoldwert(){
        return this.goldwert;
    }

    @Override
    public void anwenden(Abenteurer abenteurer, Labyrinth labyrinth) {
        System.out.println("Ich bin ein Goldschatz und überschreibe das Anwenden!");
    }

}
