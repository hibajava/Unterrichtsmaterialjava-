package tag9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
Zufallszahl zwischen 1 und 100 bestimmen.
Dann Eingabeschleife: Man rät die Zahl und erfährt, wie man liegt
(zu klein / zu groß / richtig).
Am Ende Ausgabe aller abgegebenen Tipps und der Anzahl der Durchgänge
 */
public class Aufgabe4 {
    static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> tipps = new ArrayList<>();

        int zahl = random.nextInt(1,101);
        //System.out.println("zahl = " + zahl);

        try(Scanner scanner = new Scanner(System.in)){
        while (true) {
            System.out.println("Rate die Zahl: ");
            int rateZahl = scanner.nextInt();
            tipps.add(rateZahl);
            if (rateZahl< zahl){
                System.out.println("Zu klein");
            }else if (rateZahl> zahl){
                System.out.println("Zu groß");
            }
            else if (rateZahl == zahl){
                System.out.printf("Richtig.%d Tipps: %s %n " , tipps.size(), tipps);
                break;
            }

            }

        }
    }
}
