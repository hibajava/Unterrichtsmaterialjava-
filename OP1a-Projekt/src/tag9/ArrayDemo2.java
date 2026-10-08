package tag9;

import java.util.Arrays;

public class ArrayDemo2 {
    static void main(String[] args) {
        // 2-dimensionaler Array (Matrix)
        double[][] temperaturwerteInOrten = new double[][]{
                {17.9, 14.3, 16.7},  // Berlin
                {13.4, 16.2, 18.0},  // Hamburg
                {15.2, 18.0, 13.6}  // München
        };

        // Kurzform möglich: double[][] temperaturwerteInOrten = { ....

        // Elemente von temperaturwerteInOrten
        for (double[] elem : temperaturwerteInOrten) {
            String s = Arrays.toString(elem);
            System.out.println("Element: " + s);
            // Ü: Ausgabe der Zahlen mit ihrem Index
            for (int i = 0; i < elem.length; i++) {
                double wert = elem[i];
                System.out.printf(" %d. %5.1f %n", i, wert);
            }
        }
    }
}