package tag6;
/*
Jeweils mindestens zwei neue Methoden aus den Klassen Arrays und Collections ausprobieren.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/*Jeweils mindestens zwei neue Methoden aus den Klassen Arrays und Collections ausprobieren.*/
public class Aufgabe3 {
    static void main(String[] args) {
        double[] dArr = {Math.PI, Math.E, 2.0123, -8.543, 1.234};
      Arrays.sort(dArr);
        System.out.println(Arrays.toString(dArr));
        int index = Arrays.binarySearch(dArr, Math.E);
        System.out.println("index= " + index);
        index = Arrays.binarySearch(dArr, 3.0);
        System.out.println("index = " + index);

        double[] ausschnitt= Arrays.copyOfRange(dArr, 1,4);
        System.out.println(Arrays.toString(ausschnitt));
        // Collection hat als wichtigen Spezialfall Mengen, die
        // keine Duplikate enthalten können
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(12);
        hashSet.add(2);
        System.out.println("hashSet = " + hashSet);

        int minimum = Collections.min(hashSet);
        System.out.println("minimum = " + minimum);

        List<String> kopien = Collections.nCopies(3,"Java");
        System.out.println("kopien = " + kopien);


    }
}
