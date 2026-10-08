import java.util.Arrays;

// Grundlagen und allgemeines zu Enumerationen
public class Enumerationen{

    // Enum: Wichtige Konstanten im Programm zusammenfassen
    enum Ampelfarbe
    {
        // Konstanten müssen in Enums in GROSSBUCHSTABEN stehen
        GRÜN, ROT, GELB
    }

    // Enums können als Parameter übergeben werden
    static void info(Ampelfarbe farbe){
        switch (farbe) {
            case ROT:
                System.out.println(farbe + " : ANHALTENNN!!!");
                break;
            case GELB:
                System.out.println(farbe + " : Achtung, langsam anhalten...");
                break;
            case GRÜN:
                System.out.println(farbe + " : Fahren.");
                break;
        }
    }

    public static void main(String[] args) {
        // Aus einem Enum können wir Variablen erzeugen und diese weiter nutzen.
        Ampelfarbe farbe = Ampelfarbe.ROT;
        info(farbe);

        info(Ampelfarbe.GELB); // Konstanten können direkt in Methoden übergeben werden.
        info(Ampelfarbe.GRÜN);

        // Mit values() kann man ein Array der Konstanten erhalten, in der Reihenfolge, in der sie deklariert sind
        System.out.println(Arrays.toString(Ampelfarbe.values()));

        // .ordinal() gibt uns die Stelle der Konstante in unserem Enum
        // .name() gibt uns den Namen der Konstante aus unserem Enum
        for(Ampelfarbe af : Ampelfarbe.values()){
            System.out.println(af.ordinal() + " : " + af.name());
        }

        int[] ordinals = new int[3];
        int i = 0;
        for(Ampelfarbe af : Ampelfarbe.values()){
            ordinals[i] = af.ordinal();
            i++;
        }
        System.out.println(Arrays.toString(ordinals));


    }
}