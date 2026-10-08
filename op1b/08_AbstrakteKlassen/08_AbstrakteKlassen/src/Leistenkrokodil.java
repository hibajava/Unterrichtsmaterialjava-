// Wenn wir von einer abstrakten Klasse erben,
// MÜSSEN WIR ZWANGSWEISE alle abstrakten Methoden implementieren!
public class Leistenkrokodil extends Krokodil{

    public Leistenkrokodil(String farbe) {
        super(farbe);
    }

    public void imSchlammWaelzen(){
        System.out.println("** Ich liebe Schlamm! **");
    }

    @Override
    public void zeigeInfoZumLebensraum() {
        System.out.println("Das Leistenkrokodil lebt in Südostasien und Australien im Salz- oder Süßwasser.");
    }
}
