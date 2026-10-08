package template;

public class Abstrakt
{
    public static void main(String[] args)
    {
        // Versuch, ein Objekt vom Typ der abstrakten Klasse zu erzeugen:
        //Krokodil krokodil = new Krokodil("schwarz", 40); // Fehlermeldung: Es können keine Objekte einer abstrakten Klasse erzeugt werden.

        // Abgeleitete Klassen:
        Leistenkrokodil leistenkrokodil = new Leistenkrokodil("Grau bis graubraun oder goldbraun");
        System.out.println("Farbe des Krokodils: " + leistenkrokodil.getFarbe()); // getFarbe() wird von Krokodil geerbt.
        leistenkrokodil.schwimmen(); // schwimmen() wird von Krokodil geerbt.
        leistenkrokodil.zeigeInfoZumLebensraum(); // Die abstrakte Methode wurde in der Subklasse durch Überschreiben implementiert.
        leistenkrokodil.imSchlammLiegen(); // Eine in der Subklasse erstellte Methode.

        Nilkrokodil nilkrokodil = new Nilkrokodil("Oberseits dunkel-olivfarben, der Bauch ist einheitlich porzellanfarben.");
        System.out.println("Farbe des Krokodils: " + nilkrokodil.getFarbe());
        nilkrokodil.schwimmen();
        nilkrokodil.zeigeInfoZumLebensraum();
        nilkrokodil.imGrasLiegen();

        // Vorteil der Vererbung: Es kann eine Variable für unterschiedliche Objekte verwendet werden. Zum Beispiel bei Methodenparametern oder Klassenattributen.
        Krokodil krokodil = new Nilkrokodil("Graubraun");
        krokodil.zeigeInfoZumLebensraum();
        krokodil = new Leistenkrokodil("Dunkel-Olivfarben");
        krokodil.zeigeInfoZumLebensraum();

        System.out.println();
        System.out.println("Ausgabe aller Elemente der Krokodil-Liste:");

        for (Krokodil k : Krokodil.krokodilListe)
        {
            // Abfrage des Klassennamens (hier wird entweder Leistenkrokodil oder Nilkrokodil ausgegeben):
            System.out.println(k.getClass().getSimpleName());
            System.out.println(k.getFarbe());

            k.zeigeInfoZumLebensraum(); // Da diese Methode in der Superklasse definiert ist, verfügen auch alle Subklassen darüber und sie kann ohne Probleme in einer Schleife aufgerufen werden.
            // Die Methode wird aber je nach Subklasse ein unterschiedliches Verhalten zeigen, da sie dort überschrieben wurde.

            // Zur Ausgabe von Membern der Subklasse muss konvertiert (gecastet) werden:
            if (k instanceof Leistenkrokodil)
                ((Leistenkrokodil) k).imSchlammLiegen();
            if (k instanceof Nilkrokodil)
                ((Nilkrokodil) k).imGrasLiegen();


        }
    }
}
