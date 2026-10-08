package labyrinth;

// Juwel eine Subklasse von Goldschatz
// Mit dem 'final'-Keyword geben wir Klassen an,
// dass wir NICHT weiter von Juwel erben können.
// Keine andere Klasse kann jetzt von Juwel abgeleitet werden.
// Juwel ist ein Goldschatz UND ein Schatz.
public final class Juwel extends Goldschatz {

    public Juwel(int x, int y, String name, int goldwert) {
        super(x, y, name, goldwert);
    }

    @Override
    public void anwenden(Abenteurer abenteurer, Labyrinth labyrinth){
        System.out.println("Uhhh shinyyy!");
    }

}

// Zum Ausprobieren:
//class Edelstein extends Juwel{
//
//}
