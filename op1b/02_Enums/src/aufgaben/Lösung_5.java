/* Level 3 (Endgegner)
    Die 21 gewinnt!
    Schreiben Sie ein Java-Programm, um illegales Glücksspiel zu betreiben.

    Dazu brauchen Sie ein Enum, mit dem Sie die einzelnen Kartentypen darstellen können.
    Folgende Karten und Werte gibt es:
    ASS(11), KÖNIG(10), DAME(10), BUBE(10), ZEHN(10), NEUN(9), ACHT(8), SIEBEN(7), SECHS(6), FÜNF(5), VIER(4), DREI(3), ZWEI(2)

    Außerdem benötigen Sie drei Listen:
    - Eine Liste mit allen Karten des Decks. Ein Kartendeck hat 52 Karten, von jeder Sorte befinden sich 4 Karten im Deck (also 4x Ass, 4x König, 4x Dame, etc)
    - Eine Liste mit den Karten der Hand des Spielers.
    - Eine Liste mit den Karten der Hand der Bank.

    Schreiben Sie eine Methode, die aus den vorhandenen Enum-Werten das Deck befüllt.
    Schreiben Sie eine Methode, mit der aus dem Deck in eine übergebene Hand eine zufällig ausgewählte Karte gezogen wird.
        Diese Methode wird aufgerufen, wenn ein Spieler eine Karte zieht und auch wenn die Bank eine Karte zieht.
    Schreiben Sie eine Methode, um die Punkte einer übergebenen Hand zu berechnen. Die Punkte werden von der Methode zurückgegeben.
        Diese Methode wird aufgerufen, um die Punkte eines Spielers und auch die der Bank zu berechnen.

    Zu Beginn des Spiels zieht ein Spieler zwei Karten. Es werden die Karten ausgegeben und die Punkte berechnet.
    Ergeben die Karten genau 21, ist das Spiel sofort gewonnen.
    Sonst kann ein Spieler weitere Karten ziehen, bis die 21 erreicht oder überschritten sind.
    Ergeben die Karten mehr als 21 Punkte, ist das Spiel sofort verloren.

    Liegen die Punkte unter 21 und möchte ein Spieler keine weiteren Karten ziehen, dann zieht die Bank drei Karten.
    Hat ein Spieler mehr Punkte als die Bank, oder hat die Bank mehr als 21 Punkte, ist das Spiel gewonnen.
    Bei einem gleichen Punktestand ist das Spiel unentschieden.
    Hat die Bank 21 Punkte oder mehr als ein Spieler (aber nicht über 21), ist das Spiel verloren.

    (OPTIONAL: Das ASS kann eigentlich zwei Werte annehmen. Entweder die 11 oder die 1, je nachdem was für einen Spieler besser ist.)
 */

package aufgaben;

import java.util.*;

enum Karte
{
    ASS(11),
    KÖNIG(10),
    DAME(10),
    BUBE(10),
    ZEHN(10),
    NEUN(9),
    ACHT(8),
    SIEBEN(7),
    SECHS(6),
    FÜNF(5),
    VIER(4),
    DREI(3),
    ZWEI(2);

    private final int wert;
    Karte(int wert)
    {
        this.wert = wert;
    }

    public int getWert()
    {
        return wert;
    }
}


public class Lösung_5
{
    /**
     * Beinhaltet die Spielkarten.
     */
    static List<Karte> deck = new ArrayList<>();
    /**
     * Die gezogenen Karten auf der Hand.
     */
    static List<Karte> hand = new ArrayList<>();
    /**
     * Die von der Bank gezogenen Karten.
     */
    static List<Karte> bank = new ArrayList<>();


    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args)
    {
        fülleDeck();
        System.out.println(deck);

        // Spiel läuft, solange noch mehr als 10 Karten im Deck sind
        while(deck.size() > 10)
        {
            // Vor jedem Durchlauf die Hände waschen.
            hand.clear();
            bank.clear();
            game();
        }

        System.out.println(deck);
    }

    /**
     * Enthält den Spielablauf.
     * Es werden zwei Karten gezogen und die Punkte ausgegeben. Danach darf ein Spieler weitere Karten ziehen.
     * Es werden die Punkte berechnet und mit den Punkten der Bank verglichen.
     * Danach folgt die Ausgabe, ob ein Spieler gewonnen oder verloren hat.
     */
    static void game()
    {
        int punkte = 0;
        boolean weiter = true;

        zieheKarte(hand); // Es werden immer zwei Karten gezogen.
        zieheKarte(hand);

        // Ausgabe der Karten und Punkte
        System.out.println("Deine Karten: " + hand);
        punkte = punkteBerechnen(hand);
        System.out.println("Deine Punkte: " + punkte);

        while (weiter && punkte < 21)
        {
            System.out.print("Karte ziehen (ja/nein)? ");
            String auswahl = scanner.nextLine();
            if (auswahl.equalsIgnoreCase("ja"))
            {
                // Karte ziehen und ausgeben
                zieheKarte(hand);
                System.out.println("Deine Karten: " + hand);
                punkte = punkteBerechnen(hand);
                System.out.println("Deine Punkte: " + punkte);
            }
            else
                weiter = false;
        }

        // Bei mehr als 21 Punkten gilt das Spiel als verloren.
        if (punkte > 21)
            System.out.println("Verloren!");
        else if (punkte == 21) // Bei genau 21 Punkten ist das Spiel gewonnen.
            System.out.println("Gewonnen!");
        else
        {
            // Sonst muss die Bank auch Karten ziehen
            for (int i = 0; i < 3; i++)
                zieheKarte(bank);

            // Punkte der Bank berechnen und ausgeben
            int punkteBank = punkteBerechnen(bank);
            System.out.println("Karten der Bank: " + bank);
            System.out.println("Punkte Bank: " + punkteBank);

            // Haben wir mehr Punkte als die Bank oder hat die Bank mehr als 21 Punkte
            if (punkte > punkteBank || punkteBank > 21)
                System.out.println("Gewonnen!");
            // haben wir gleichviel Punkte
            else if (punkte == punkteBank)
                System.out.println("Unentschieden!");
            // Sonst...
            else
                System.out.println("Verloren!");
        }

        System.out.println("--------------------"); // Ausgabe eines Trennzeichens um die nächste Runde zu erkennen
    }

    /**
     * Füllt das Deck mit 4 Karten jeder Sorte.
     * Danach beinhaltet das Deck 52 Karten.
     */
    static void fülleDeck()
    {
        Karte[] karten = Karte.values(); // values() gibt ein Array mit den Enum-Werten zurück. In dem Array ist von jeder Konstante ein Exemplar.
        for (Karte k : karten)
        {
            for (int i = 0; i < 4; i++) // Wir wollen von jeder Sorte 4 Karten im Deck.
            {
                deck.add(k);
            }
        }
    }

    /**
     * Zieht eine Karte vom Deck in die übergebene Hand.
     * @param hand Die Hand, in die eine Karte gezogen wird.
     */
    static void zieheKarte(List<Karte> hand)
    {
        int index = random.nextInt(deck.size()); // Es wird eine Zufallszahl zwischen 0 und der Anzahl der Karten im Deck ausgewürfelt.
        Karte k = deck.get(index); // Die Karte wird im Deck gesucht,
        deck.remove(k); // aus dem Deck entfernt
        hand.add(k); // und in die Hand gelegt.
    }

    /**
     * Berechnet die Punkte der übergebenen Hand.
     * @param hand Die Hand, deren Punkte berechnet werden sollen.
     * @return Die berechneten Punkte.
     */
    static int punkteBerechnen(List<Karte> hand)
    {
        int summe = 0;
        for (Karte karte : hand)
        {
            summe += karte.getWert();
        }
        return summe;
    }
}
