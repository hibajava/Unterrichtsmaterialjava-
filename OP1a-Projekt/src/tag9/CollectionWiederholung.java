package tag9;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionWiederholung {
    static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Deutschland");
        liste.add("Frankreich");
        liste.add("Polen");
        liste.set(2, "Griechenland");
        liste.remove(0);
        for(String s: liste){
            System.out.println(s);
        }
        HashSet<Integer> menge = new HashSet<>();
        menge.add(3);
        menge.add(3);
        menge.add(3);
        menge.add(2);
        for(int n: menge){
            System.out.println(n);
        }

    }
}
