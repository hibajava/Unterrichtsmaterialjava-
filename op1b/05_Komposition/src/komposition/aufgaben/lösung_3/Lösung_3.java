package komposition.aufgaben.lösung_3;

/* Level 2
    Schreiben Sie ein Programm, das die Belegung eines Parkhauses verwaltet.

    Ein Parkhaus besteht aus Etagen, auf jeder Etage sind Parkplätze.
    Die Parkplätze sind Teil der Etage, die Etagen sind Teil des Parkhauses.

    Das Parkhaus stellt eine Methode zur Verfügung, über die der erste freie Platz ermittelt werden kann.
    Über das Parkhaus kann ein Parkplatz belegt und wieder freigegeben werden.
    Es kann auch die Anzahl der freien Plätze abgefragt werden.

    Jede Etage hat eine ID. Jeder Parkplatz hat eine ID und speichert, ob er gerade frei oder belegt ist.

    Zum Testen lassen Sie in der Main-Methode ein Parkhaus mit mehreren Etagen und Parkplätzen erzeugen und belegen in einer Schleife so lange alle Parkplätze, bis keine mehr verfügbar sind.

 */

public class Lösung_3
{
    public static void main(String[] args)
    {
        // Parkhaus mit Etagen erzeugen
        Parkhaus parkhaus = new Parkhaus();
        for (int i = 0; i < 4; i++)
            parkhaus.addEtage(20);

        System.out.println(parkhaus);

        // Alle freien Plätze füllen
        int frei;
        do
        {
            System.out.println("Anzahl frei: " + parkhaus.getAnzahlFreiePlätze());
            frei = parkhaus.findeErstenFreienPlatz();
            System.out.println("Freier Platz: " + frei);
            System.out.println("Konnte belegt werden: " + parkhaus.belegePlatz(frei));

        } while (frei != -1);

        System.out.println(parkhaus);
    }
}