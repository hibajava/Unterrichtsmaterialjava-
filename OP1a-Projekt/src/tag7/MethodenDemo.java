package tag7;

public class MethodenDemo {
    // In Java hat man keine freistehenden Funktionen,
    // nur Methoden innerhalb von Klassen

    static void print() {
        System.out.println("Irgendetwas");
    }

    static int getTemperatur() {
        return 14;
    }

    void tueEtwas() {
        System.out.println("ich tue etwas");
    }

    public static void main(String[] args) {
        print(); // Klassenname hier nicht nötig
        MethodenDemo.print();

        int temperatur = getTemperatur();
        System.out.println("temperatur = " + temperatur);

        // tueEtwas(); nicht möglich, da keine statische Methode

        MethodenDemo methodenDemo = new MethodenDemo();
        methodenDemo.tueEtwas();  // Instanzmethode

    }

}

