package aufgaben;
/* Level 3
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
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lösung_5v2
{
    enum Karte
    {
        ASS(11), KÖNIG(10), DAME(10), BUBE(10), ZEHN(10), NEUN(9), ACHT(8), SIEBEN(7), SECHS(6), FÜNF(5), VIER(4), DREI(3), ZWEI(2);

        private final int wert;

        public int getWert()
        {
            return wert;
        }

        Karte(int wert)
        {
            this.wert = wert;
        }
    }

    static ArrayList<Karte> deck = new ArrayList<>(52);
    static ArrayList<Karte> handSpieler = new ArrayList<>();
    static ArrayList<Karte> handBank = new ArrayList<>();

    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        fülleDeck();
        System.out.println(deck);

        // Das Spiel läuft so lange, wie im Deck noch mehr als 9 Karten sind
        while (deck.size() > 9)
        {
            spielablauf();
            handSpieler.clear();
            handBank.clear();
        }

        System.out.println(deck); // Ausgabe der übrig gebliebenen Karten
    }

    /**
     * Ein Spieler zieht zwei Karten.
     * <br>- Hat er weniger als 21 Punkte, darf er weitere Karten ziehen.
     * <br>- Hat er genau 21 Punkte, hat er gewonnen.
     * <br>- Hat er mehr als 21 Punkte, hat er verloren.
     * <br>- Bei weniger als 21 Punkten zieht die Bank drei Karten.
     * <br>- Hat die Bank genau 21 Punkte, hat die Bank gewonnen.
     * <br>- Hat die Bank mehr als 21 Punkte, hat der Spieler gewonnen.
     * <br>- Hat die Bank weniger als 21 Punkte, aber mehr als der Spieler, hat die Bank gewonnen.
     * <br>- Sonst gewinnt der Spieler.
     */
    static void spielablauf()
    {
        zieheKarte(handSpieler);
        zieheKarte(handSpieler);
        int punkte = berechnePunkte(handSpieler);
        System.out.print("Deine Karten: ");
        System.out.print(handSpieler);
        System.out.println(" = " + punkte + " Punkte");

        while (punkte < 21)
        {
            System.out.print("Weitere Karte ziehen (JA/NEIN): ");
            String auswahl = scanner.nextLine();
            if (auswahl.equalsIgnoreCase("JA"))
            {
                zieheKarte(handSpieler);
                punkte = berechnePunkte(handSpieler);
                System.out.print("Deine Karten: ");
                System.out.print(handSpieler);
                System.out.println(" = " + punkte + " Punkte");
            }
            else if (auswahl.equalsIgnoreCase("NEIN"))
                break; // Schleife verlassen
            else
                System.out.println("Ungültige Auswahl");
        }

        // Die Klasse Boolean kann drei Zustände annehmen.
        // true, false und null.
        // true = wir haben gewonnen.
        // false = wir haben verloren.
        // null = unentschieden.
        Boolean gewonnen = null;

        if (punkte == 21)
        {
            gewonnen = true;
        }
        else if (punkte > 21)
        {
            gewonnen = false;
        }
        else
        {
            zieheKarte(handBank);
            zieheKarte(handBank);
            zieheKarte(handBank);
            int punkteBank = berechnePunkte(handBank);
            System.out.print("Die Karten der Bank: ");
            System.out.print(handBank);
            System.out.println(" = " + punkteBank + " Punkte");

            // Hat die Bank genau 21 Punkte ODER hat die Bank mehr Punkte als wir UND weniger als 21, dann haben wir verloren.
            if (punkteBank == 21 || punkteBank > punkte && punkteBank < 21)
                gewonnen = false;
            // Hat die Bank weniger Punkte als wir oder hat die Bank mehr als 21, dann haben wir gewonnen.
            else if (punkteBank < punkte || punkteBank > 21)
                gewonnen = true;
            // Sonst ist unentschieden.

        }

        if (gewonnen == null)
            System.out.println("Unentschieden!");
        else if (gewonnen)
            System.out.println("Du hast gewonnen!");
        else
            System.out.println("Du hast verloren!");

    }

    /**
     * Befüllt das Deck mit 52 Karten aus den vorhandenen Enum-Werten.
     * Von jeder Sorte werden 4 Karten in das Deck gelegt.
     */
    static void fülleDeck()
    {
        Karte[] meineKarten = Karte.values();
        for (Karte k : meineKarten)
        {
            for (int i = 0; i < 4; i++)
                deck.add(k);
        }
    }
    /**
     * Entnimmt eine zufällig ausgewählte Karte aus dem Deck und fügt sie der übergebenen Hand hinzu.
     * @param hand Die Hand, in die eine Karte gezogen werden soll.
     */
    static void zieheKarte(ArrayList<Karte> hand)
    {
        int zufallszahl = random.nextInt(deck.size());
        Karte karte = deck.get(zufallszahl);
        deck.remove(zufallszahl);
        hand.add(karte);
    }

    /**
     * Berechnet die Punkte der übergebenen Hand.
     * @param hand Die Hand, deren Punkte berechnet werden soll.
     * @return Die berechneten Punkte.
     */
    static int berechnePunkte(ArrayList<Karte> hand)
    {
        int summe = 0;
        for (Karte k : hand)
        {
            summe += k.getWert();
        }
        return summe;
    }
}
