package labyrinth;

/*
    VERERBUNG:

    Definition:
        Klassen können von anderen Klassen Code übernehmen → der dort implementierte Code muss also
        nicht erneut geschrieben werden.
        Die erbende Klasse wird "Subklasse" (Kind-Klasse) genannt.
        Die Klasse, von der geerbt wird, heißt "Superklasse" (Eltern-Klasse).
        Man spricht auch von "Ableiten", die Subklasse ist die "abgeleitete Klasse".

        In Java kann eine Klasse immer nur eine Superklasse haben.
*/
public class SchatzVererbungTesten {
    public static void main(String[] args){
        // Nur zur Hilfe!
        Labyrinth labyrinth = new Labyrinth(10, 15);
        Abenteurer abenteurer = new Abenteurer("Herbert");
        labyrinth.setAbenteurer(abenteurer);

        // Beschreibung der Vererbung
        System.out.println("Vererbungshierarchie Schatz -> Goldschatz -> Juwel");
        Schatz superSchatz = new Schatz(0, 0, "Superschatz!");
        superSchatz.anwenden(abenteurer, labyrinth);

        printSchatz(superSchatz);
        // Fehlermeldung, weil wir in Schatz KEINEN Goldwert haben :)
        // goldSchatzAusgeben(superSchatz);

        Goldschatz goldschatz = new Goldschatz(1, 2, "Goldschatz", 1000);
        goldschatz.anwenden(abenteurer, labyrinth);

        printSchatz(goldschatz);
        // Print Methode für Goldschatz
        // goldSchatzAusgeben(goldschatz);

        // Beschreibung der Vererbung
        // TODO:
        System.out.println("Vererbungshierarchie Schatz -> Karte -> Schatzkarte");

    }

    // Hier benutzen wir die Superklasse und können die Subklassen, die von Schatz erben
    // hier als Parameter hineingeben
    // Weil ALLE Kind-Klassen ALLE Attribute und Methoden haben
    // die die Eltern-Klasse hat
    public static void printSchatz(Schatz schatz){
        System.out.println(schatz.getName() + " an Position: "+schatz.getPositionX()+","+schatz.getPositionY());
    }


    // Beispiel, dass das andersherum nicht funktioniert
    // Sorum können wir eine allgemeine print Methode nicht schreiben
    // Weil Goldschatz MEHR INFORMATIONEN hat als Schatz
    public static void goldSchatzAusgeben(Goldschatz goldschatz){
        System.out.println(goldschatz.getName() + " an Position: "+goldschatz.getPositionX()+","+goldschatz.getPositionY());
        // ZUSÄTZLICH:
        System.out.println(goldschatz.getGoldwert());
    }
}
