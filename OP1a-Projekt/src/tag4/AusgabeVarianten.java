package tag4;

public class AusgabeVarianten {
    static void main(String[] args) {
        int zahl = 273748;
        System.out.println(zahl);
        System.out.println("Danach");

        System.out.print(8373);
        System.out.println("Danach");
        System.out.println("678\n3.455676\nHallo\n\nwelt\n"); // nicht empfolen

        // Oft Ausgabe von Strings mit eingestreuten Zahlenwerten
        int breite = 5;
        int höhe = 3;
        System.out.printf("Das Recheck hat die Breite %d und Hohe %d.%n ", breite, höhe);

        double preis = 9.9827363636;
        //Möglich: Spaltenbreite, Nachkommastellen
        System.out.printf("Der preis beträgt %6.2f.%n ", preis);
        System.out.printf("Der preis beträgt %-6.2f.%n ", preis);
        System.out.printf("Der preis beträgt %.2f.%n ", preis);

        //Ü: Ausgabe von drei zahlen 1, 111, 11111 in deutschen Sätzen, Spaltenbreite 8.
         zahl= 1;
        System.out.printf("zahl beträgt %8d.%n" , zahl);

        zahl= 111;
        System.out.printf("zahl beträgt %8d.%n" , zahl);

        zahl= 11111;
        System.out.printf("zahl beträgt %8d.%n" , zahl);

    }
}
