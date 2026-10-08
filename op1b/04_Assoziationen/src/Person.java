import java.util.ArrayList;

public class Person {
    // Speichert alle Personen in einer statischen Liste, damit es einfacher ist über diese zu iterieren
    public static final ArrayList<Person> personListe = new ArrayList<>();

    // Konzept aus Datenbanken
    private final int id;
    private String nachname;

    // Liste aller Autos, die diese Person fahren darf:
    private final ArrayList<Auto> darfFahrenListe = new ArrayList<>();

    //Konstruktor der Personen-Klasse
    public Person(int id, String nachname){
        this.id = id;
        this.nachname = nachname;

        personListe.add(this);
    }

    public ArrayList<Auto> getDarfFahrenListe(){
        return darfFahrenListe;
    }

    @Override
    public String toString(){
        return "Person "+ nachname+" mit ID: "+ id;
    }
}
