package aufgaben.lösung_9v2;

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

public class Lösung_9v2
{
    public static void main(String[] args)
    {
        Video video = new Video("Jurassic Park", false);

        Kunde AlanGrant = new Kunde("Sam Neill");
        Kunde IanMalcolm = new Kunde("Jeff Goldblum");

        try
        {
            Ausleihe ausleihe = Ausleihe.ausleihen(AlanGrant, video);
            System.out.println(ausleihe);
        }
        catch (VideoException ex)
        {
            System.out.println(ex.getMessage());
        }

        try
        {
            Ausleihe ausleihe = Ausleihe.ausleihen(IanMalcolm, video);
            System.out.println(ausleihe);
        }
        catch (VideoException ex)
        {
            System.out.println(ex.getMessage());
        }

        try
        {
            Ausleihe ausleihe = Ausleihe.sucheAusleihe(AlanGrant, video);
            ausleihe.zurückbringen();
            System.out.println(ausleihe);
        }
        catch (VideoException ex)
        {
            System.out.println(ex.getMessage());
        }

        try
        {
            Ausleihe ausleihe = Ausleihe.sucheAusleihe(AlanGrant, video);
            ausleihe.zurückbringen();
            System.out.println(ausleihe);
        }
        catch (VideoException ex)
        {
            System.out.println(ex.getMessage());
        }

        try
        {
            Ausleihe ausleihe = Ausleihe.ausleihen(IanMalcolm, video);
            System.out.println(ausleihe);
        }
        catch (VideoException ex)
        {
            System.out.println(ex.getMessage());
        }

        System.out.println(Ausleihe.ausleiheListe);
    }
}
