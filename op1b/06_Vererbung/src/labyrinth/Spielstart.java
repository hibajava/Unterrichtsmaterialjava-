package labyrinth;

import java.util.Scanner;

/**
 * Hintergrundgeschichte: Du bist ein Abenteurer in einer digitalen Welt und musst einen verlorenen Schatz
 * aus einem mehrdimensionalen Array-Labyrinth bergen.
 * Auf deinem Weg durch das Labyrinth triffst du auf verschiedene Herausforderungen,
 * die du mithilfe von Klassen, Collections und dem Umgang mit Exceptions meistern musst.
 */
public class Spielstart {
    public static void main(String[] args) {
        Labyrinth labyrinth = new Labyrinth(5, 5);
        Abenteurer abenteurer = new Abenteurer("Indiana Jones");
        labyrinth.setAbenteurer(abenteurer);

        // TODO: Zufällige Schätze hinzufügen

        Scanner scanner = new Scanner(System.in);
        while (!labyrinth.istAusgangErreicht()) {
            labyrinth.druckeLabyrinth();
            System.out.println("Inventar: " + abenteurer.getInventar());
            System.out.print("Bewege den Abenteurer (WASD): ");
            String input = scanner.nextLine().toUpperCase();

            try {
                switch (input) {
                    case "W":
                        labyrinth.moveUp();
                        break;
                    case "A":
                        labyrinth.moveLeft();
                        break;
                    case "S":
                        labyrinth.moveDown();
                        break;
                    case "D":
                        labyrinth.moveRight();
                        break;
                    default:
                        System.out.println("Ungültige Eingabe! Bitte W, A, S oder D verwenden.");
                        continue;
                }
                // TODO: Habe ich einen Schatz gefunden?
            } catch (BewegungNichtMoeglichException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Herzlichen Glückwunsch! Du hast den Ausgang erreicht.");
        System.out.println("Endgültiges Inventar: " + abenteurer.getInventar());
    }
}
