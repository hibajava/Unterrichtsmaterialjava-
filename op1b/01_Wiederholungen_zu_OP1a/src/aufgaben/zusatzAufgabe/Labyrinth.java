package aufgaben.zusatzAufgabe;

import java.util.Arrays;

/**
 * Erstelle eine Klasse Labyrinth.
 *         Diese Klasse enthält ein mehrdimensionales Array (int[][]), das das Labyrinth darstellt.
 *         Jede Zelle im Array kann entweder frei (0) oder blockiert (1) sein.
 *         Implementiere eine Methode generateLabyrinth(int rows, int cols), die ein zufälliges Labyrinth generiert.
 */
public class Labyrinth {
    // Diese Klasse enthält ein mehrdimensionales Array (int[][]), das das Labyrinth darstellt.
    private int[][] labyrinth;

    public Labyrinth(int zeilenAnz, int spaltenAnz){
        this.labyrinth = generateLabyrinth(zeilenAnz, spaltenAnz);
    }

    // Jede Zelle im Array kann entweder frei (0) oder blockiert (1) sein.
    // Implementiere eine Methode generateLabyrinth(int rows, int cols), die ein zufälliges Labyrinth generiert.
    private int[][] generateLabyrinth(int zeilenAnz, int spaltenAnz){
        // Füllen des Labyrinths mit zufällig 0 oder 1
        int[][] ergebnis = new int[zeilenAnz][spaltenAnz];
        // Zufällig 0 gegen 1 ersetzen
        // Hier wären sehr viele andere Lösungen auch korrekt
        for(int i = 0; i < ergebnis.length; i++){
            for(int j = 0; j < ergebnis[i].length; j++){
                // Idee: Mit Math Random eine Zufallszahl generieren
                // Zwischen 0 und 1
                // if (kommazahl > 0.7)
                double zufallsZahl = Math.random();
                if(zufallsZahl > 0.7) {
                    ergebnis[i][j] = 1;
                }
            }
        }
        return ergebnis;
    }

    public int getZeilenAnzahl(){
        return this.labyrinth.length;
    }

    public int getSpaltenAnzahl(){
        return this.labyrinth[0].length;
    }

    public void druckeLabyrinth() {
        for(int[] zeile : labyrinth){
            System.out.println(Arrays.toString(zeile));
        }
    }

}
