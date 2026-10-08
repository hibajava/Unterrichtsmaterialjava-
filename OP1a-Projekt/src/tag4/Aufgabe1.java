package tag4;
/*Für die Typen float und short jeweils die minimalen und maximalen Werte ausgeben.
Welche Konstanten gibt es sonst noch?
Den Quellcode der entsprechenden Wrapperklassen anschauen
(nicht im Detail, das meiste wird man nicht verstehen).
 */
public class Aufgabe1 {
    static void main(String[] args) {

        System.out.printf("Minimum bei float: %s %n", Float.MIN_VALUE);
        System.out.printf("Maximum bei float: %s %n", Float.MAX_VALUE);

        float f = Float.valueOf("2.345f");
        System.out.println("f = " + f);

        // Float.serialVersionUID kein Zugriff, da privat

        System.out.printf("Minimum bei short: %d %n", Short.MIN_VALUE);
        System.out.printf("Maximum bei short: %d %n", Short.MAX_VALUE);

        short s = Short.valueOf("12345");
        System.out.println("s = " + s);
    }
}


