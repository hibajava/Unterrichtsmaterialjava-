package vererbung;

public class Katze extends Tier{
    public String miauen = "MIAU";

    public Katze(int alter) {
        // super-Schlüsselwort zum aufrufen des Eltern-Konstruktors
        // super bereitet alles für unser Katzen-Objekt vor, was vererbt wird
        super(alter);
        // Hier können noch Kind-spezifische Sachen ergänzt werden
        System.out.println("Die Katze macht... " + miauen);
    }
}
