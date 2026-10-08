public class Monatsuebersicht {
    public static void main(String[] args){
        //Monat.values();
        // Aktueller Monat
        Monat aktuell = Monat.SEPTEMBER;
        // Ausgabe Name vom Monat und Zahl
        System.out.println(aktuell.name());
        System.out.println(aktuell.getZahl());

        // Anwendungsfall: Ich gehe im Januar zum Arzt und hol mir eine Überweisung
        // Kann ich die im Mai noch benutzen?
        // Gehören Januar und Mai zum gleichen Quartal?

        // Schleifen laufen MEHRFACH
            // for, while, foreach, sowas...
        // Abfragen/Anweisung nur EINMAL :)
            // if, switch, sowas...

        if(Monat.JANUAR.getQuartal() == Monat.MAI.getQuartal()){
            System.out.println("Ich kann die Überweisung noch nutzen.");
        } else {
            System.out.println("Nein geht nicht.");
        }

        Monat.gehoertZumGleichenQuartal(Monat.JANUAR, Monat.MAI);

        // 1 - Januar
        Monat test1 = Monat.gibMirDenMonatFuer(1);
        if(test1 != null){
            test1.ausgabe();
        }
        // null - es gibt keinen Monat mit 23 als Zahl
        Monat test2 = Monat.gibMirDenMonatFuer(23);
        if(test2 != null){
            test2.ausgabe();
        }

        int[] arr = new int[2];
        // Referenz zum Array-Objekt
        System.out.println(arr);
        //arr[0] sagt dann was in dem Objekt drin steht

        // Mehrere Referenzen können auf EIN Objekt zeigen
        StringBuilder builder1 = new StringBuilder("Hallo");
        StringBuilder builder2 = builder1;
        builder2.append(" Welt");
        System.out.println(builder1.toString());  // Ausgabe: "Hallo Welt"
        System.out.println(builder2.toString());  // Ausgabe: "Hallo Welt"
        System.out.println(builder1.hashCode());
        System.out.println(builder2.hashCode());

    }
}
