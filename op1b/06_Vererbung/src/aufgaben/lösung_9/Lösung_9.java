package aufgaben.lösung_9;

/* Level 3
 * Sie betreiben eine altmodische Videothek und möchten ein Programm zur Verwaltung der Videos schreiben.
 * In Ihrem Klassenentwurf entscheiden Sie sich für drei Klassen.
 * Ausleihe - Dort wird abgespeichert, welches Video von welchem Kunden an welchem Datum ausgeliehen und wann das Video zurückgebracht wurde.
 * Video - Sie werden erstmal nur mit Titel gespeichert, weitere Informationen werden in dieser Phase des Projektes nicht benötigt.
 * Kunde - Werden zu diesem Zeitpunkt auch nur mit Name gespeichert.
 * Um alle Kunden, Videos und Ausleih-Vorgänge zu speichern, bekommt jede Klasse eine statische Liste, die ihre eigenen Objekt-Referenzen beinhalten.
 * Um ein Video ausleihen und zurückbringen zu können, implementieren Sie entsprechende Methoden in die Klasse Ausleihe. Dabei beachten Sie, dass jedes Video nur ein mal zu einem bestimmten Zeitpunkt ausgeliehen sein kann, denn jedes Video existiert physisch nur ein mal in Ihrem Bestand. Wird versucht, einen ungültigen Vorgang durchzuführen, wirft die Methode eine Exception.
 * Um die Informationen zu der Ausleihe bequem ausgeben zu können, überschreiben Sie die toString-Methoden.
 * Sie beachten bei der Entwicklung die Abkapselung und Trennung von Darstellung und Programmlogik.
 * In der Main testen Sie alle Funktionalitäten.
 *
 * Zeichen Sie dazu ein UML Klassendiagramm.
 */

public class Lösung_9
{
    public static void main(String[] args)
    {
        Video v = new Video("Jurassic Park");
        Kunde k = new Kunde("Alan Grant");

        // Kunde k leiht Video v aus.
        Ausleihe a;

        try
        {
            a =  Ausleihe.ausleihen(v, k);
            System.out.println(a + "\n");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() + "\n");
        }

        Kunde k2 = new Kunde("Ian Malcolm");

        // Kunde k2 versucht, Video v auszuleihen, wird eine Exception verursachen.
        try
        {
            a = Ausleihe.ausleihen(v, k2);
            System.out.println(a + "\n");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() + "\n");
        }

        // Video v wird zurückgegeben.
        a = Ausleihe.zurückgeben(v);
        System.out.println(a + "\n");

        // Kunde k2 versucht, Video v auszuleihen, was dieses Mal funktioniert.
        try
        {
            a = Ausleihe.ausleihen(v, k2);
            System.out.println(a + "\n");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() + "\n");
        }
    }
}

