import java.util.Arrays;

public class CallByReference {
    // Call By Value: in wert Landet Werte-Kopie
    // Primitive Dattentypen werden als Wertekopie übergaben

    public static void aendereWert(int wert) {
        wert++;
        System.out.println("In Funktion: " + wert);

    }
    //Call By Reference: Kopie der Speicher_ Adresse wird übergeben
    //Gilt für:Arrys, String, Eigene Objekte
    public static void aendereWerte(int[] werte) {
        System.out.println("Array in Funktion: ");
        for(int i = 0; i< werte.length; i++){
            werte[i]++;
            System.out.println(werte[i] + " ");
        }
           // System.out.println("+".repeat(20));
            //Erweterte for Schleife kann Keine wertw ändern:readonly
            /*
            for(int wert: werte){
                wert++;
                System.out.println(wert + " ");
            }*/

    }
    public static void main(String[] args) {
    int zahl = 10;
    aendereWert(zahl); //Original wird nicht verändert
        System.out.println("Im main: " + zahl);

        int[] zahlen = {1,2,3,4,5};// Original wird verändert
        aendereWert(zahl);
        System.out.println("Array in main: ");
        for(int z: zahlen){
            System.out.println(z + " ");
        }

    }
}
