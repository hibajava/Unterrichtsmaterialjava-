package tag3;
/*
Für eine Sparsumme von 100.00 € den Betrag nach 1, 2 und 3 Jahren ausrechnen,
wenn darauf Zins
in Höhe von 4% dazukommt.*/

public class Aufgabe3 {
    static void main(String[] args) {
        double start = 100.0;
        System.out.println(" start = " + start);

        double nachJahr1 = start *1.04;
        System.out.println("nachJahr1 = " + nachJahr1);

        double nachJahr2 = nachJahr1 *1.04;
        System.out.println("nachJahr2 = " + nachJahr2);

        double nachJahr3 = nachJahr2 *1.04;
        System.out.println("nachJahr3 = " + nachJahr3);


    }
}
