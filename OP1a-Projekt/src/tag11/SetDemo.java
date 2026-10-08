package tag11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/*
Verwendete Typen:
Set als Basis-Interface: Keine Duplikate
HashSet Standardklasse, Ordnung nicht garantiert
TreeSet: Automatisch aufsteigende Sortierung
Set.of erzeugt kleine unveränderliche Mengen
 */
public class SetDemo {
    static void main(String[] args) {
        // Set Interface, HashSet Klasse
        Set<String> set = new HashSet<>();

        // Variante: Treeset, automatisch sortiert
        set = new TreeSet<>();

        set.add("Python");
        set.add("Java");
        set.add("C++");
        set.add("Rust");

        System.out.println("set = " + set);

        // Unveränderliche kleine Menge
        Set<String> demo = Set.of("Golang","Kotlin");

        set.addAll(demo);
        System.out.println("demo = " + demo);
        System.out.println("set = " + set);
    }
}
