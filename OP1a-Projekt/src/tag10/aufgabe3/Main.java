package tag10.aufgabe3;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        System.out.println("Hauptprogramm");
        //Ü: Zwei Objekte des Typs Punkt2D erzeugen und ausgeben
        // Einen Array damit füllen
        Punkt2D p = new Punkt2D();
        Punkt2D q = new Punkt2D(1.3454, 6.827);
        p.ausgabe();
        q.ausgabe();

        Punkt2D[] arr = {p,q};
        System.out.println(Arrays.toString(arr));
    }
}
