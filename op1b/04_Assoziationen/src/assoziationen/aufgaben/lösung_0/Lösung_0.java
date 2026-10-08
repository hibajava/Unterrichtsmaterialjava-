package assoziationen.aufgaben.lösung_0;

/* Level 1
 * Zwei Klassen:
 *  "Song" mit dem Attribut "titel"
 *  "Interpret" mit dem Attribut "name"
 * Implementieren Sie die Assoziation der beiden Klassen und stellen Sie eine bidirektionale Navigierbarkeit her.
 * Dazu müssen Sie den Klassen weitere Felder hinzufügen.
 * (Gehen Sie davon aus, dass jeder Song nur einen Interpreten, ein Interpret aber mehrere Songs hat)
 * Testen Sie das Programm im Main.
 */

public class Lösung_0 {

    public static void main(String[] args) {

        Interpret i1 = new Interpret("Dethklok");
        Song s1 = new Song("Murmaider",i1);
        Song s2 = new Song("Go Into The Water",i1);
        Song s3 = new Song("Thunderhorse",i1);

        for (Song s : i1.getSongs())
        {
            System.out.println(s.getTitel() + "  " + s.getInterpret().getName());
        }
    }
}

