package tag4;
/*
Mit zwei double-Werten 134.0 und 8.99 als Preise und zwei Strings "27 Zoll Monitor" und "Maus" zwei Zeilen
Output über System.out.printf erzeugen. Die Strings sollen linksbündig, die Preise rechsbündig sein.
Dann eine dritte Zeile mit neuen Daten anfügen.*/
public class Aufgabe3 {
    static void main(String[] args) {
        double preis1 = 134.0;
        double preis2 = 8.99;

        String name1 = "27 Zoll Monitor";
        String name2 = "Maus";

        printInfo(name1, preis1);
        printInfo(name2, preis2);

        String name3 = "Macbook Air";
        double preis3 = 1299.0;

        printInfo(name3, preis3); // name3, preis3 müssen vorher initialisiert sein
    }

    public static void printInfo(String name, double preis) {
        System.out.printf("Produkt: %-16s, Preis: %8.2f%n", name, preis);
    }
}
