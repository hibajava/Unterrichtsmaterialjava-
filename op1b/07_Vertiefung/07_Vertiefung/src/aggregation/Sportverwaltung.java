package aggregation;

import java.util.ArrayList;

public class Sportverwaltung {
    public static void main(String[] args){
        Trainer trainer = new Trainer();
        Spieler spieler1 = new Spieler();
        Spieler spieler2 = new Spieler();

        ArrayList<Spieler> spielerListe = new ArrayList<Spieler>();
        spielerListe.add(spieler1);
        spielerListe.add(spieler2);

        try {
            Volleyballteam volleyballteam = new Volleyballteam(null, null);
        } catch (Exception e){
            System.out.println("Volleyballteam kann so nicht existieren.");
        }

        // Multiplizität:
        // Ein Volleyballteam kann einen Trainer haben
        // Ein Trainer kann mehrere Volleyballteams übernehmen

    }
}
