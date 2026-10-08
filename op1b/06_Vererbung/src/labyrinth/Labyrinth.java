package labyrinth;

import java.util.ArrayList;
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
    private Abenteurer abenteurer;
    private final int rows;
    private final int cols;
    // TODO: Erweitere das Labyrinth um eine Liste von Schätzen, die der Abenteurer finden kann

    public Labyrinth(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.labyrinth = new int[rows][cols];
        generateLabyrinth(rows, cols);
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
                if(zufallsZahl > 0.6) {
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

    public void setAbenteurer(Abenteurer abenteurer) {
        this.abenteurer = abenteurer;
    }

    public void moveUp() throws BewegungNichtMoeglichException {
        // Aktuelle Position des Abenteurers
        int currentRow = abenteurer.getPosition()[0];
        int currentCol = abenteurer.getPosition()[1];

        // Zielposition, wenn sich der Abenteurer nach oben bewegt
        int targetRow = currentRow - 1;
        int targetCol = currentCol;

        // Überprüfen, ob die Bewegung innerhalb der Grenzen des Labyrinths ist und das Ziel frei ist
        if (targetRow >= 0 && labyrinth[targetRow][targetCol] == 0) {
            abenteurer.move(-1, 0); // Bewegung nach oben
        } else {
            throw new BewegungNichtMoeglichException("Bewegung nach oben nicht möglich!");
        }
    }

    public void moveDown() throws BewegungNichtMoeglichException {
        // Aktuelle Position des Abenteurers
        int currentRow = abenteurer.getPosition()[0];
        int currentCol = abenteurer.getPosition()[1];

        // Zielposition, wenn sich der Abenteurer nach unten bewegt
        int targetRow = currentRow + 1;
        int targetCol = currentCol;

        // Überprüfen, ob die Bewegung innerhalb der Grenzen des Labyrinths ist und das Ziel frei ist
        if (targetRow < rows && labyrinth[targetRow][targetCol] == 0) {
            abenteurer.move(1, 0); // Bewegung nach unten
        } else {
            throw new BewegungNichtMoeglichException("Bewegung nach unten nicht möglich!");
        }
    }

    public void moveLeft() throws BewegungNichtMoeglichException {
        // Aktuelle Position des Abenteurers
        int currentRow = abenteurer.getPosition()[0];
        int currentCol = abenteurer.getPosition()[1];

        // Zielposition, wenn sich der Abenteurer nach links bewegt
        int targetRow = currentRow;
        int targetCol = currentCol - 1;

        // Überprüfen, ob die Bewegung innerhalb der Grenzen des Labyrinths ist und das Ziel frei ist
        if (targetCol >= 0 && labyrinth[targetRow][targetCol] == 0) {
            abenteurer.move(0, -1); // Bewegung nach links
        } else {
            throw new BewegungNichtMoeglichException("Bewegung nach links nicht möglich!");
        }
    }

    public void moveRight() throws BewegungNichtMoeglichException {
        // Aktuelle Position des Abenteurers
        int currentRow = abenteurer.getPosition()[0];
        int currentCol = abenteurer.getPosition()[1];

        // Zielposition, wenn sich der Abenteurer nach rechts bewegt
        int targetRow = currentRow;
        int targetCol = currentCol + 1;

        // Überprüfen, ob die Bewegung innerhalb der Grenzen des Labyrinths ist und das Ziel frei ist
        if (targetCol < cols && labyrinth[targetRow][targetCol] == 0) {
            abenteurer.move(0, 1); // Bewegung nach rechts
        } else {
            throw new BewegungNichtMoeglichException("Bewegung nach rechts nicht möglich!");
        }
    }

    public boolean istAusgangErreicht() {
        // Aktuelle Position des Abenteurers
        int currentRow = abenteurer.getPosition()[0];
        int currentCol = abenteurer.getPosition()[1];

        // Position des Ausgangs
        int exitRow = rows - 1;
        int exitCol = cols - 1;

        // Überprüfen, ob der Abenteurer den Ausgang erreicht hat
        boolean ausgangErreicht = (currentRow == exitRow) && (currentCol == exitCol);

        return ausgangErreicht;
    }

    public void druckeLabyrinth() {
        System.out.println("Aktueller Stand des Labyrinth:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == abenteurer.getPosition()[0] && j == abenteurer.getPosition()[1]) {
                    System.out.print("A "); // Abenteurer
                } else if (labyrinth[i][j] == 1) {
                    System.out.print("# "); // Blockiert
                } else {
                    System.out.print(". "); // Frei
                }
                // TODO: Erweitere diese Methode, um Schätze anzuzeigen...
            }
            System.out.println();
        }
        System.out.println();
    }

}
