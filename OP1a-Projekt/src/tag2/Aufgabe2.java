package tag2;

/*
Erstellen Sie eine Variable 'alter' mit dem Wert 10.
Daraufhin wird die String-Variable 'alterString' mit "jung" gefüllt und beides ausgegeben.
Danach wird 'alter' der Wert 80 zugewiesen und 'alterString' mit "alt" belegt und
beides ausgegeben.
 */
public class Aufgabe2 {
    static void main(String[] args) {
        int alter= 10;
        String alterString = "jung";
        System.out.println("alter= " +alter);
        System.out.println("alterString = " + alterString);

        alter = 80;
        alterString= "alt";
        System.out.println("alter= " +alter);
        System.out.println("alterString = " + alterString);
    }



}
