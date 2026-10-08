package tag3;
/*Recherchieren, wie man eine char-Variable mit einem Unicodezeichen belegt,
 z.B. Copyright-Symbol.
Kann man Emojis in Strings haben? */
public class Aufgabe2 {

    static void main() {
       char ch = '\u00A9';
        System.out.println("ch = " + ch);

        ch = '\u26A1';
        System.out.println("ch = " + ch);

        ch = '\uuA6d3';
        System.out.println("ch = " + ch);

        String s = "Beispiel für Inicode: \u00A9";
        System.out.println("s= " + s);

        s="\u2764\uFE0F";
        System.out.println("s = " + s);


    }
}
