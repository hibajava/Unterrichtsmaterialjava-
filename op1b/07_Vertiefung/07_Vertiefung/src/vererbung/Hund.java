package vererbung;

// Die Hund Klasse erbt vom Tier das Alter Attribut
// Sie erweitert das Tier noch um den String bellen
// Hund ist die Kind-Klasse von Tier
// Tier ist die Eltern-Klasse von Hund
// Hund ist die speziellere Klasse
// Tier ist die generellere Klasse
public class Hund extends Tier{
    public String bellen = "WUFF";

    public Hund(int alter) {
        // super-Schlüsselwort zum aufrufen des Eltern-Konstruktors
        super(alter);
        System.out.println("Der Hund macht... " + bellen);
    }
}
