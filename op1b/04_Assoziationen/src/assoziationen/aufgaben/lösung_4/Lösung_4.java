package assoziationen.aufgaben.lösung_4;

/* Level 2
    Erstellen Sie bitte zunächst die beiden folgenden Klassen 'Ritter' und 'Pferd' (Assoziation 1:1)

        Member
            Die Klasse Ritter besitzt die Attribute 'name', 'pferd' und eine statische Liste vom Typ Ritter
            Die Klasse Pferd besitzt die Attribute 'name', 'besitzer' und eine statische Liste vom Typ Pferd

            Die Klasse Ritter hat zwei Konstruktoren:
                a) Übergabewerte: Keine
                   Funktion: - Instanziiert ein neues Objekt p vom Typ Pferd
                             - Initialisiert Besitzer in p mit 'this' (also jenem Ritter, der gerade instanziiert wird)
                             - Initialisiert SeinPferd mit p
                             - this und p werden zu den entsprechenden Listen hinzugefügt
                b) Übergabewerte: 2 Strings (Name des Ritters und Name des Pferdes)
                   Funktion: - die gleichen Funktionen wie in a)
                             - Initialisierung des Ritter- und Pferde-Namens

            Die Klasse Pferd besitzt nur einen Standard-Konstruktor

        Im Main
            - Instanziieren Sie bitte zunächst einen Ritter (und sein Pferd) mithilfe des Parameter-LOSEN Konstruktors aus Ritter
              Initialisieren Sie bitte anschließend die Namen mit "Graf von Holzhausen" und "Lucy"
            - Instanziieren Sie daraufhin bitte einen weiteren Ritter (und sein Pferd) mithilfe des anderen Konstruktors
              Verwenden Sie als Übergabewerte bitte die Strings "Prinz von Doppelkeks" und "Schoko"
            - Geben Sie bitte anschließend alle Elemente der Ritterliste (und das jeweils zugehörigen Pferd) aus
            - Geben Sie zum Schluss auch alle Elemente der Pferdeliste (und den jeweils zugehörigen Besitzer) aus
*/

public class Lösung_4
{
    public static void main(String[] args)
    {
        Ritter ritter1 = new Ritter();
        ritter1.setName("Graf von Holzhausen");
        ritter1.getPferd().setName("Lucy");
        Ritter ritter2 = new Ritter("Prinz von Doppelkeks", "Schoko");

        System.out.println("Ausgabe Liste aller Ritter mit ihrem Pferd: ");
        for (Ritter r : Ritter.listeRitter)
        {
            System.out.println("Ritter: " + r.getName() + " / Pferd: " + r.getPferd().getName());
        }
        System.out.println("\n");
        System.out.println("Ausgabe Liste aller Pferde und ihre Ritter: ");
        for (Pferd p : Pferd.listePferd)
        {
            System.out.println("Pferd: " + p.getName() + " / Ritter: " + p.getBesitzer().getName());
        }
    }

}
