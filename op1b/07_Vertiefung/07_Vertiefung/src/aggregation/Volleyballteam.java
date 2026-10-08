package aggregation;

import java.util.ArrayList;

public class Volleyballteam {
    // Volleyballteam kann einen Trainer und keine Spieler haben
    // Ein Volleyballteam kann NICHT ohne Trainer UND Spieler existieren
    public Trainer trainer;
    // Ein Volleyballteam kann ohne Spieler existieren
    public ArrayList<Spieler> spieler = new ArrayList<Spieler>();

    public Volleyballteam(Trainer trainer, ArrayList<Spieler> spieler) throws Exception {
        if(trainer == null && spieler == null){
            throw new Exception("Das geht so nicht!");
        }
        this.trainer = trainer;
        this.spieler = spieler;
    }

}
