package tag5;

public class MehrereKommandozeilenargumente {
    public static void main(String[] args) {
        System.out.println("args = " + args); // Stadardoutput eines Array

        // Foreach-Schleife zum Durchlaufen über Array
        // Nicht möglich: Index ausgeben, Inhalt ändern
        for (String s: args) {
            System.out.println(s);
        }

        int[] iArr = {-2, 5, 7, -3, 11};
        // Ü: Elemente ausgeben
        for (int i: iArr) {
            System.out.println(i);
        }

        // Ü: Array mit drei Wahrheitswerten erzeugen und ausgeben
        boolean[] bArr = {true, false, true};
        for (boolean b: bArr) {
            System.out.println(b);
        }

        // Traditionelle for-Schleife, Index bekannt, Änderungen im Array möglich
        for (int i=0; i<bArr.length; i++) {
            System.out.printf("%d. %b %n", i + 1, bArr[i]);
        }

        // Ü: Ausgabe der Elemente von iArr mit Index
        for (int i=0; i<iArr.length; i++) {
            System.out.printf("%d) %d %n", i + 1, iArr[i]);
            iArr[i] *= 10;
            System.out.printf("%d) %d %n", i + 1, iArr[i]);
        }


    }
}

