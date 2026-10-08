package aufgaben.zusatzAufgabe;

import java.util.Arrays;

/**
 * Hintergrundgeschichte: Du bist ein Abenteurer in einer digitalen Welt und musst einen verlorenen Schatz
 * aus einem mehrdimensionalen Array-Labyrinth bergen.
 * Auf deinem Weg durch das Labyrinth triffst du auf verschiedene Herausforderungen,
 * die du mithilfe von Klassen, Collections und dem Umgang mit Exceptions meistern musst.
 */
public class Main {
    public static void main(String... args){

        Labyrinth labyrinth = new Labyrinth(10,15);
        labyrinth.druckeLabyrinth();

    }
}
