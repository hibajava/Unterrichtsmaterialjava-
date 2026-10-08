package komposition;

import java.util.ArrayList;

public class Gebaeude {
    private ArrayList<Raum> raume = new ArrayList<Raum>();

    public Gebaeude(){
        // Ein Gebäude hat mindestens EINEN Raum
        Raum mindestRaum = new Raum();
        raume.add(mindestRaum);
    }

    public void addRaum(){
        // Ein neuer Raum wird hinzugefügt
        Raum raum1 = new Raum();
        raume.add(raum1);
    }

    public void loescheLetztenRaum() throws Exception{
        // Ein Raum wird gelöscht
        if(raume.size() == 1){
            throw new Exception("Es muss immer mindestens ein Raum da sein!!");
        }
        raume.removeLast();
    }

    // Komposition:
    // Ein Raum KANN NICHT ohne ein Gebaeude existieren
    private class Raum {

    }
}
