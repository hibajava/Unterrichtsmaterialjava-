package tag5;

import java.util.Arrays;

/*Einen double-Array mit 5 Zufallszahlen erzeugen und alle Werte mit Index ausgeben.
In der Dokumentation die Klasse Arrays nachschauen: Wie kann man damit einen Array sortieren?*/
public class Aufgabe1 {
    static void main(String[] args) {
        double[]dArr = {
                Math.random(),
                Math.random(),
                Math.random(),
                Math.random(),
                Math.random(),
        };
        printArray(dArr);
        Arrays.sort(dArr);
        printArray(dArr);

        //Ü: Methode in Arrays , die den Arry als String zurückliefert
        System.out.println(Arrays.toString(dArr));
    }

    private static void printArray(double[] dArr) {
        for(int i = 0; i< dArr.length; i++){
            System.out.printf("%d. %f %n" , i+1, dArr[i]);
        }
        Arrays.sort(dArr);
    }
}
