package tag10;
/*
Ebenen in Java groß nach klein:

- Package : Entspricht einem Ordner
- Klasse: Entspricht einer Textdatei
- Methoden: Funktionen innerhalb Klasse
_ Strukturen innerhalb Methoden: Fallluntescheidungen, Schleifen innerhalb Methode

 */
public class DemoKlasse {
    static void main(String[] args) {
        hilfsMethode();

    }
    private static void hilfsMethode() {
        System.out.println("Hilfsmethode");
        while (true){
            System.out.println("In Schleife");
            break;
        }

    }
}
