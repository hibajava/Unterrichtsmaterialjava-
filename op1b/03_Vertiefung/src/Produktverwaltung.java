/* Level 1
 Schreiben Sie bitte ein Java-Programm, in dem ...
 - eine Klasse 'Produkt' definiert wird
   + Klassenmember sind:
     - name (String, private)
        + normaler Getter und Setter
     - mindestpreis (Integer, private)
        + kein Getter, normaler Setter
     - verkaufspreis (Integer, private)
        + normaler Getter; Setter: nur FALLS value>=mindestpreis SONST verkaufspreis=mindestpreis
 - im Main alle obigen "Feature" getestet werden
 - Unterschied zwischen static und nicht-static Methoden herausstellen
*/

public class Produktverwaltung {
    public static void main(String[] args){
        Produkt produkt = new Produkt("Radiergummi", 3, 6);
        // Wir testen hier, ob unsere setter-Methode richtig funktioniert
        // Dafür gehen wir davon aus, dass die getter-Methode bereits geht
        // Die getter-Methode prüfen wir darüber, ob die richtige Ausgabe ausgegeben wird
        System.out.println(produkt.getName());
        // Die setter-Methode prüfen wir, indem wir unser Attribut abändern
        produkt.setName("Superradiergummi");
        // und dieses noch einmal ausgeben:
        System.out.println(produkt.getName());
        // Die getter-Methode prüfen wir darüber, ob die richtige Ausgabe ausgegeben wird
        System.out.println(produkt.getVerkaufspreis());
        // Die setter-Methode prüfen wir, indem wir unser Attribut abändern
        // Wir müssen den Verkaufspreis einmal unter und einmal über den Mindestpreis setzen
        // Und damit prüfen, ob der setter vom Verkaufspreis korrekt arbeitet
        produkt.setVerkaufspreis(2);
        // Hier sollte in der Ausgabe 3 stehen
        System.out.println(produkt.getVerkaufspreis());
        produkt.setVerkaufspreis(15);
        // Hier sollte in der Ausgabe 15 stehen
        System.out.println(produkt.getVerkaufspreis());
        produkt.setVerkaufspreis(3);
        // Hier sollte in der Ausgabe 3 stehen
        System.out.println(produkt.getVerkaufspreis());

        // Wir können jetzt auch den Mindestpreis testen
        produkt.setMindestpreis(15);
        // Prüfen, was passiert mit dem Verkaufspreis, wenn wir den Mindestpreis anders setzen
        produkt.setVerkaufspreis(3);
        // Hier sollte in der Ausgabe 15 stehen
        System.out.println(produkt.getVerkaufspreis());

        System.out.println(produkt.toString());

        System.out.println(produkt.getVerkaufspreisInklMehrwertsteuer());

        // Testen der Mehrwertsteuer:
        System.out.println("Testen der Mehrwertsteuer");
        Produkt produkt2 = new Produkt("Bleistift", 2, 3);
        System.out.println(produkt2.getVerkaufspreisInklMehrwertsteuer());

        // **** STEUERREFORM!!!! ****
        Produkt.setMehrwertsteuer(0.12);

        System.out.println(produkt2.getVerkaufspreisInklMehrwertsteuer());

        Produkt produkt3 = new Produkt("Zeichenblock", 12, 30);
        System.out.println(produkt3.getVerkaufspreisInklMehrwertsteuer());

    }
}
