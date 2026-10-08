
package tag10.aufgabe3;

/*
Klasse Punkt2D mit x- und y- Koordinate und üblichen Elementen
(Instanzvariable, Klassenvariable, Konstruktor, Instanzmethoden,
Klassenmethoden).
Eine Instanzmethode soll checken, ob ein Punkt in einem Rechteck (vgl. Aufgabe 1) enthalten ist.
 */
public class Punkt2D {
    // Instanzvariable
    private double x;
    private double y;

    // Klassenvariable
    public static final double MAX = 20.0; // Konstante

    public static int zähler; // automatisch 0 als Anfangswert

    // Konstruktoren
    public Punkt2D(double x, double y) {
        if (x > MAX || y > MAX) {
            throw new IllegalArgumentException("Zu groß");
        }
        this.x = x; // links: Instanzattribut, rechts: Parameter in Konstruktor
        this.y = y;
        zähler++;
    }

    public Punkt2D() {
        // ruft den oberen Konstruktor auf
        this(5.9, 4.3);
    }

    // Instantmethoden
    public void ausgabe() {
        // Stringdarstellung aus toString
        System.out.println(this.toString());
    }

    @Override  // Annotation: Wir überschreiben die Methode toString aus Object
    public String toString() {
        return "Punkt2D (%.4f, %.4f)".formatted(x, y);
    }

    public boolean checkObEnthalten(Rechteck rechteck) {
        // Annahme: Koordinate > 0
        boolean test1 = x <= rechteck.getBreite();
        boolean test2 = y <= rechteck.getHöhe();
        return test1 && test2;
    }

    // Klassenmethoden
    public static void main(String[] args) {
        Punkt2D p = new Punkt2D(Math.E, Math.PI);
        p.ausgabe();
        Punkt2D q = new Punkt2D(-2.345, 1.92);
        q.ausgabe();
        System.out.println("zähler = " + zähler);
        //Punkt2D r = new Punkt2D(8.2, 21.625); Exception

        Rechteck rechteck = new Rechteck(4, 5);
        boolean istEnthalten = p.checkObEnthalten(rechteck);
        System.out.println("istEnthalten = " + istEnthalten);

        Punkt2D s = new Punkt2D();
        s.ausgabe();
    }}