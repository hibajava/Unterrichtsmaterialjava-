public class Main {
    public static void main(String[] args){
        // Versuch ein Objekt aus Krokodil zu erzeugen mit dem "new" Schlüsselwort
        // Nicht möglich
        // Krokodil krokodil = new Krokodil("schwarz");
        Leistenkrokodil leistenkrokodil = new Leistenkrokodil("braun mit schwarzen Flecken");
        System.out.println("Das Leistenkrokodil ist " + leistenkrokodil.getFarbe()); // Wir können auf die Getter/ Setter zugreifen
        leistenkrokodil.schwimmen(); // Wir können auf nicht-abstrakte Methoden zugreifen
        leistenkrokodil.zeigeInfoZumLebensraum(); // Diese abstrake Methode wurde in Leistenkrokodil IMPLEMENTIERT
        leistenkrokodil.imSchlammWaelzen();

        Nilkrokodil nilkrokodil = new Nilkrokodil("matschgrün mit dunkelgrünen Flecken");
        System.out.println("Das Nilkrokodil ist "+nilkrokodil.getFarbe());
        nilkrokodil.schwimmen();
        nilkrokodil.zeigeInfoZumLebensraum();
        nilkrokodil.imGrasLiegen();

        System.out.println("### EINE VARIABLE ###");
        // Wir können EINE Variable benutzen für unterschiedliche Objekte
        Krokodil krokodil = new Nilkrokodil("hellgrün mit grünen Flecken");
        krokodil.zeigeInfoZumLebensraum();
        krokodil = new Leistenkrokodil("braun mit dunkelbraunen Flecken");
        krokodil.zeigeInfoZumLebensraum();

        System.out.println();
        System.out.println("Ausgabe aller Elemente der Krokodil-Liste:");

        for(Krokodil k : Krokodil.krokodilListe){
            // Abfrage des Klassennamens
            System.out.println(k.getClass().getSimpleName());
            System.out.println(k.getFarbe());

            k.zeigeInfoZumLebensraum(); // Da diese Methode in der Superklasse definiert ist, verfügen auch alle Subklassen darüber und sie kann ohne Probleme in einer Schleife aufgerufen werden.

            // Methoden, die je nach Subklasse anders sind
            // imSchlammWaelzen
            // imGrasLiegen
            // Zur Ausgabe von Membern der Subklasse muss konvertiert (gecastet) werden:
            // Ist die k Variable vom Typ Leistenkrokodil?
            if(k instanceof Leistenkrokodil){
                // Falls ja, wandle die Variable von Krokodil zu Leistenkrokodil um, und rufe die Methode imSchlammWaelzen auf
                ((Leistenkrokodil) k).imSchlammWaelzen();
            }
            if(k instanceof Nilkrokodil){
                ((Nilkrokodil) k).imGrasLiegen();
            }

        }
    }
}
