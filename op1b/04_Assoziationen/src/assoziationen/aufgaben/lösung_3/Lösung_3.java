package assoziationen.aufgaben.lösung_3;

/* Level 1
 * Zwei Klassen:
 * "Buch" mit dem Attribut "titel" (public get)
 * "Autor" mit dem Attribut "name" (public get)
 * jeweils einen Konstruktor, der die Eigenschaften initialisiert.
 * Implementieren Sie die Assoziation der beiden Klassen und stellen Sie eine bidirektionale Navigierbarkeit her.
 * Dazu müssen Sie den Klassen weitere Member hinzufügen.
 * (Gehen Sie davon aus, dass ein Buch mehrere Autoren haben und ein Autor mehrere Bücher verfassen kann)
 * Testen Sie das Programm im Main.
 */

public class Lösung_3
{

    public static void main(String[] args)
    {
        Autor a1 = new Autor("Carl Sagan");
        Autor a2 = new Autor("Jerome Agel");
        Autor a3 = new Autor("Jonathan Norton Leonard");

        Buch b1 = new Buch("Nachbarn im Kosmos");
        b1.getAutoren().add(a1);
        b1.getAutoren().add(a2);

        Buch b2 = new Buch("Die Planeten");
        b2.getAutoren().add(a1);
        b2.getAutoren().add(a3);

        a1.getBücher().add(b1);
        a1.getBücher().add(b2);
        a2.getBücher().add(b1);
        a3.getBücher().add(b2);

        System.out.println("Alle Bücher von " + a1.getName());
        for (Buch b : a1.getBücher())
        {
            System.out.printf("Buch: %s\nAutoren: %n", b.getTitel());
            for (Autor a : b.getAutoren())
            {
                System.out.println(a.getName());
            }
        }

        // Variante mit Assoziationsklasse
        System.out.println("\nAlle Autoren und ihre Bücher: ");
        new Verfasst(a1, b1);
        new Verfasst(a1, b2);
        new Verfasst(a2, b1);
        new Verfasst(a3, b2);

        for (Verfasst v : Verfasst.verfasstListe)
            System.out.printf("Buchtitel: %s - Autor: %s%n", v.getBuch().getTitel(), v.getAutor().getName());
    }

}

