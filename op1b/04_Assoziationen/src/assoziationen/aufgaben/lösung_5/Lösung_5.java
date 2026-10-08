package assoziationen.aufgaben.lösung_5;

/* Level 2
    Führen Sie bitte zunächst die folgenden Klassen ein:
        Tier
            Attribute: art und name
        Futter
            Attribute: bezeichnung und kalorien
        Fütterung
            Attribute: static-Liste vom Typ Fütterung, in der alle Fütterungen gespeichert werden
            mengeInKg, tier und futter

    Führen Sie bitte die folgenden Objekte ein: (Attributwerte, die im folgenden nicht mitgeteilt werden, können von Ihnen frei gewählt werden)
        Tier
            Blacky
            Lassie
        Futter
            Trockenfutter
            Heu
            Fleisch

     Es gelten die folgenden Assoziationen:
        Trockenfutter darf an Blacky (Pferd) und Lassie (Hund) verfüttert werden
        Heu nur an das Pferd
        Fleisch nur an den Hund

    Für die Klasse Fütterung wird ferner verlangt:
        In Fütterung ist ein Konstruktor implementiert, für den gilt:
        1) alle Attributwerte werden durch die Übergabewerte des Konstruktors gefüllt
        2) die Fütterungsliste wird durch das neue (also gerade vom Konstruktor erzeugte) Objekt ergänzt [Listenname.Add(this)]

    Lassen Sie bitte anschließend im Main (mindestens) die beiden folgenden Kontrollausgaben ausführen:
        a) Alle Futtersorten von Blacky
        b) Alle Tiere an die Trockenfutter verfüttert wurde/wird
*/

public class Lösung_5
{

    public static void main(String[] args) {
        Tier Blacky = new Tier("Pferd", "Blacky");
        Tier Lassie = new Tier("Hund", "Lassie");
        Futter Trocken = new Futter("Trockenfutter", 300);
        Futter Heu = new Futter("Heu", 200);
        Futter Fleisch = new Futter("Fleisch", 400);

        new Fütterung(3, Blacky, Trocken);
        new Fütterung(2, Blacky, Heu);
        new Fütterung(2, Lassie, Trocken);
        new Fütterung(1, Lassie, Fleisch);

        // Kontrollausgaben:
        System.out.println("Alle Futtersorten von Blacky:");
        for (Fütterung tf : Fütterung.fütterungListe) {
            if (tf.getTier().getName().equals("Blacky"))
                System.out.println(tf.getFutter().getBezeichnung());
        }

        System.out.println("\nAlle Tiere an die Trockenfutter verfüttert wird:");
        for (Fütterung tf : Fütterung.fütterungListe) {
            if (tf.getFutter().getBezeichnung().equals("Trockenfutter"))
                System.out.println(tf.getTier().getName());
        }
    }
}