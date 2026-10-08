package tag7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/*
Eine Liste mit 10 Zufallszahlen im Bereich 1.0 und 100.0 erzeugen.
Folgende Informationen zur Liste berechnen: Minimum, Maximum, Durchschnittswert, zunächst ohne Hilfe von
Bibliotheksklassen.
Dann mit Hilfe der Klasse Collections.*/
public class Aufgabe1 {
    static void main(String[] args) {
        Random random = new Random();
        ArrayList<Double> zahlen = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            double d = random.nextDouble(1.0, 100.0);
            zahlen.add(d);//
        }
     double min = 100.0;
        double max= 1.0;
        double sum = 0.0;

        for(double d: zahlen ){
            sum+= d;
            if(d< min){
                min = d;
            }
            if(d>max){
                max =d;
            }

        }
        double durchschnitt = sum / 10;
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("durchschnitt = " + durchschnitt);

        System.out.println(Collections.min(zahlen));
        System.out.println(Collections.max(zahlen));

    }
}
