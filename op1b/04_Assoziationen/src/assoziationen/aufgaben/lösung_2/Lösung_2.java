package assoziationen.aufgaben.lösung_2;

/* Level 2
    Führen Sie bitte die drei folgenden Klassen ein:
        a) Tierart
            Member:
                Liste vom Typ Tierart (öffentlich und statisch)
                String bezeichnung (private)
                double futtermenge (private)
                Konstruktor: Initialisiert die Felder bezeichnung und futtermenge, außerdem wird die aktuelle Instanz zur Liste hinzugefügt
        b) Tier
            Member:
                Liste vom Typ Tier (öffentlich und statisch)
                int id (private)
                String name (private)
                Tierart art (private)
                Konstruktor: Initialisiert die Felder Id, Name und Art, außerdem wird die aktuelle Instanz zur Liste hinzugefügt
        c) Gehege
            Member:
                Liste vom Typ Tierart (private) [Liste aller im Gehege zulässigen Tierarten]
                Liste vom Typ Tier (private) [Liste alle Tier(-Individuen), die im Gehege leben]
                int maxAnzahlDerTiere (private)
                Konstruktor: Initialisiert maxAnzahlDerTiere mit Hilfe eines entsprechenden Übergabewertes
                3 Methoden:
                    1.) Methodenname: addTier
                        Übergabewerte: 1 Tier t
                        Funktion: Fügt t zur Liste vom Typ Tier FALLS Tierart zulässig UND Gehege noch nicht voll
                        Rückgabewert: true FALLS t hinzugefügt werden konnte, SONST false
                    2.) Methodenname: zeigeTierListe
                        Übergabewerte: Keiner
                        Funktion: Gibt von allen Tieren des Geheges den Namen und dessen Tierart auf der Konsole aus
                        Rückgabewert: Keiner
                    3.) Methodenname: futtermengeGesamt
                        Übergabewerte: Keiner
                        Funktion: Ermittelt die Gesamtmenge des benötigten Futters für alle im Gehege lebenden Tier(-Individuen)
                        Rückgabewert: Gesamtmenge

        Im Main
            Implementieren Sie bitte folgende Tierarten (und deren jeweiligen Futtermengen)
              "Jaguar", 3.75
              "Leopard", 3.10
              "Schaf", 4.50
            Implementieren Sie bitte die folgenden Tier(-Individuen) (und deren jeweilige Id)
              1, "Shira" (Jaguar)
              2, "Shari" (Jaguar)
              3, "Lopa" (Leopard)
              4, "Shaun"  (Schaf)
            Führen Sie ferner bitte einen Gehege 'k' ein (in dem maximal 2 Tiere Platz finden)
            Tragen Sie bitte in der Liste aller zulässigen Tierarten in k die Tierarten Jaguar und Leopard ein
            Versuchen Sie bitte zur Liste aller Tier(-Individuen, die in k leben) folgende Tiere (in genau dieser Reihenfolge) einzuführen:
              Shira
              Shaun
              Lopa
              Shari
            (Ergebnis muss dann sein, dass im Gehege die Tiere Shira und Lopa erscheinen, da Shaun nicht zulässig ist und für Shari kein Platz mehr seien wird)
            Rufen Sie zum Abschluß bitte die Methode futtermengeGesamt() auf [Kontrollergebnis: 6,85 kg]
*/

public class Lösung_2
{

    public static void main(String[] args)
    {
        new Tierart("Jaguar", 3.75);
        new Tierart("Leopard", 3.10);
        new Tierart("Schaf", 4.50);

        new Tier(1, "Shira", Tierart.tierarten.get(0));
        new Tier(2, "Shari", Tierart.tierarten.get(0));
        new Tier(3, "Lopa", Tierart.tierarten.get(1));
        new Tier(4, "Shaun", Tierart.tierarten.get(2));

        Gehege k = new Gehege(2); // → In Gehege k sind maximal 2 Tiere erlaubt
        k.getErlaubteTierarten().add(Tierart.tierarten.get(0)); // → In Gehege k ist ein Jaguar erlaubt
        k.getErlaubteTierarten().add(Tierart.tierarten.get(1)); // → In Gehege k ist ein leopard erlaubt
        System.out.println(k.addTier(Tier.tiere.get(0))); // → In Gehege k wird der (erlaubte) Jaguar "Shira" hinzugefügt
        System.out.println(k.addTier(Tier.tiere.get(3))); // → In Gehege k wird das (NICHT erlaubte) Schaf "Shaun" NICHT hinzugefügt
        System.out.println(k.addTier(Tier.tiere.get(2))); // → In Gehege k wird der (erlaubte) Leopard "Lopa" hinzugefügt
        System.out.println(k.addTier(Tier.tiere.get(1))); // → In Gehege k wird der Jaguar "Shari" NICHT hinzugefügt (Gehege bereits voll)

        k.zeigeTierListe();
    }
}

