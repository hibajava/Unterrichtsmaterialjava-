package tag9;

import java.util.Arrays;
import java.util.Random;

/*
Einen zweidimensionalen Array der Größe 3 * 4 mit Wahrheitswerten erzeugen (immer false).
Über alle Elemente iterieren und jeweils random.nextBoolean() einsetzen.
Danach Anzahl von true zählen.
 */

    public class Aufgabe1 {
        public static void main(String[] args) {
            boolean[][] bArr2Dim = new boolean[3][4];
            printContent(bArr2Dim);

            Random random = new Random();
            for (int zeile = 0; zeile < bArr2Dim.length; zeile++) {
                boolean[] arr = bArr2Dim[zeile];
                for (int spalte = 0; spalte < arr.length; spalte++) {
                    bArr2Dim[zeile][spalte] = random.nextBoolean();
                }
            }

            System.out.println();

            printContent(bArr2Dim);

        }

        private static void printContent(boolean[][] bArr) {
            for (boolean[] arr : bArr) {
                System.out.println(Arrays.toString(arr));
            }
        }
    }

