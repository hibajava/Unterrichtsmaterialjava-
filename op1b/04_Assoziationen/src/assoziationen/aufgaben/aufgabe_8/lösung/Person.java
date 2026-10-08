package assoziationen.aufgaben.aufgabe_8.lösung;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {
    public static List<Person> Kundschaft = new ArrayList<>();
    public List<Artikel> Einkaufsliste = new ArrayList<>();
    public Person(Random zufall) {
        EinkaufsListeErstellen(zufall);
        Kundschaft.add(this);
    }
    public void EinkaufsListeErstellen(Random zufall) {
        int anzahlartikel = zufall.nextInt(7, 26);
        int randomartikel;
        for (int index = 0; index < anzahlartikel; index++) {
            randomartikel = zufall.nextInt(0, 800);
            if (!Einkaufsliste.contains(Artikel.waren.get(randomartikel))) {
                Einkaufsliste.add(Artikel.waren.get(randomartikel));
            }else{
                index--;
            }
        }
    }
}
class Angestellter extends Person {
    public Angestellter(Random zufall){
        super(zufall);
    }
}
class Kunde extends Person {
    public Kunde(Random zufall){
        super(zufall);
    }
}
class Dieb extends Person {
    public Dieb(Random zufall){
        super(zufall);
    }
}
