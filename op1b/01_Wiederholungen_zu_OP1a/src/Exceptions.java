import java.util.Arrays;

// Wiederholungen zu Exceptions
// Ziel: Zum Ende der Methode gelangen ohne, dass das Programm uns abschmiert

public class Exceptions {
    public static void main(String[] args) {
        try{
            int durchNull = 100 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Erstes Hindernis gemeistert!");
        }

        try{
            int stringParsing = Integer.parseInt("Eins");
        } catch (NumberFormatException nfe){
            System.out.println("Zweites Hindernis gemeistert!");
        }

        int[] hilfsArray = {1, 2, 3, 4};
        try{
            int stelleImArray = hilfsArray[5];
        } catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Drittes Hindernis gemeistert!");
        }

        try{
            // Code
        } catch(Exception e){
            // Vorteil allgemeiner Exceptions:
            // + Kürzerer Code
            // + Es wird ALLES abgefangen - falls man etwas vergisst, macht das Programm weiter
            // + User wird ggf. nicht unterbrochen

            // Nachteile allgemeiner Exceptions:
            // - Fehler ggf. unbekannt
            // - Es wird ALLES abgefangen - ggf wird Code abgefangen, der gebraucht wurde, um z.B. eine Variable richtig zu besetzen
            // - Etwas schwieriger gutes User Feedback zu erstellen
        }

        // Matrix
        int[][] matrize = new int[2][3];
        matrize[0][0] = 0;
        matrize[0][1] = 1;
        matrize[0][2] = 2;
        matrize[1][0] = 3;
        matrize[1][1] = 4;
        matrize[1][2] = 5;
        printMultiArray(matrize);

        int[][] hilfsMultiArray = new int[1][1];
        try{
            if(printMultiArray(hilfsMultiArray)){
                return;
            }
        } catch(EmptyMultidimensionalArrayException emae){
            System.out.println("Letztes Hindernis gemeistert!");
        }


        System.out.println("Sie haben den Ziel Code erreicht...");
    }

    // Ausgabe mehrdimensionales Array
    private static boolean printMultiArray(int[][] arr) throws EmptyMultidimensionalArrayException {
        // Hier muss eine Exception geworfen werden, wenn das Array leer ist
        // EmptyMultidimensionalArrayException
        // Exception instanziieren/ initialisieren

        // Wann ist unser Array leer?
        // Wenn alle Einträge 0 sind
        // Wenn keine Zeilen / Spalten existieren
        boolean arrayIstLeer = true;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] != 0){
                    // [0][1] = 1
                    // arrayIstLeer = false
                    // BRECHE AB.
                    arrayIstLeer = false;
                    break;
                }
            }
            // Das gleiche wie: arrayIstLeer != true
            if(!arrayIstLeer){
                break;
            }
        }

        if(arrayIstLeer){
            throw new EmptyMultidimensionalArrayException("Dieses Array war leer!");
        }

        for(int[] zeile : arr){
            System.out.println(Arrays.toString(zeile));
        }
        // Ausgabe ist erfolgt, also wahr zurückgeben
        return true;
    }
}
