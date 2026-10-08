public class StringMethoden {
    public static void main(String[] args){
        String s = "12434";
        System.out.println(s);
        s = s.replace('4', '5');
        System.out.println(s);
        int i = s.indexOf('1');
        System.out.println(i);

        System.out.println("234".replace('2', '3'));
        System.out.println("145".indexOf('1'));
        System.out.println("145".indexOf('6'));
        System.out.println("145".indexOf('4'));
        System.out.println("hallo".indexOf('a'));

        // Wieso kommt bei dieser "Rechnung" 107 raus?
        // Wieso kann ich int mit char verrechnen?
        int x = 'h' + 3;
        // Direktes Casting (int)
        int direktesCastingBeispiel = (int)3.4;
        // Indirektes Casting
        int zahlenwertVon = 'G';
        System.out.println(x);
        System.out.println(direktesCastingBeispiel);
        System.out.println(zahlenwertVon);

        // Ungerichtete Assoziationen Frage wird auch geklärt :)
        // Aus der Planungssicht, ganz am Anfang beim Entwurf vom UML Diagramm
        // Erstelle mir ein Konzept von einer Autowerkstatt
        // Die Assoziation von Kunde und Auto ist noch nicht genau bekannt
        // Kunde -- Auto
    }
}
