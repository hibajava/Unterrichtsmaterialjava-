package tag11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/*
wichtige Typen:
List Interface, alle Varianten müssen das Interface erfüllen
ArrayList: Meitgenutzte Variante. intern Array
LinkedList: Oft verwendet, jedes Element hat Referenz auf Nachfolger
Immutable List über List.of
 */
public class ListDemo {
    static void main(String[] args) {
        // Liste: Basistyp List als Interface,
        // mehrer Klassen können es implementieren

        // list hat Typ List, zugewiesen ist ein Objkt des Typs arrayList
        List<Integer> liste= new ArrayList<>();

        // Man kann später eien anderen Listentype nehmen
        liste = new LinkedList<>(); // Elemente speichern Referenz auf Nachfolger

        // Vorteile der Arraylist: Wahlfreier Zugriff einfach (random access)
        // Nachteil der ArrayList: Array muss evt. neu erstellt werden
        // Leicht bei LinkedList: Durchlaufen und dabei Änderungen in Mitte

        liste.add(-2);
        liste.add(6);
        liste.add(2);
        liste.add(0);
        liste.add(12);
        System.out.println("liste = " + liste);

        // Neu Art des Durchlaufens mit Iterator
        // besonders geeignet für LinkedList
        Iterator<Integer> iterator= liste.iterator();
        while (iterator.hasNext()){
            Integer elem = iterator.next();
            System.out.println("elem = " + elem);
        }
        // Immutable, oft für kleine Beispiellisten gebraucht
        List<Integer> beispielwerte = List.of(33, - 6, 21, 9);
        //List<Integer> beispielwerte.add(222);

        liste.addAll(beispielwerte);
        liste.set(0,1111);
        Integer anfang= liste.get(0);
        System.out.println("anfang = " + anfang);

        liste.remove(0);
        System.out.println("liste = " + liste);

        liste.clear();
        System.out.println("Liste = " + liste);
    }
}
