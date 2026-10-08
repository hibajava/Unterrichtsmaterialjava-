package tag9;

import java.util.ArrayList;
import java.util.Scanner;

/*
Eine Liste mit ganzen Zahlen durch eine Eingabeschleife füllen lassen.
Ungültige Eingaben sollen abgefangen werden, beim Wort "Ende" soll die
Schleife abbrechen.
 */
public class Aufgabe3 {
    static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)){
            do {
                System.out.println("Eingabe Zahl: ");
                String s = scanner.nextLine();
                if (s.equalsIgnoreCase("Ende")) {
                    System.out.println("Programm wird beendet");
                    System.out.println(liste);
                    break;
                }
                try {
                    int n = Integer.parseInt(s);
                    liste.add(n);// n automatisch zu Integer gemacht: boxing

                } catch (Exception e) {
                    System.out.println("Problem bei Input: " + s);
                    continue;
                }
            }while (true) ;

             // Hier wird automatisch scanner.close() gemacht
            }}}

