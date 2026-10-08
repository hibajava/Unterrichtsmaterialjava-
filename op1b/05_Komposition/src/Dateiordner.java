import java.util.ArrayList;

// Äußere Klasse Dateiordner, kann von überall und jedem genutzt werden
public class Dateiordner {

    // Innere Klasse, privater Konstruktor: Kann nicht außerhalb des Dateiordners existieren
    private static class Datei {
        private String name;
        private boolean mussVonAdminGeloeschtWerden;

        private Datei(String name, boolean mussVonAdminGeloeschtWerden){
            this.name = name;
            this.mussVonAdminGeloeschtWerden = mussVonAdminGeloeschtWerden;
        }

        private String getName(){
            return this.name;
        }

        // Wichtig: Da wir auf die Datei nicht zugreifen können außerhalb vom Objektordner
        // Also keine Datei erstellen können
        // Können wir auch nicht auf eine toString() Methode zugreifen
        // Für dieses Beispiel können wir also davon ausgehen, dass uns das public nicht
        // stört bei der 'Komposition' als Konzept
        // Bei einem Override muss der Methodenkopf mit der überschriebenen Methode
        // GENAU übereinstimmen, also auch die Zugriffsmodifizierer
        @Override
        public String toString(){
            return "Datei: " + name;
        }
    }

    // In einer Komposition muss darauf geachtet werden,
    // dass die Teile nicht außerhalb des Ganzen existieren können!
    // Hier dürfen die Dateien NUR innerhalb der Klasse 'Dateiordner' verfügbar sein,
    // damit die Dateien auch gelöscht werden, wenn der Dateiordner wird
    private final ArrayList<Datei> dateiListe = new ArrayList<>();

    private String name;

    private boolean wurdeMitAdminRechtErstellt;

    //Zum Löschen eines Dateiordners nur markieren, ob dieser gelöscht wurde
    public boolean geloescht;

    public Dateiordner(String name, boolean adminRecht){
        this.name = name;
        this.wurdeMitAdminRechtErstellt = adminRecht;
    }

    // Um eine Datei hinzufügen zu können, müssen wir einen Dateinamen bekommen
    public void dateiHinzufügen(String nameDerDatei){
        // Wir nutzen den admin-Recht Wert, der vom Ordner kommt
        // Also haben alle Dateien in diesem Ordner die gleichen Rechte
        Datei neueDatei = new Datei(nameDerDatei, wurdeMitAdminRechtErstellt);
        dateiListe.add(neueDatei);
    }

    @Override
    public String toString(){
        // Wir bauen einen String mit dem Dateiordner
        StringBuilder sb = new StringBuilder("Dateiordner: " + name + "[");
        // Wir fügen jeden Dateinamen diesem Dateiordner-String hinzu
        for(int i = 0; i < dateiListe.size(); i++){
            sb.append(dateiListe.get(i).getName());
            if(i != dateiListe.size()-1){
                sb.append(",");
            }
            // Wir bauen den Dateinamen zusammen mit einem Komma
            // String dateiName = d.getName() + ",";
            // Weil der StringBuilder gerne nur einen String als Argument nimmt
        }
        // Für die Rückgabe schließen wir den Ordner noch
        sb.append("]");
        // Rückgabe
        return sb.toString();
    }

}
