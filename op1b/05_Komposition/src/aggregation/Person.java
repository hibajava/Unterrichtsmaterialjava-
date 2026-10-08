package aggregation;

import java.util.ArrayList;

public class Person {
    // Speichert alle Personen in einer statischen Liste, damit es einfacher ist über diese zu iterieren
    public static final ArrayList<Person> personListe = new ArrayList<>();

    // Konzept aus Datenbanken
    private final int id;
    private String nachname;


    //Konstruktor der Personen-Klasse
    public Person(int id, String nachname){
        this.id = id;
        this.nachname = nachname;

        personListe.add(this);
    }

    @Override
    public String toString(){
        return "Person "+ nachname+" mit ID: "+ id;
    }
}
