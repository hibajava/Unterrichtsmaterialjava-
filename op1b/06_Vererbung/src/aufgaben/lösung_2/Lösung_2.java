/* Level 1
 * Erstellen Sie die Klasse "Song" mit den Attributen
 * String "titel", int "dauerSekunden", String "interpret".
 * Überschreiben Sie die ToString()-Methode, welche einen String bestehend aus Titel, Interpret und der Dauer im Format Minuten : Sekunden zurückgeben soll.
 * Über einen Konstruktor sollen die Attribute initialisiert werden.
 *
 * Erstellen Sie in der Main einen Song geben Sie die gespeicherten Informationen mithilfe der toString()-Methode aus.
 */
package aufgaben.lösung_2;

import javax.swing.*;

public class Lösung_2
{

    private JPanel imagePanel;
    private JPanel panel;

    public static void main(String[] args)
    {
        Song song = new Song("Krähenkönig", 262, "Subway To Sally");

        System.out.println(song.toString());

    }
}


