public class Komposition{
    public static void main(String[] args){
        Dateiordner root = new Dateiordner("root", true);
        System.out.println(root);
        root.dateiHinzufügen("Hallo.txt");
        root.dateiHinzufügen("WichtigePasswörter.docx");
        root.dateiHinzufügen("IP-AdressenFuersHacking.md");
        root.dateiHinzufügen("Hallo_Welt.java");
        System.out.println(root);

        // Aufgabe für FPA:
        // 1) Schreibe eine Methode in der Dateiordner Klasse,
        // die eine Datei mit Adminrechten hinzufügt in einem Dateiordner, der keine Adminrechte hat
        // - dateiHinzufügen(Dateiname, Adminrechte)

        // 2) Schreibe eine Methode in der Dateiordner Klasse, die den Dateiordner löscht
        // WENN der Dateiordner mit Adminrechten erstellt wurde,
        // kann dieser nicht gelöscht werden
        // WENN der Dateiordner ohne Adminrechte gelöscht wurde,
        // kann dieser gelöscht werden NUR DANN WENN alle Dateien in diesem Ordner auch ohne Adminrechte sind
        // - dateiOrdnerLöschen()

        // Hilfestellung:
        // root.dateiOrdnerLöschen();
        // root.geloescht == true?
    }

    public void wieDieToStringFunktioniert(){
        // Hier wird die toString Methode benutzt vom Integer[]
        /**
         * Von Object:
         * public String toString() {
         *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
         *     }
         */
        Integer[] arr = {1, 2, 3};
        // [Ljava.lang.Integer;@6acbcfc0
        System.out.println(arr);
        // Deshalb überschreiben wir diese :)
    }
}
