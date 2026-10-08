package aggregation;

import java.time.LocalDateTime;
import java.util.ArrayList;

// Ein Einkauf besteht genau aus einem Käufer und einer Ware
public class Einkauf {
    public static final ArrayList<Einkauf> einkaufListe = new ArrayList<>();

    // Wieso ist alles final?
    private final int id;
    private final LocalDateTime datum;
    // 1-zu-n Beziehung Einkauf und Käufer (Person)
    // Ein Einkauf wird von genau einem Käufer getätigt. Ein Käufer (Person) kann mehrere Einkäufe tätigen.
    private final Person käufer;
    // 1-zu-n Beziehung Einkauf und Produkt
    // Pro Einkauf wird genau eine Ware gekauft. Eine Ware kann in mehreren Einkäufen gekauft werden.
    private final Produkt ware;

    public Einkauf(int id, LocalDateTime datum, Person käufer, Produkt ware){
        this.id = id;
        this.datum = datum;
        this.käufer = käufer;
        this.ware = ware;
    }

    @Override
    public String toString() {
        return "Kassenbon vom "+datum.getDayOfMonth()+"."+datum.getMonth()+" \n" +
                ware +
                "\nwurde gekauft von: \n" +
                käufer;
    }

    }
