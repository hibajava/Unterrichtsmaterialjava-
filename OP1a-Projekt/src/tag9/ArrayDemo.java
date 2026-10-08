package tag9;

import java.util.Arrays;

public class ArrayDemo {
    static void main(String[] args) {
        int[] iArr = new int[7]; //Länge,Defaultwerte
        printArray(iArr);
        // Einzelne elemente ändern
        iArr[1] = 234324;
        iArr[3] = -4567;
        printArray(iArr);

        //mit eigenen werten erzeugen
        iArr = new int[] {3, 5, 6,0 ,-2, 3};
        printArray(iArr);
// kurzform beim erzeugen
        int[] iArrNeu = {-3, 5, 1};

        Arrays.fill(iArrNeu, -1);
        printArray(iArrNeu);

        // Wenn man eine Operation auf Arrays braucht, sollte man zunächst
        // in der Klasse Arrays Arrays nachschauen.
    }

    private static void printArray(int[] iArr) {
        System.out.println(Arrays.toString(iArr));
    }
}
