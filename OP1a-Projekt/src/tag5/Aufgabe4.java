package tag5;
/*Eine separate Methode printMultTable(int zahl) soll eine Multiplikationstabelle
auch für eine beliebige positive zahl erzeugen können.
Die Spaltenbreite soll automatisch passend gewählt werden*/
public class Aufgabe4 {
    static void main(String[] args) {
        printMultTable(7);
    }

    private static void printMultTable(int zahl) {
        int spaltenBereite = computewidth(zahl);
        for(int zeile = 1; zeile<= zahl; zeile++)
        {
            for(int spalte = 1; spalte <= zahl; spalte++)
            {
                System.out.printf("%" + spaltenBereite + "d ",  zeile * spalte );
            }
            System.out.println();
    }
    }

    private  static int computewidth(int zahl){
        int erg1= String.valueOf(zahl*zahl).length();
        int erg2 = 0;

       int current = zahl * zahl;
       while(current>0){
           current = current/ 10;
           erg2++;
       }

        System.out.println("erg1 = " + erg1);
        System.out.println("erg2 = " + erg2);
        return erg2;
    }
}
