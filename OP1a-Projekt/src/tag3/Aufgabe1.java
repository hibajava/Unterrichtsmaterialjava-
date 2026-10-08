package tag3;
/*Die Zuweisungsoperatoren =, +=, -=. *= für die Typen long und double ausprobieren.*/
public class Aufgabe1 {
    static void main(String[] args) {
        long l1 = 12_678-789_456-456L;// intialisieren

        long l2; // deklarieren
        l2 = 1_234l;// Einfacher Operator =
        System.out.println("l2 = " + l2);

        l2+=1;
        System.out.println("l2= " + l2);

        l2-= 1000;
        System.out.println("l2 = " + l2);

        l2 *=2;
        System.out.println("l2 = " + l2);

        l2 /= 3;
        System.out.println("l2 = " + l2);



    }
}
