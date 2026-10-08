package aggregation;

import java.time.LocalDateTime;

// Spezielle Form der Assoziation
// "Teil von" und die Teile können unabhängig voneinander Existieren
// Kann eine Assoziation zwischen mehr als zwei Klassen existieren?
// Ja - da eine Aggregation z.B. eine Assoziation ist, ist Einkauf ein Beispiel für
// eine Assoziation zwischen 3 Klassen
public class Aggregation {
    public static void main(String[] args){
        Person person1 = new Person(1, "Hansen");
        Produkt produkt1 = new Produkt("Bleistift", 2, 3);
        // Aggregation unterscheidet sich von Assoziation in dieser Frage:
        // Kann dieses Objekt (Einkauf) ohne die Beziehung zu dem anderen Objekt (Produkt, Person) existieren?
        LocalDateTime aktuellesDatum = LocalDateTime.now();
        Einkauf einkauf1 = new Einkauf(1, aktuellesDatum, person1, produkt1);
        System.out.println(einkauf1);
    }
}
