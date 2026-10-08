package tag2;
/*
 Variable x soll Wert 3.75 erhalten.
Dann Oberfläche und Volumen des Kubus berechnen und in die Variablen oberflaeche und volumen schreiben.
Ausgabe soll layoutmäßig so gestaltet sein:

*****************************************
*       Ergebnisse für Kantenlänge x    *
*****************************************

Oberfläche: oberflaeche
Volumen: volumen
*/

public class Aufgabe4 {
    static void main(String[] args) {
        double x = 3.75;

        System.out.println("********************");
        System.out.println("*      Ergebnisse für Kantenlänge" + x + " " + "*");
        System.out.println("********************");

        double oberflaeche = 6 * x * x;
        double volumen = x*x*x;

        System.out.println("Oberflaeche: " + oberflaeche);
        System.out.println("Volumen: " + volumen);
    }
}
