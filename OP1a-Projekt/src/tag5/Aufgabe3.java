package tag5;
/*Eine Multiplikationstabelle bis zu 4 * 4 in einer Schleife zeilenweise erzeugen:

 1  2  3  4
 2  4  6  8
 3  6  9 12
 4  8 12 16*/
public class Aufgabe3 {
    static void main(String[] args) {
        for(int zeile = 1; zeile<= 4; zeile++){
            for(int spalte = 1; spalte <= 4; spalte++) {
                System.out.printf("%2d " , zeile * spalte );
            }
            System.out.println();
        }

    }
}
