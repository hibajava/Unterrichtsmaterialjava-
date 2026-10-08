import java.util.ArrayList;

public class Auto {
    // Wir speichern alle Autos in einer statischen Liste, damit wir sie bequem iterieren und ausgeben können.
    public static final ArrayList<Auto> autoListe = new ArrayList<>();

    private final int id;
    private final String marke;

    // Autos können einen Besitzer haben.
    // So stehen Person und Auto in Verbindung zueinander.
    // Kennen wir das Auto, kennen wir auch den besitzer
    private Person besitzer; // Hier wird die REFERENZ der Person gespeichert

    // Jedes Auto hat eine Liste mit Personen, die das Auto fahren dürfen. Damit stehen Person und Auto in Verbindung / Beziehung zueinander.
    private final ArrayList<Person> fahrerListe = new ArrayList<>();

    public Auto(int id, String marke){
        this.id = id;
        this.marke = marke;

        autoListe.add(this);
    }

    // Setter für den Besitzer
    public void setBesitzer(Person besitzer){
        this.besitzer = besitzer;
    }

    // Getter für den Besitzer
    public Person getBesitzer(){
        return this.besitzer;
    }

    public ArrayList<Person> getFahrerListe()
    {
        return fahrerListe;
    }

    @Override
    public String toString(){
        if(this.besitzer != null){
            return marke+" von [" + this.besitzer + "] mit ID: "+ id;
        }
        return marke+" mit ID: "+ id;
    }

}
