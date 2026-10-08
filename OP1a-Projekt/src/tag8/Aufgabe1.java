package tag8;

import java.util.Random;

/*

Ausgehend von den Strings "Norden", "Osten", "Süden" und "Westen" mit switch
die Gradzahl auf dem Kompass ausgeben (z.B. rechts = 0 Grad, dann Osten => Ausgabe 0 Grad)
 */
public class Aufgabe1 {
    static void main() {
        String[] arr = { "Norden", "Osten" , "westen", "Süden"};
        Random random = new Random();
        int index = random.nextInt(4);// Werte 0, 1, 2, 3
        String richtung = arr[index];
        System.out.println("richtung = " + richtung);
        //printGradVersion1(richtung);
        printGradVersion2(richtung);
    }
    private static void printGradVersion2(String richtung){
    String s = switch (richtung){
        case "Osten "-> "0 Grad";
        case "Süden "-> "90 Grad";
        case "Westen "-> "180 Grad";
        case "Norden"-> "270 Grad";
        default -> " Unbekannt";
    };
        System.out.println(s);
    }
    private static void printGradVersion1(String richtung) {
        switch(richtung){
            case " Osten":
                System.out.println(" 0Grad");
                break;
                case " Süden":
                System.out.println("90 Grad");
                break;
                case "Westen":
                System.out.println("180 Grad");
                break;
                case "Norden":
                System.out.println("270 Grad");
                break;
        }
    }
}
