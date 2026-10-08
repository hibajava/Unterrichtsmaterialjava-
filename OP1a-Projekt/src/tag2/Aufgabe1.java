package tag2;


/*
Mehzeiliger komentar (wie bei c)
Zu Beginn des Programmes wird der Variable a der Wert 1 zugewiesen.
Direkt im Anschluss wird dieser Wert ausgegeben.
Daraufhin wird der Wert von a um 1 erhöht und erneut ausgegeben.
Erneut wird a um 1 erhöht und sein Wert anschließend ausgegeben usw
Dies wiederholt sich bis a den Wert 5 hat. Dann endet das Programm.
*/

// camelcase für Klassennamen
public class Aufgabe1 {
    static void main(String[] args) {
        int a = 1;  // variablen erhalten ihren Typ, int steht für ganz zahlen

        for( int i=1; i<=5;i++)
            // Ausgabe auf der konsole
            System.out.println("a= " + i);// Abkürzung soutv
      
    }
}
